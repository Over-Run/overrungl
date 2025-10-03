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
import overrungl.util.MemoryStack;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

import static overrungl.internal.RuntimeHelper.*;

/**
 * The OpenAL binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class AL {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_NONE = 0;
    public static final int AL_FALSE = 0;
    public static final int AL_TRUE = 1;
    public static final int AL_SOURCE_RELATIVE = 0x202;
    public static final int AL_CONE_INNER_ANGLE = 0x1001;
    public static final int AL_CONE_OUTER_ANGLE = 0x1002;
    public static final int AL_PITCH = 0x1003;
    public static final int AL_POSITION = 0x1004;
    public static final int AL_DIRECTION = 0x1005;
    public static final int AL_VELOCITY = 0x1006;
    public static final int AL_LOOPING = 0x1007;
    public static final int AL_BUFFER = 0x1009;
    public static final int AL_GAIN = 0x100A;
    public static final int AL_MIN_GAIN = 0x100D;
    public static final int AL_MAX_GAIN = 0x100E;
    public static final int AL_ORIENTATION = 0x100F;
    public static final int AL_SOURCE_STATE = 0x1010;
    public static final int AL_INITIAL = 0x1011;
    public static final int AL_PLAYING = 0x1012;
    public static final int AL_PAUSED = 0x1013;
    public static final int AL_STOPPED = 0x1014;
    public static final int AL_BUFFERS_QUEUED = 0x1015;
    public static final int AL_BUFFERS_PROCESSED = 0x1016;
    public static final int AL_REFERENCE_DISTANCE = 0x1020;
    public static final int AL_ROLLOFF_FACTOR = 0x1021;
    public static final int AL_CONE_OUTER_GAIN = 0x1022;
    public static final int AL_MAX_DISTANCE = 0x1023;
    public static final int AL_SEC_OFFSET = 0x1024;
    public static final int AL_SAMPLE_OFFSET = 0x1025;
    public static final int AL_BYTE_OFFSET = 0x1026;
    public static final int AL_SOURCE_TYPE = 0x1027;
    public static final int AL_STATIC = 0x1028;
    public static final int AL_STREAMING = 0x1029;
    public static final int AL_UNDETERMINED = 0x1030;
    public static final int AL_FORMAT_MONO8 = 0x1100;
    public static final int AL_FORMAT_MONO16 = 0x1101;
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    public static final int AL_FREQUENCY = 0x2001;
    public static final int AL_BITS = 0x2002;
    public static final int AL_CHANNELS = 0x2003;
    public static final int AL_SIZE = 0x2004;
    public static final int AL_UNUSED = 0x2010;
    public static final int AL_PENDING = 0x2011;
    public static final int AL_PROCESSED = 0x2012;
    public static final int AL_NO_ERROR = 0;
    public static final int AL_INVALID_NAME = 0xA001;
    public static final int AL_INVALID_ENUM = 0xA002;
    public static final int AL_INVALID_VALUE = 0xA003;
    public static final int AL_INVALID_OPERATION = 0xA004;
    public static final int AL_OUT_OF_MEMORY = 0xA005;
    public static final int AL_VENDOR = 0xB001;
    public static final int AL_VERSION = 0xB002;
    public static final int AL_RENDERER = 0xB003;
    public static final int AL_EXTENSIONS = 0xB004;
    public static final int AL_DOPPLER_FACTOR = 0xC000;
    public static final int AL_DOPPLER_VELOCITY = 0xC001;
    public static final int AL_SPEED_OF_SOUND = 0xC003;
    public static final int AL_DISTANCE_MODEL = 0xD000;
    public static final int AL_INVERSE_DISTANCE = 0xD001;
    public static final int AL_INVERSE_DISTANCE_CLAMPED = 0xD002;
    public static final int AL_LINEAR_DISTANCE = 0xD003;
    public static final int AL_LINEAR_DISTANCE_CLAMPED = 0xD004;
    public static final int AL_EXPONENT_DISTANCE = 0xD005;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`alEnable`][#alEnable].
        public static final Supplier<MethodHandle> MH_alEnable = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alDisable`][#alDisable].
        public static final Supplier<MethodHandle> MH_alDisable = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alIsEnabled`][#alIsEnabled].
        public static final Supplier<MethodHandle> MH_alIsEnabled = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        /// The method handle of [`alDopplerFactor`][#alDopplerFactor].
        public static final Supplier<MethodHandle> MH_alDopplerFactor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alDopplerVelocity`][#alDopplerVelocity].
        public static final Supplier<MethodHandle> MH_alDopplerVelocity = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alSpeedOfSound`][#alSpeedOfSound].
        public static final Supplier<MethodHandle> MH_alSpeedOfSound = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alDistanceModel`][#alDistanceModel].
        public static final Supplier<MethodHandle> MH_alDistanceModel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetString`][#alGetString].
        public static final Supplier<MethodHandle> MH_alGetString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetBooleanv`][#alGetBooleanv].
        public static final Supplier<MethodHandle> MH_alGetBooleanv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetIntegerv`][#alGetIntegerv].
        public static final Supplier<MethodHandle> MH_alGetIntegerv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetFloatv`][#alGetFloatv].
        public static final Supplier<MethodHandle> MH_alGetFloatv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetDoublev`][#alGetDoublev].
        public static final Supplier<MethodHandle> MH_alGetDoublev = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBoolean`][#alGetBoolean].
        public static final Supplier<MethodHandle> MH_alGetBoolean = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetInteger`][#alGetInteger].
        public static final Supplier<MethodHandle> MH_alGetInteger = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetFloat`][#alGetFloat].
        public static final Supplier<MethodHandle> MH_alGetFloat = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetDouble`][#alGetDouble].
        public static final Supplier<MethodHandle> MH_alGetDouble = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)));
        /// The method handle of [`alGetError`][#alGetError].
        public static final Supplier<MethodHandle> MH_alGetError = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        /// The method handle of [`alIsExtensionPresent`][#alIsExtensionPresent].
        public static final Supplier<MethodHandle> MH_alIsExtensionPresent = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetProcAddress`][#alGetProcAddress].
        public static final Supplier<MethodHandle> MH_alGetProcAddress = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetEnumValue`][#alGetEnumValue].
        public static final Supplier<MethodHandle> MH_alGetEnumValue = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alListenerf`][#alListenerf].
        public static final Supplier<MethodHandle> MH_alListenerf = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alListener3f`][#alListener3f].
        public static final Supplier<MethodHandle> MH_alListener3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alListenerfv`][#alListenerfv].
        public static final Supplier<MethodHandle> MH_alListenerfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alListeneri`][#alListeneri].
        public static final Supplier<MethodHandle> MH_alListeneri = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alListener3i`][#alListener3i].
        public static final Supplier<MethodHandle> MH_alListener3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alListeneriv`][#alListeneriv].
        public static final Supplier<MethodHandle> MH_alListeneriv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListenerf`][#alGetListenerf].
        public static final Supplier<MethodHandle> MH_alGetListenerf = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListener3f`][#alGetListener3f].
        public static final Supplier<MethodHandle> MH_alGetListener3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListenerfv`][#alGetListenerfv].
        public static final Supplier<MethodHandle> MH_alGetListenerfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListeneri`][#alGetListeneri].
        public static final Supplier<MethodHandle> MH_alGetListeneri = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListener3i`][#alGetListener3i].
        public static final Supplier<MethodHandle> MH_alGetListener3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetListeneriv`][#alGetListeneriv].
        public static final Supplier<MethodHandle> MH_alGetListeneriv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGenSources`][#alGenSources].
        public static final Supplier<MethodHandle> MH_alGenSources = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alDeleteSources`][#alDeleteSources].
        public static final Supplier<MethodHandle> MH_alDeleteSources = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alIsSource`][#alIsSource].
        public static final Supplier<MethodHandle> MH_alIsSource = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourcef`][#alSourcef].
        public static final Supplier<MethodHandle> MH_alSourcef = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alSource3f`][#alSource3f].
        public static final Supplier<MethodHandle> MH_alSource3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alSourcefv`][#alSourcefv].
        public static final Supplier<MethodHandle> MH_alSourcefv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourcei`][#alSourcei].
        public static final Supplier<MethodHandle> MH_alSourcei = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alSource3i`][#alSource3i].
        public static final Supplier<MethodHandle> MH_alSource3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourceiv`][#alSourceiv].
        public static final Supplier<MethodHandle> MH_alSourceiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSourcef`][#alGetSourcef].
        public static final Supplier<MethodHandle> MH_alGetSourcef = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSource3f`][#alGetSource3f].
        public static final Supplier<MethodHandle> MH_alGetSource3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSourcefv`][#alGetSourcefv].
        public static final Supplier<MethodHandle> MH_alGetSourcefv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSourcei`][#alGetSourcei].
        public static final Supplier<MethodHandle> MH_alGetSourcei = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSource3i`][#alGetSource3i].
        public static final Supplier<MethodHandle> MH_alGetSource3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetSourceiv`][#alGetSourceiv].
        public static final Supplier<MethodHandle> MH_alGetSourceiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourcePlay`][#alSourcePlay].
        public static final Supplier<MethodHandle> MH_alSourcePlay = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourceStop`][#alSourceStop].
        public static final Supplier<MethodHandle> MH_alSourceStop = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourceRewind`][#alSourceRewind].
        public static final Supplier<MethodHandle> MH_alSourceRewind = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourcePause`][#alSourcePause].
        public static final Supplier<MethodHandle> MH_alSourcePause = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        /// The method handle of [`alSourcePlayv`][#alSourcePlayv].
        public static final Supplier<MethodHandle> MH_alSourcePlayv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourceStopv`][#alSourceStopv].
        public static final Supplier<MethodHandle> MH_alSourceStopv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourceRewindv`][#alSourceRewindv].
        public static final Supplier<MethodHandle> MH_alSourceRewindv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourcePausev`][#alSourcePausev].
        public static final Supplier<MethodHandle> MH_alSourcePausev = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourceQueueBuffers`][#alSourceQueueBuffers].
        public static final Supplier<MethodHandle> MH_alSourceQueueBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alSourceUnqueueBuffers`][#alSourceUnqueueBuffers].
        public static final Supplier<MethodHandle> MH_alSourceUnqueueBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGenBuffers`][#alGenBuffers].
        public static final Supplier<MethodHandle> MH_alGenBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alDeleteBuffers`][#alDeleteBuffers].
        public static final Supplier<MethodHandle> MH_alDeleteBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alIsBuffer`][#alIsBuffer].
        public static final Supplier<MethodHandle> MH_alIsBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        /// The method handle of [`alBufferData`][#alBufferData].
        public static final Supplier<MethodHandle> MH_alBufferData = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alBufferf`][#alBufferf].
        public static final Supplier<MethodHandle> MH_alBufferf = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alBuffer3f`][#alBuffer3f].
        public static final Supplier<MethodHandle> MH_alBuffer3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`alBufferfv`][#alBufferfv].
        public static final Supplier<MethodHandle> MH_alBufferfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alBufferi`][#alBufferi].
        public static final Supplier<MethodHandle> MH_alBufferi = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alBuffer3i`][#alBuffer3i].
        public static final Supplier<MethodHandle> MH_alBuffer3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`alBufferiv`][#alBufferiv].
        public static final Supplier<MethodHandle> MH_alBufferiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBufferf`][#alGetBufferf].
        public static final Supplier<MethodHandle> MH_alGetBufferf = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBuffer3f`][#alGetBuffer3f].
        public static final Supplier<MethodHandle> MH_alGetBuffer3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBufferfv`][#alGetBufferfv].
        public static final Supplier<MethodHandle> MH_alGetBufferfv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBufferi`][#alGetBufferi].
        public static final Supplier<MethodHandle> MH_alGetBufferi = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBuffer3i`][#alGetBuffer3i].
        public static final Supplier<MethodHandle> MH_alGetBuffer3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`alGetBufferiv`][#alGetBufferiv].
        public static final Supplier<MethodHandle> MH_alGetBufferiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The function address of [`alEnable`][#alEnable].
        public final MemorySegment PFN_alEnable;
        /// The function address of [`alDisable`][#alDisable].
        public final MemorySegment PFN_alDisable;
        /// The function address of [`alIsEnabled`][#alIsEnabled].
        public final MemorySegment PFN_alIsEnabled;
        /// The function address of [`alDopplerFactor`][#alDopplerFactor].
        public final MemorySegment PFN_alDopplerFactor;
        /// The function address of [`alDopplerVelocity`][#alDopplerVelocity].
        public final MemorySegment PFN_alDopplerVelocity;
        /// The function address of [`alSpeedOfSound`][#alSpeedOfSound].
        public final MemorySegment PFN_alSpeedOfSound;
        /// The function address of [`alDistanceModel`][#alDistanceModel].
        public final MemorySegment PFN_alDistanceModel;
        /// The function address of [`alGetString`][#alGetString].
        public final MemorySegment PFN_alGetString;
        /// The function address of [`alGetBooleanv`][#alGetBooleanv].
        public final MemorySegment PFN_alGetBooleanv;
        /// The function address of [`alGetIntegerv`][#alGetIntegerv].
        public final MemorySegment PFN_alGetIntegerv;
        /// The function address of [`alGetFloatv`][#alGetFloatv].
        public final MemorySegment PFN_alGetFloatv;
        /// The function address of [`alGetDoublev`][#alGetDoublev].
        public final MemorySegment PFN_alGetDoublev;
        /// The function address of [`alGetBoolean`][#alGetBoolean].
        public final MemorySegment PFN_alGetBoolean;
        /// The function address of [`alGetInteger`][#alGetInteger].
        public final MemorySegment PFN_alGetInteger;
        /// The function address of [`alGetFloat`][#alGetFloat].
        public final MemorySegment PFN_alGetFloat;
        /// The function address of [`alGetDouble`][#alGetDouble].
        public final MemorySegment PFN_alGetDouble;
        /// The function address of [`alGetError`][#alGetError].
        public final MemorySegment PFN_alGetError;
        /// The function address of [`alIsExtensionPresent`][#alIsExtensionPresent].
        public final MemorySegment PFN_alIsExtensionPresent;
        /// The function address of [`alGetProcAddress`][#alGetProcAddress].
        public final MemorySegment PFN_alGetProcAddress;
        /// The function address of [`alGetEnumValue`][#alGetEnumValue].
        public final MemorySegment PFN_alGetEnumValue;
        /// The function address of [`alListenerf`][#alListenerf].
        public final MemorySegment PFN_alListenerf;
        /// The function address of [`alListener3f`][#alListener3f].
        public final MemorySegment PFN_alListener3f;
        /// The function address of [`alListenerfv`][#alListenerfv].
        public final MemorySegment PFN_alListenerfv;
        /// The function address of [`alListeneri`][#alListeneri].
        public final MemorySegment PFN_alListeneri;
        /// The function address of [`alListener3i`][#alListener3i].
        public final MemorySegment PFN_alListener3i;
        /// The function address of [`alListeneriv`][#alListeneriv].
        public final MemorySegment PFN_alListeneriv;
        /// The function address of [`alGetListenerf`][#alGetListenerf].
        public final MemorySegment PFN_alGetListenerf;
        /// The function address of [`alGetListener3f`][#alGetListener3f].
        public final MemorySegment PFN_alGetListener3f;
        /// The function address of [`alGetListenerfv`][#alGetListenerfv].
        public final MemorySegment PFN_alGetListenerfv;
        /// The function address of [`alGetListeneri`][#alGetListeneri].
        public final MemorySegment PFN_alGetListeneri;
        /// The function address of [`alGetListener3i`][#alGetListener3i].
        public final MemorySegment PFN_alGetListener3i;
        /// The function address of [`alGetListeneriv`][#alGetListeneriv].
        public final MemorySegment PFN_alGetListeneriv;
        /// The function address of [`alGenSources`][#alGenSources].
        public final MemorySegment PFN_alGenSources;
        /// The function address of [`alDeleteSources`][#alDeleteSources].
        public final MemorySegment PFN_alDeleteSources;
        /// The function address of [`alIsSource`][#alIsSource].
        public final MemorySegment PFN_alIsSource;
        /// The function address of [`alSourcef`][#alSourcef].
        public final MemorySegment PFN_alSourcef;
        /// The function address of [`alSource3f`][#alSource3f].
        public final MemorySegment PFN_alSource3f;
        /// The function address of [`alSourcefv`][#alSourcefv].
        public final MemorySegment PFN_alSourcefv;
        /// The function address of [`alSourcei`][#alSourcei].
        public final MemorySegment PFN_alSourcei;
        /// The function address of [`alSource3i`][#alSource3i].
        public final MemorySegment PFN_alSource3i;
        /// The function address of [`alSourceiv`][#alSourceiv].
        public final MemorySegment PFN_alSourceiv;
        /// The function address of [`alGetSourcef`][#alGetSourcef].
        public final MemorySegment PFN_alGetSourcef;
        /// The function address of [`alGetSource3f`][#alGetSource3f].
        public final MemorySegment PFN_alGetSource3f;
        /// The function address of [`alGetSourcefv`][#alGetSourcefv].
        public final MemorySegment PFN_alGetSourcefv;
        /// The function address of [`alGetSourcei`][#alGetSourcei].
        public final MemorySegment PFN_alGetSourcei;
        /// The function address of [`alGetSource3i`][#alGetSource3i].
        public final MemorySegment PFN_alGetSource3i;
        /// The function address of [`alGetSourceiv`][#alGetSourceiv].
        public final MemorySegment PFN_alGetSourceiv;
        /// The function address of [`alSourcePlay`][#alSourcePlay].
        public final MemorySegment PFN_alSourcePlay;
        /// The function address of [`alSourceStop`][#alSourceStop].
        public final MemorySegment PFN_alSourceStop;
        /// The function address of [`alSourceRewind`][#alSourceRewind].
        public final MemorySegment PFN_alSourceRewind;
        /// The function address of [`alSourcePause`][#alSourcePause].
        public final MemorySegment PFN_alSourcePause;
        /// The function address of [`alSourcePlayv`][#alSourcePlayv].
        public final MemorySegment PFN_alSourcePlayv;
        /// The function address of [`alSourceStopv`][#alSourceStopv].
        public final MemorySegment PFN_alSourceStopv;
        /// The function address of [`alSourceRewindv`][#alSourceRewindv].
        public final MemorySegment PFN_alSourceRewindv;
        /// The function address of [`alSourcePausev`][#alSourcePausev].
        public final MemorySegment PFN_alSourcePausev;
        /// The function address of [`alSourceQueueBuffers`][#alSourceQueueBuffers].
        public final MemorySegment PFN_alSourceQueueBuffers;
        /// The function address of [`alSourceUnqueueBuffers`][#alSourceUnqueueBuffers].
        public final MemorySegment PFN_alSourceUnqueueBuffers;
        /// The function address of [`alGenBuffers`][#alGenBuffers].
        public final MemorySegment PFN_alGenBuffers;
        /// The function address of [`alDeleteBuffers`][#alDeleteBuffers].
        public final MemorySegment PFN_alDeleteBuffers;
        /// The function address of [`alIsBuffer`][#alIsBuffer].
        public final MemorySegment PFN_alIsBuffer;
        /// The function address of [`alBufferData`][#alBufferData].
        public final MemorySegment PFN_alBufferData;
        /// The function address of [`alBufferf`][#alBufferf].
        public final MemorySegment PFN_alBufferf;
        /// The function address of [`alBuffer3f`][#alBuffer3f].
        public final MemorySegment PFN_alBuffer3f;
        /// The function address of [`alBufferfv`][#alBufferfv].
        public final MemorySegment PFN_alBufferfv;
        /// The function address of [`alBufferi`][#alBufferi].
        public final MemorySegment PFN_alBufferi;
        /// The function address of [`alBuffer3i`][#alBuffer3i].
        public final MemorySegment PFN_alBuffer3i;
        /// The function address of [`alBufferiv`][#alBufferiv].
        public final MemorySegment PFN_alBufferiv;
        /// The function address of [`alGetBufferf`][#alGetBufferf].
        public final MemorySegment PFN_alGetBufferf;
        /// The function address of [`alGetBuffer3f`][#alGetBuffer3f].
        public final MemorySegment PFN_alGetBuffer3f;
        /// The function address of [`alGetBufferfv`][#alGetBufferfv].
        public final MemorySegment PFN_alGetBufferfv;
        /// The function address of [`alGetBufferi`][#alGetBufferi].
        public final MemorySegment PFN_alGetBufferi;
        /// The function address of [`alGetBuffer3i`][#alGetBuffer3i].
        public final MemorySegment PFN_alGetBuffer3i;
        /// The function address of [`alGetBufferiv`][#alGetBufferiv].
        public final MemorySegment PFN_alGetBufferiv;

        private Handles() {
            var _lookup = OpenALLibrary.lookup();
            PFN_alEnable = _lookup.findOrThrow("alEnable");
            PFN_alDisable = _lookup.findOrThrow("alDisable");
            PFN_alIsEnabled = _lookup.findOrThrow("alIsEnabled");
            PFN_alDopplerFactor = _lookup.findOrThrow("alDopplerFactor");
            PFN_alDopplerVelocity = _lookup.findOrThrow("alDopplerVelocity");
            PFN_alSpeedOfSound = _lookup.findOrThrow("alSpeedOfSound");
            PFN_alDistanceModel = _lookup.findOrThrow("alDistanceModel");
            PFN_alGetString = _lookup.findOrThrow("alGetString");
            PFN_alGetBooleanv = _lookup.findOrThrow("alGetBooleanv");
            PFN_alGetIntegerv = _lookup.findOrThrow("alGetIntegerv");
            PFN_alGetFloatv = _lookup.findOrThrow("alGetFloatv");
            PFN_alGetDoublev = _lookup.findOrThrow("alGetDoublev");
            PFN_alGetBoolean = _lookup.findOrThrow("alGetBoolean");
            PFN_alGetInteger = _lookup.findOrThrow("alGetInteger");
            PFN_alGetFloat = _lookup.findOrThrow("alGetFloat");
            PFN_alGetDouble = _lookup.findOrThrow("alGetDouble");
            PFN_alGetError = _lookup.findOrThrow("alGetError");
            PFN_alIsExtensionPresent = _lookup.findOrThrow("alIsExtensionPresent");
            PFN_alGetProcAddress = _lookup.findOrThrow("alGetProcAddress");
            PFN_alGetEnumValue = _lookup.findOrThrow("alGetEnumValue");
            PFN_alListenerf = _lookup.findOrThrow("alListenerf");
            PFN_alListener3f = _lookup.findOrThrow("alListener3f");
            PFN_alListenerfv = _lookup.findOrThrow("alListenerfv");
            PFN_alListeneri = _lookup.findOrThrow("alListeneri");
            PFN_alListener3i = _lookup.findOrThrow("alListener3i");
            PFN_alListeneriv = _lookup.findOrThrow("alListeneriv");
            PFN_alGetListenerf = _lookup.findOrThrow("alGetListenerf");
            PFN_alGetListener3f = _lookup.findOrThrow("alGetListener3f");
            PFN_alGetListenerfv = _lookup.findOrThrow("alGetListenerfv");
            PFN_alGetListeneri = _lookup.findOrThrow("alGetListeneri");
            PFN_alGetListener3i = _lookup.findOrThrow("alGetListener3i");
            PFN_alGetListeneriv = _lookup.findOrThrow("alGetListeneriv");
            PFN_alGenSources = _lookup.findOrThrow("alGenSources");
            PFN_alDeleteSources = _lookup.findOrThrow("alDeleteSources");
            PFN_alIsSource = _lookup.findOrThrow("alIsSource");
            PFN_alSourcef = _lookup.findOrThrow("alSourcef");
            PFN_alSource3f = _lookup.findOrThrow("alSource3f");
            PFN_alSourcefv = _lookup.findOrThrow("alSourcefv");
            PFN_alSourcei = _lookup.findOrThrow("alSourcei");
            PFN_alSource3i = _lookup.findOrThrow("alSource3i");
            PFN_alSourceiv = _lookup.findOrThrow("alSourceiv");
            PFN_alGetSourcef = _lookup.findOrThrow("alGetSourcef");
            PFN_alGetSource3f = _lookup.findOrThrow("alGetSource3f");
            PFN_alGetSourcefv = _lookup.findOrThrow("alGetSourcefv");
            PFN_alGetSourcei = _lookup.findOrThrow("alGetSourcei");
            PFN_alGetSource3i = _lookup.findOrThrow("alGetSource3i");
            PFN_alGetSourceiv = _lookup.findOrThrow("alGetSourceiv");
            PFN_alSourcePlay = _lookup.findOrThrow("alSourcePlay");
            PFN_alSourceStop = _lookup.findOrThrow("alSourceStop");
            PFN_alSourceRewind = _lookup.findOrThrow("alSourceRewind");
            PFN_alSourcePause = _lookup.findOrThrow("alSourcePause");
            PFN_alSourcePlayv = _lookup.findOrThrow("alSourcePlayv");
            PFN_alSourceStopv = _lookup.findOrThrow("alSourceStopv");
            PFN_alSourceRewindv = _lookup.findOrThrow("alSourceRewindv");
            PFN_alSourcePausev = _lookup.findOrThrow("alSourcePausev");
            PFN_alSourceQueueBuffers = _lookup.findOrThrow("alSourceQueueBuffers");
            PFN_alSourceUnqueueBuffers = _lookup.findOrThrow("alSourceUnqueueBuffers");
            PFN_alGenBuffers = _lookup.findOrThrow("alGenBuffers");
            PFN_alDeleteBuffers = _lookup.findOrThrow("alDeleteBuffers");
            PFN_alIsBuffer = _lookup.findOrThrow("alIsBuffer");
            PFN_alBufferData = _lookup.findOrThrow("alBufferData");
            PFN_alBufferf = _lookup.findOrThrow("alBufferf");
            PFN_alBuffer3f = _lookup.findOrThrow("alBuffer3f");
            PFN_alBufferfv = _lookup.findOrThrow("alBufferfv");
            PFN_alBufferi = _lookup.findOrThrow("alBufferi");
            PFN_alBuffer3i = _lookup.findOrThrow("alBuffer3i");
            PFN_alBufferiv = _lookup.findOrThrow("alBufferiv");
            PFN_alGetBufferf = _lookup.findOrThrow("alGetBufferf");
            PFN_alGetBuffer3f = _lookup.findOrThrow("alGetBuffer3f");
            PFN_alGetBufferfv = _lookup.findOrThrow("alGetBufferfv");
            PFN_alGetBufferi = _lookup.findOrThrow("alGetBufferi");
            PFN_alGetBuffer3i = _lookup.findOrThrow("alGetBuffer3i");
            PFN_alGetBufferiv = _lookup.findOrThrow("alGetBufferiv");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `alEnable`.
    /// ```
    /// void alEnable((int) ALenum capability);
    /// ```
    public static void alEnable(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEnable", capability); }
        Handles.MH_alEnable.get().invokeExact(Handles.get().PFN_alEnable, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    /// Invokes `alDisable`.
    /// ```
    /// void alDisable((int) ALenum capability);
    /// ```
    public static void alDisable(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDisable", capability); }
        Handles.MH_alDisable.get().invokeExact(Handles.get().PFN_alDisable, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    /// Invokes `alIsEnabled`.
    /// ```
    /// ALboolean alIsEnabled((int) ALenum capability);
    /// ```
    public static boolean alIsEnabled(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsEnabled", capability); }
        return (((byte) Handles.MH_alIsEnabled.get().invokeExact(Handles.get().PFN_alIsEnabled, capability)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    /// Invokes `alDopplerFactor`.
    /// ```
    /// void alDopplerFactor((float) ALfloat value);
    /// ```
    public static void alDopplerFactor(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDopplerFactor", value); }
        Handles.MH_alDopplerFactor.get().invokeExact(Handles.get().PFN_alDopplerFactor, value); }
        catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    /// Invokes `alDopplerVelocity`.
    /// ```
    /// void alDopplerVelocity((float) ALfloat value);
    /// ```
    public static void alDopplerVelocity(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDopplerVelocity", value); }
        Handles.MH_alDopplerVelocity.get().invokeExact(Handles.get().PFN_alDopplerVelocity, value); }
        catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    /// Invokes `alSpeedOfSound`.
    /// ```
    /// void alSpeedOfSound((float) ALfloat value);
    /// ```
    public static void alSpeedOfSound(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSpeedOfSound", value); }
        Handles.MH_alSpeedOfSound.get().invokeExact(Handles.get().PFN_alSpeedOfSound, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    /// Invokes `alDistanceModel`.
    /// ```
    /// void alDistanceModel((int) ALenum distanceModel);
    /// ```
    public static void alDistanceModel(int distanceModel) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDistanceModel", distanceModel); }
        Handles.MH_alDistanceModel.get().invokeExact(Handles.get().PFN_alDistanceModel, distanceModel); }
        catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    /// Invokes `alGetString`.
    /// ```
    /// const ALchar* alGetString((int) ALenum param);
    /// ```
    public static @NonNull MemorySegment alGetString(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetString", param); }
        return (MemorySegment) Handles.MH_alGetString.get().invokeExact(Handles.get().PFN_alGetString, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    /// Invokes `alGetBooleanv`.
    /// ```
    /// void alGetBooleanv((int) ALenum param, ALboolean* values);
    /// ```
    public static void alGetBooleanv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBooleanv", param, values); }
        Handles.MH_alGetBooleanv.get().invokeExact(Handles.get().PFN_alGetBooleanv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    /// Invokes `alGetIntegerv`.
    /// ```
    /// void alGetIntegerv((int) ALenum param, ALint* values);
    /// ```
    public static void alGetIntegerv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetIntegerv", param, values); }
        Handles.MH_alGetIntegerv.get().invokeExact(Handles.get().PFN_alGetIntegerv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    /// Invokes `alGetFloatv`.
    /// ```
    /// void alGetFloatv((int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetFloatv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloatv", param, values); }
        Handles.MH_alGetFloatv.get().invokeExact(Handles.get().PFN_alGetFloatv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    /// Invokes `alGetDoublev`.
    /// ```
    /// void alGetDoublev((int) ALenum param, ALdouble* values);
    /// ```
    public static void alGetDoublev(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDoublev", param, values); }
        Handles.MH_alGetDoublev.get().invokeExact(Handles.get().PFN_alGetDoublev, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    /// Invokes `alGetBoolean`.
    /// ```
    /// ALboolean alGetBoolean((int) ALenum param);
    /// ```
    public static boolean alGetBoolean(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBoolean", param); }
        return (((byte) Handles.MH_alGetBoolean.get().invokeExact(Handles.get().PFN_alGetBoolean, param)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    /// Invokes `alGetInteger`.
    /// ```
    /// (int) ALint alGetInteger((int) ALenum param);
    /// ```
    public static int alGetInteger(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetInteger", param); }
        return (int) Handles.MH_alGetInteger.get().invokeExact(Handles.get().PFN_alGetInteger, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    /// Invokes `alGetFloat`.
    /// ```
    /// (float) ALfloat alGetFloat((int) ALenum param);
    /// ```
    public static float alGetFloat(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloat", param); }
        return (float) Handles.MH_alGetFloat.get().invokeExact(Handles.get().PFN_alGetFloat, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    /// Invokes `alGetDouble`.
    /// ```
    /// (double) ALdouble alGetDouble((int) ALenum param);
    /// ```
    public static double alGetDouble(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDouble", param); }
        return (double) Handles.MH_alGetDouble.get().invokeExact(Handles.get().PFN_alGetDouble, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    /// Invokes `alGetError`.
    /// ```
    /// (int) ALenum alGetError();
    /// ```
    public static int alGetError() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetError"); }
        return (int) Handles.MH_alGetError.get().invokeExact(Handles.get().PFN_alGetError); }
        catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    /// Invokes `alIsExtensionPresent`.
    /// ```
    /// ALboolean alIsExtensionPresent(const ALchar* extname);
    /// ```
    public static boolean alIsExtensionPresent(@NonNull MemorySegment extname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsExtensionPresent", extname); }
        return (((byte) Handles.MH_alIsExtensionPresent.get().invokeExact(Handles.get().PFN_alIsExtensionPresent, extname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    /// Invokes `alGetProcAddress`.
    /// ```
    /// void* alGetProcAddress(const ALchar* fname);
    /// ```
    public static @NonNull MemorySegment alGetProcAddress(@NonNull MemorySegment fname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetProcAddress", fname); }
        return (MemorySegment) Handles.MH_alGetProcAddress.get().invokeExact(Handles.get().PFN_alGetProcAddress, fname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    /// Invokes `alGetEnumValue`.
    /// ```
    /// (int) ALenum alGetEnumValue(const ALchar* ename);
    /// ```
    public static int alGetEnumValue(@NonNull MemorySegment ename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEnumValue", ename); }
        return (int) Handles.MH_alGetEnumValue.get().invokeExact(Handles.get().PFN_alGetEnumValue, ename); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    /// Invokes `alListenerf`.
    /// ```
    /// void alListenerf((int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alListenerf(int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerf", param, value); }
        Handles.MH_alListenerf.get().invokeExact(Handles.get().PFN_alListenerf, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    /// Invokes `alListener3f`.
    /// ```
    /// void alListener3f((int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alListener3f(int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3f", param, value1, value2, value3); }
        Handles.MH_alListener3f.get().invokeExact(Handles.get().PFN_alListener3f, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    /// Invokes `alListenerfv`.
    /// ```
    /// void alListenerfv((int) ALenum param, const ALfloat* values);
    /// ```
    public static void alListenerfv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerfv", param, values); }
        Handles.MH_alListenerfv.get().invokeExact(Handles.get().PFN_alListenerfv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    /// Invokes `alListeneri`.
    /// ```
    /// void alListeneri((int) ALenum param, (int) ALint value);
    /// ```
    public static void alListeneri(int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListeneri", param, value); }
        Handles.MH_alListeneri.get().invokeExact(Handles.get().PFN_alListeneri, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    /// Invokes `alListener3i`.
    /// ```
    /// void alListener3i((int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alListener3i(int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3i", param, value1, value2, value3); }
        Handles.MH_alListener3i.get().invokeExact(Handles.get().PFN_alListener3i, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    /// Invokes `alListeneriv`.
    /// ```
    /// void alListeneriv((int) ALenum param, const ALint* values);
    /// ```
    public static void alListeneriv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListeneriv", param, values); }
        Handles.MH_alListeneriv.get().invokeExact(Handles.get().PFN_alListeneriv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    /// Invokes `alGetListenerf`.
    /// ```
    /// void alGetListenerf((int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetListenerf(int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerf", param, value); }
        Handles.MH_alGetListenerf.get().invokeExact(Handles.get().PFN_alGetListenerf, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    /// Invokes `alGetListener3f`.
    /// ```
    /// void alGetListener3f((int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetListener3f(int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3f", param, value1, value2, value3); }
        Handles.MH_alGetListener3f.get().invokeExact(Handles.get().PFN_alGetListener3f, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    /// Invokes `alGetListenerfv`.
    /// ```
    /// void alGetListenerfv((int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetListenerfv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerfv", param, values); }
        Handles.MH_alGetListenerfv.get().invokeExact(Handles.get().PFN_alGetListenerfv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    /// Invokes `alGetListeneri`.
    /// ```
    /// void alGetListeneri((int) ALenum param, ALint* value);
    /// ```
    public static void alGetListeneri(int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListeneri", param, value); }
        Handles.MH_alGetListeneri.get().invokeExact(Handles.get().PFN_alGetListeneri, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    /// Invokes `alGetListener3i`.
    /// ```
    /// void alGetListener3i((int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetListener3i(int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3i", param, value1, value2, value3); }
        Handles.MH_alGetListener3i.get().invokeExact(Handles.get().PFN_alGetListener3i, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    /// Invokes `alGetListeneriv`.
    /// ```
    /// void alGetListeneriv((int) ALenum param, ALint* values);
    /// ```
    public static void alGetListeneriv(int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListeneriv", param, values); }
        Handles.MH_alGetListeneriv.get().invokeExact(Handles.get().PFN_alGetListeneriv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    /// Invokes `alGenSources`.
    /// ```
    /// void alGenSources((int) ALsizei n, ALuint* sources);
    /// ```
    public static void alGenSources(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenSources", n, sources); }
        Handles.MH_alGenSources.get().invokeExact(Handles.get().PFN_alGenSources, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    /// Invokes `alDeleteSources`.
    /// ```
    /// void alDeleteSources((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alDeleteSources(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteSources", n, sources); }
        Handles.MH_alDeleteSources.get().invokeExact(Handles.get().PFN_alDeleteSources, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    /// Invokes `alIsSource`.
    /// ```
    /// ALboolean alIsSource((unsigned int) ALuint source);
    /// ```
    public static boolean alIsSource(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsSource", source); }
        return (((byte) Handles.MH_alIsSource.get().invokeExact(Handles.get().PFN_alIsSource, source)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    /// Invokes `alSourcef`.
    /// ```
    /// void alSourcef((unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alSourcef(int source, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcef", source, param, value); }
        Handles.MH_alSourcef.get().invokeExact(Handles.get().PFN_alSourcef, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    /// Invokes `alSource3f`.
    /// ```
    /// void alSource3f((unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alSource3f(int source, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3f", source, param, value1, value2, value3); }
        Handles.MH_alSource3f.get().invokeExact(Handles.get().PFN_alSource3f, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    /// Invokes `alSourcefv`.
    /// ```
    /// void alSourcefv((unsigned int) ALuint source, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alSourcefv(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcefv", source, param, values); }
        Handles.MH_alSourcefv.get().invokeExact(Handles.get().PFN_alSourcefv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    /// Invokes `alSourcei`.
    /// ```
    /// void alSourcei((unsigned int) ALuint source, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alSourcei(int source, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei", source, param, value); }
        Handles.MH_alSourcei.get().invokeExact(Handles.get().PFN_alSourcei, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    /// Invokes `alSource3i`.
    /// ```
    /// void alSource3i((unsigned int) ALuint source, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alSource3i(int source, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3i", source, param, value1, value2, value3); }
        Handles.MH_alSource3i.get().invokeExact(Handles.get().PFN_alSource3i, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    /// Invokes `alSourceiv`.
    /// ```
    /// void alSourceiv((unsigned int) ALuint source, (int) ALenum param, const ALint* values);
    /// ```
    public static void alSourceiv(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceiv", source, param, values); }
        Handles.MH_alSourceiv.get().invokeExact(Handles.get().PFN_alSourceiv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    /// Invokes `alGetSourcef`.
    /// ```
    /// void alGetSourcef((unsigned int) ALuint source, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetSourcef(int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcef", source, param, value); }
        Handles.MH_alGetSourcef.get().invokeExact(Handles.get().PFN_alGetSourcef, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    /// Invokes `alGetSource3f`.
    /// ```
    /// void alGetSource3f((unsigned int) ALuint source, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetSource3f(int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3f", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3f.get().invokeExact(Handles.get().PFN_alGetSource3f, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    /// Invokes `alGetSourcefv`.
    /// ```
    /// void alGetSourcefv((unsigned int) ALuint source, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetSourcefv(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcefv", source, param, values); }
        Handles.MH_alGetSourcefv.get().invokeExact(Handles.get().PFN_alGetSourcefv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    /// Invokes `alGetSourcei`.
    /// ```
    /// void alGetSourcei((unsigned int) ALuint source, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetSourcei(int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei", source, param, value); }
        Handles.MH_alGetSourcei.get().invokeExact(Handles.get().PFN_alGetSourcei, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    /// Invokes `alGetSource3i`.
    /// ```
    /// void alGetSource3i((unsigned int) ALuint source, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetSource3i(int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3i", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3i.get().invokeExact(Handles.get().PFN_alGetSource3i, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    /// Invokes `alGetSourceiv`.
    /// ```
    /// void alGetSourceiv((unsigned int) ALuint source, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetSourceiv(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourceiv", source, param, values); }
        Handles.MH_alGetSourceiv.get().invokeExact(Handles.get().PFN_alGetSourceiv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    /// Invokes `alSourcePlay`.
    /// ```
    /// void alSourcePlay((unsigned int) ALuint source);
    /// ```
    public static void alSourcePlay(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlay", source); }
        Handles.MH_alSourcePlay.get().invokeExact(Handles.get().PFN_alSourcePlay, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    /// Invokes `alSourceStop`.
    /// ```
    /// void alSourceStop((unsigned int) ALuint source);
    /// ```
    public static void alSourceStop(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStop", source); }
        Handles.MH_alSourceStop.get().invokeExact(Handles.get().PFN_alSourceStop, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    /// Invokes `alSourceRewind`.
    /// ```
    /// void alSourceRewind((unsigned int) ALuint source);
    /// ```
    public static void alSourceRewind(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewind", source); }
        Handles.MH_alSourceRewind.get().invokeExact(Handles.get().PFN_alSourceRewind, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    /// Invokes `alSourcePause`.
    /// ```
    /// void alSourcePause((unsigned int) ALuint source);
    /// ```
    public static void alSourcePause(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePause", source); }
        Handles.MH_alSourcePause.get().invokeExact(Handles.get().PFN_alSourcePause, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    /// Invokes `alSourcePlayv`.
    /// ```
    /// void alSourcePlayv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePlayv(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayv", n, sources); }
        Handles.MH_alSourcePlayv.get().invokeExact(Handles.get().PFN_alSourcePlayv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    /// Invokes `alSourceStopv`.
    /// ```
    /// void alSourceStopv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceStopv(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStopv", n, sources); }
        Handles.MH_alSourceStopv.get().invokeExact(Handles.get().PFN_alSourceStopv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    /// Invokes `alSourceRewindv`.
    /// ```
    /// void alSourceRewindv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceRewindv(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewindv", n, sources); }
        Handles.MH_alSourceRewindv.get().invokeExact(Handles.get().PFN_alSourceRewindv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    /// Invokes `alSourcePausev`.
    /// ```
    /// void alSourcePausev((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePausev(int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePausev", n, sources); }
        Handles.MH_alSourcePausev.get().invokeExact(Handles.get().PFN_alSourcePausev, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    /// Invokes `alSourceQueueBuffers`.
    /// ```
    /// void alSourceQueueBuffers((unsigned int) ALuint source, (int) ALsizei nb, const ALuint* buffers);
    /// ```
    public static void alSourceQueueBuffers(int source, int nb, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceQueueBuffers", source, nb, buffers); }
        Handles.MH_alSourceQueueBuffers.get().invokeExact(Handles.get().PFN_alSourceQueueBuffers, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    /// Invokes `alSourceUnqueueBuffers`.
    /// ```
    /// void alSourceUnqueueBuffers((unsigned int) ALuint source, (int) ALsizei nb, ALuint* buffers);
    /// ```
    public static void alSourceUnqueueBuffers(int source, int nb, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceUnqueueBuffers", source, nb, buffers); }
        Handles.MH_alSourceUnqueueBuffers.get().invokeExact(Handles.get().PFN_alSourceUnqueueBuffers, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    /// Invokes `alGenBuffers`.
    /// ```
    /// void alGenBuffers((int) ALsizei n, ALuint* buffers);
    /// ```
    public static void alGenBuffers(int n, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenBuffers", n, buffers); }
        Handles.MH_alGenBuffers.get().invokeExact(Handles.get().PFN_alGenBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    /// Invokes `alDeleteBuffers`.
    /// ```
    /// void alDeleteBuffers((int) ALsizei n, const ALuint* buffers);
    /// ```
    public static void alDeleteBuffers(int n, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteBuffers", n, buffers); }
        Handles.MH_alDeleteBuffers.get().invokeExact(Handles.get().PFN_alDeleteBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    /// Invokes `alIsBuffer`.
    /// ```
    /// ALboolean alIsBuffer((unsigned int) ALuint buffer);
    /// ```
    public static boolean alIsBuffer(int buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsBuffer", buffer); }
        return (((byte) Handles.MH_alIsBuffer.get().invokeExact(Handles.get().PFN_alIsBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    /// Invokes `alBufferData`.
    /// ```
    /// void alBufferData((unsigned int) ALuint buffer, (int) ALenum format, const ALvoid* data, (int) ALsizei size, (int) ALsizei samplerate);
    /// ```
    public static void alBufferData(int buffer, int format, @NonNull MemorySegment data, int size, int samplerate) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferData", buffer, format, data, size, samplerate); }
        Handles.MH_alBufferData.get().invokeExact(Handles.get().PFN_alBufferData, buffer, format, data, size, samplerate); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    /// Invokes `alBufferf`.
    /// ```
    /// void alBufferf((unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alBufferf(int buffer, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferf", buffer, param, value); }
        Handles.MH_alBufferf.get().invokeExact(Handles.get().PFN_alBufferf, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    /// Invokes `alBuffer3f`.
    /// ```
    /// void alBuffer3f((unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alBuffer3f(int buffer, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3f", buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3f.get().invokeExact(Handles.get().PFN_alBuffer3f, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    /// Invokes `alBufferfv`.
    /// ```
    /// void alBufferfv((unsigned int) ALuint buffer, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alBufferfv(int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferfv", buffer, param, values); }
        Handles.MH_alBufferfv.get().invokeExact(Handles.get().PFN_alBufferfv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    /// Invokes `alBufferi`.
    /// ```
    /// void alBufferi((unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alBufferi(int buffer, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferi", buffer, param, value); }
        Handles.MH_alBufferi.get().invokeExact(Handles.get().PFN_alBufferi, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    /// Invokes `alBuffer3i`.
    /// ```
    /// void alBuffer3i((unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alBuffer3i(int buffer, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3i", buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3i.get().invokeExact(Handles.get().PFN_alBuffer3i, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    /// Invokes `alBufferiv`.
    /// ```
    /// void alBufferiv((unsigned int) ALuint buffer, (int) ALenum param, const ALint* values);
    /// ```
    public static void alBufferiv(int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferiv", buffer, param, values); }
        Handles.MH_alBufferiv.get().invokeExact(Handles.get().PFN_alBufferiv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    /// Invokes `alGetBufferf`.
    /// ```
    /// void alGetBufferf((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetBufferf(int buffer, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferf", buffer, param, value); }
        Handles.MH_alGetBufferf.get().invokeExact(Handles.get().PFN_alGetBufferf, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    /// Invokes `alGetBuffer3f`.
    /// ```
    /// void alGetBuffer3f((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetBuffer3f(int buffer, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3f", buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3f.get().invokeExact(Handles.get().PFN_alGetBuffer3f, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    /// Invokes `alGetBufferfv`.
    /// ```
    /// void alGetBufferfv((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetBufferfv(int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferfv", buffer, param, values); }
        Handles.MH_alGetBufferfv.get().invokeExact(Handles.get().PFN_alGetBufferfv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    /// Invokes `alGetBufferi`.
    /// ```
    /// void alGetBufferi((unsigned int) ALuint buffer, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetBufferi(int buffer, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferi", buffer, param, value); }
        Handles.MH_alGetBufferi.get().invokeExact(Handles.get().PFN_alGetBufferi, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    /// Invokes `alGetBuffer3i`.
    /// ```
    /// void alGetBuffer3i((unsigned int) ALuint buffer, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetBuffer3i(int buffer, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3i", buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3i.get().invokeExact(Handles.get().PFN_alGetBuffer3i, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    /// Invokes `alGetBufferiv`.
    /// ```
    /// void alGetBufferiv((unsigned int) ALuint buffer, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetBufferiv(int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferiv", buffer, param, values); }
        Handles.MH_alGetBufferiv.get().invokeExact(Handles.get().PFN_alGetBufferiv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private AL() {
    }

    public static int alGenSources() {
        try (var stack = MemoryStack.pushLocal()) {
            var p = stack.ints(0);
            alGenSources(1, p);
            return p.get(ValueLayout.JAVA_INT, 0);
        }
    }

    public static void alDeleteSources(int source) {
        try (var stack = MemoryStack.pushLocal()) {
            alDeleteSources(1, stack.ints(source));
        }
    }

    public static int alGenBuffers() {
        try (var stack = MemoryStack.pushLocal()) {
            var p = stack.ints(0);
            alGenBuffers(1, p);
            return p.get(ValueLayout.JAVA_INT, 0);
        }
    }

    public static void alDeleteBuffers(int buffer) {
        try (var stack = MemoryStack.pushLocal()) {
            alDeleteBuffers(1, stack.ints(buffer));
        }
    }
}
