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
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.List;

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
    public static final int
        AL_INITIAL = 0x1011,
        AL_PLAYING = 0x1012,
        AL_PAUSED = 0x1013,
        AL_STOPPED = 0x1014;
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
    public static final int
        AL_STATIC = 0x1028,
        AL_STREAMING = 0x1029,
        AL_UNDETERMINED = 0x1030;
    public static final int AL_FORMAT_MONO8 = 0x1100;
    public static final int AL_FORMAT_MONO16 = 0x1101;
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    public static final int AL_FREQUENCY = 0x2001;
    public static final int AL_BITS = 0x2002;
    public static final int AL_CHANNELS = 0x2003;
    public static final int AL_SIZE = 0x2004;
    public static final int
        AL_UNUSED = 0x2010,
        AL_PENDING = 0x2011,
        AL_PROCESSED = 0x2012;
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
    public static final int
        AL_INVERSE_DISTANCE = 0xD001,
        AL_INVERSE_DISTANCE_CLAMPED = 0xD002,
        AL_LINEAR_DISTANCE = 0xD003,
        AL_LINEAR_DISTANCE_CLAMPED = 0xD004,
        AL_EXPONENT_DISTANCE = 0xD005,
        AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alEnable`.
        public static final FunctionDescriptor FD_alEnable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alDisable`.
        public static final FunctionDescriptor FD_alDisable = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alIsEnabled`.
        public static final FunctionDescriptor FD_alIsEnabled = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        /// The function descriptor of `alDopplerFactor`.
        public static final FunctionDescriptor FD_alDopplerFactor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alDopplerVelocity`.
        public static final FunctionDescriptor FD_alDopplerVelocity = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSpeedOfSound`.
        public static final FunctionDescriptor FD_alSpeedOfSound = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alDistanceModel`.
        public static final FunctionDescriptor FD_alDistanceModel = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetString`.
        public static final FunctionDescriptor FD_alGetString = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetBooleanv`.
        public static final FunctionDescriptor FD_alGetBooleanv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetIntegerv`.
        public static final FunctionDescriptor FD_alGetIntegerv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFloatv`.
        public static final FunctionDescriptor FD_alGetFloatv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetDoublev`.
        public static final FunctionDescriptor FD_alGetDoublev = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBoolean`.
        public static final FunctionDescriptor FD_alGetBoolean = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetInteger`.
        public static final FunctionDescriptor FD_alGetInteger = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetFloat`.
        public static final FunctionDescriptor FD_alGetFloat = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetDouble`.
        public static final FunctionDescriptor FD_alGetDouble = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetError`.
        public static final FunctionDescriptor FD_alGetError = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        /// The function descriptor of `alIsExtensionPresent`.
        public static final FunctionDescriptor FD_alIsExtensionPresent = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetProcAddress`.
        public static final FunctionDescriptor FD_alGetProcAddress = FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetEnumValue`.
        public static final FunctionDescriptor FD_alGetEnumValue = FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alListenerf`.
        public static final FunctionDescriptor FD_alListenerf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alListener3f`.
        public static final FunctionDescriptor FD_alListener3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alListenerfv`.
        public static final FunctionDescriptor FD_alListenerfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alListeneri`.
        public static final FunctionDescriptor FD_alListeneri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alListener3i`.
        public static final FunctionDescriptor FD_alListener3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alListeneriv`.
        public static final FunctionDescriptor FD_alListeneriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListenerf`.
        public static final FunctionDescriptor FD_alGetListenerf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListener3f`.
        public static final FunctionDescriptor FD_alGetListener3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListenerfv`.
        public static final FunctionDescriptor FD_alGetListenerfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListeneri`.
        public static final FunctionDescriptor FD_alGetListeneri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListener3i`.
        public static final FunctionDescriptor FD_alGetListener3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListeneriv`.
        public static final FunctionDescriptor FD_alGetListeneriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenSources`.
        public static final FunctionDescriptor FD_alGenSources = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteSources`.
        public static final FunctionDescriptor FD_alDeleteSources = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsSource`.
        public static final FunctionDescriptor FD_alIsSource = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcef`.
        public static final FunctionDescriptor FD_alSourcef = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSource3f`.
        public static final FunctionDescriptor FD_alSource3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSourcefv`.
        public static final FunctionDescriptor FD_alSourcefv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcei`.
        public static final FunctionDescriptor FD_alSourcei = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSource3i`.
        public static final FunctionDescriptor FD_alSource3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceiv`.
        public static final FunctionDescriptor FD_alSourceiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcef`.
        public static final FunctionDescriptor FD_alGetSourcef = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3f`.
        public static final FunctionDescriptor FD_alGetSource3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcefv`.
        public static final FunctionDescriptor FD_alGetSourcefv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcei`.
        public static final FunctionDescriptor FD_alGetSourcei = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3i`.
        public static final FunctionDescriptor FD_alGetSource3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourceiv`.
        public static final FunctionDescriptor FD_alGetSourceiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcePlay`.
        public static final FunctionDescriptor FD_alSourcePlay = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceStop`.
        public static final FunctionDescriptor FD_alSourceStop = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceRewind`.
        public static final FunctionDescriptor FD_alSourceRewind = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcePause`.
        public static final FunctionDescriptor FD_alSourcePause = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcePlayv`.
        public static final FunctionDescriptor FD_alSourcePlayv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceStopv`.
        public static final FunctionDescriptor FD_alSourceStopv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceRewindv`.
        public static final FunctionDescriptor FD_alSourceRewindv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcePausev`.
        public static final FunctionDescriptor FD_alSourcePausev = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceQueueBuffers`.
        public static final FunctionDescriptor FD_alSourceQueueBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceUnqueueBuffers`.
        public static final FunctionDescriptor FD_alSourceUnqueueBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenBuffers`.
        public static final FunctionDescriptor FD_alGenBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteBuffers`.
        public static final FunctionDescriptor FD_alDeleteBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsBuffer`.
        public static final FunctionDescriptor FD_alIsBuffer = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferData`.
        public static final FunctionDescriptor FD_alBufferData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferf`.
        public static final FunctionDescriptor FD_alBufferf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alBuffer3f`.
        public static final FunctionDescriptor FD_alBuffer3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alBufferfv`.
        public static final FunctionDescriptor FD_alBufferfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alBufferi`.
        public static final FunctionDescriptor FD_alBufferi = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBuffer3i`.
        public static final FunctionDescriptor FD_alBuffer3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferiv`.
        public static final FunctionDescriptor FD_alBufferiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferf`.
        public static final FunctionDescriptor FD_alGetBufferf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3f`.
        public static final FunctionDescriptor FD_alGetBuffer3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferfv`.
        public static final FunctionDescriptor FD_alGetBufferfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferi`.
        public static final FunctionDescriptor FD_alGetBufferi = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3i`.
        public static final FunctionDescriptor FD_alGetBuffer3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferiv`.
        public static final FunctionDescriptor FD_alGetBufferiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alEnable,
            FD_alDisable,
            FD_alIsEnabled,
            FD_alDopplerFactor,
            FD_alDopplerVelocity,
            FD_alSpeedOfSound,
            FD_alDistanceModel,
            FD_alGetString,
            FD_alGetBooleanv,
            FD_alGetIntegerv,
            FD_alGetFloatv,
            FD_alGetDoublev,
            FD_alGetBoolean,
            FD_alGetInteger,
            FD_alGetFloat,
            FD_alGetDouble,
            FD_alGetError,
            FD_alIsExtensionPresent,
            FD_alGetProcAddress,
            FD_alGetEnumValue,
            FD_alListenerf,
            FD_alListener3f,
            FD_alListenerfv,
            FD_alListeneri,
            FD_alListener3i,
            FD_alListeneriv,
            FD_alGetListenerf,
            FD_alGetListener3f,
            FD_alGetListenerfv,
            FD_alGetListeneri,
            FD_alGetListener3i,
            FD_alGetListeneriv,
            FD_alGenSources,
            FD_alDeleteSources,
            FD_alIsSource,
            FD_alSourcef,
            FD_alSource3f,
            FD_alSourcefv,
            FD_alSourcei,
            FD_alSource3i,
            FD_alSourceiv,
            FD_alGetSourcef,
            FD_alGetSource3f,
            FD_alGetSourcefv,
            FD_alGetSourcei,
            FD_alGetSource3i,
            FD_alGetSourceiv,
            FD_alSourcePlay,
            FD_alSourceStop,
            FD_alSourceRewind,
            FD_alSourcePause,
            FD_alSourcePlayv,
            FD_alSourceStopv,
            FD_alSourceRewindv,
            FD_alSourcePausev,
            FD_alSourceQueueBuffers,
            FD_alSourceUnqueueBuffers,
            FD_alGenBuffers,
            FD_alDeleteBuffers,
            FD_alIsBuffer,
            FD_alBufferData,
            FD_alBufferf,
            FD_alBuffer3f,
            FD_alBufferfv,
            FD_alBufferi,
            FD_alBuffer3i,
            FD_alBufferiv,
            FD_alGetBufferf,
            FD_alGetBuffer3f,
            FD_alGetBufferfv,
            FD_alGetBufferi,
            FD_alGetBuffer3i,
            FD_alGetBufferiv
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alEnable`.
        public static final MethodHandle MH_alEnable = RuntimeHelper.downcall(ALInternal.lookup(), "alEnable", Descriptors.FD_alEnable);
        /// The method handle of `alDisable`.
        public static final MethodHandle MH_alDisable = RuntimeHelper.downcall(ALInternal.lookup(), "alDisable", Descriptors.FD_alDisable);
        /// The method handle of `alIsEnabled`.
        public static final MethodHandle MH_alIsEnabled = RuntimeHelper.downcall(ALInternal.lookup(), "alIsEnabled", Descriptors.FD_alIsEnabled);
        /// The method handle of `alDopplerFactor`.
        public static final MethodHandle MH_alDopplerFactor = RuntimeHelper.downcall(ALInternal.lookup(), "alDopplerFactor", Descriptors.FD_alDopplerFactor);
        /// The method handle of `alDopplerVelocity`.
        public static final MethodHandle MH_alDopplerVelocity = RuntimeHelper.downcall(ALInternal.lookup(), "alDopplerVelocity", Descriptors.FD_alDopplerVelocity);
        /// The method handle of `alSpeedOfSound`.
        public static final MethodHandle MH_alSpeedOfSound = RuntimeHelper.downcall(ALInternal.lookup(), "alSpeedOfSound", Descriptors.FD_alSpeedOfSound);
        /// The method handle of `alDistanceModel`.
        public static final MethodHandle MH_alDistanceModel = RuntimeHelper.downcall(ALInternal.lookup(), "alDistanceModel", Descriptors.FD_alDistanceModel);
        /// The method handle of `alGetString`.
        public static final MethodHandle MH_alGetString = RuntimeHelper.downcall(ALInternal.lookup(), "alGetString", Descriptors.FD_alGetString);
        /// The method handle of `alGetBooleanv`.
        public static final MethodHandle MH_alGetBooleanv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBooleanv", Descriptors.FD_alGetBooleanv);
        /// The method handle of `alGetIntegerv`.
        public static final MethodHandle MH_alGetIntegerv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetIntegerv", Descriptors.FD_alGetIntegerv);
        /// The method handle of `alGetFloatv`.
        public static final MethodHandle MH_alGetFloatv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetFloatv", Descriptors.FD_alGetFloatv);
        /// The method handle of `alGetDoublev`.
        public static final MethodHandle MH_alGetDoublev = RuntimeHelper.downcall(ALInternal.lookup(), "alGetDoublev", Descriptors.FD_alGetDoublev);
        /// The method handle of `alGetBoolean`.
        public static final MethodHandle MH_alGetBoolean = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBoolean", Descriptors.FD_alGetBoolean);
        /// The method handle of `alGetInteger`.
        public static final MethodHandle MH_alGetInteger = RuntimeHelper.downcall(ALInternal.lookup(), "alGetInteger", Descriptors.FD_alGetInteger);
        /// The method handle of `alGetFloat`.
        public static final MethodHandle MH_alGetFloat = RuntimeHelper.downcall(ALInternal.lookup(), "alGetFloat", Descriptors.FD_alGetFloat);
        /// The method handle of `alGetDouble`.
        public static final MethodHandle MH_alGetDouble = RuntimeHelper.downcall(ALInternal.lookup(), "alGetDouble", Descriptors.FD_alGetDouble);
        /// The method handle of `alGetError`.
        public static final MethodHandle MH_alGetError = RuntimeHelper.downcall(ALInternal.lookup(), "alGetError", Descriptors.FD_alGetError);
        /// The method handle of `alIsExtensionPresent`.
        public static final MethodHandle MH_alIsExtensionPresent = RuntimeHelper.downcall(ALInternal.lookup(), "alIsExtensionPresent", Descriptors.FD_alIsExtensionPresent);
        /// The method handle of `alGetProcAddress`.
        public static final MethodHandle MH_alGetProcAddress = RuntimeHelper.downcall(ALInternal.lookup(), "alGetProcAddress", Descriptors.FD_alGetProcAddress);
        /// The method handle of `alGetEnumValue`.
        public static final MethodHandle MH_alGetEnumValue = RuntimeHelper.downcall(ALInternal.lookup(), "alGetEnumValue", Descriptors.FD_alGetEnumValue);
        /// The method handle of `alListenerf`.
        public static final MethodHandle MH_alListenerf = RuntimeHelper.downcall(ALInternal.lookup(), "alListenerf", Descriptors.FD_alListenerf);
        /// The method handle of `alListener3f`.
        public static final MethodHandle MH_alListener3f = RuntimeHelper.downcall(ALInternal.lookup(), "alListener3f", Descriptors.FD_alListener3f);
        /// The method handle of `alListenerfv`.
        public static final MethodHandle MH_alListenerfv = RuntimeHelper.downcall(ALInternal.lookup(), "alListenerfv", Descriptors.FD_alListenerfv);
        /// The method handle of `alListeneri`.
        public static final MethodHandle MH_alListeneri = RuntimeHelper.downcall(ALInternal.lookup(), "alListeneri", Descriptors.FD_alListeneri);
        /// The method handle of `alListener3i`.
        public static final MethodHandle MH_alListener3i = RuntimeHelper.downcall(ALInternal.lookup(), "alListener3i", Descriptors.FD_alListener3i);
        /// The method handle of `alListeneriv`.
        public static final MethodHandle MH_alListeneriv = RuntimeHelper.downcall(ALInternal.lookup(), "alListeneriv", Descriptors.FD_alListeneriv);
        /// The method handle of `alGetListenerf`.
        public static final MethodHandle MH_alGetListenerf = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListenerf", Descriptors.FD_alGetListenerf);
        /// The method handle of `alGetListener3f`.
        public static final MethodHandle MH_alGetListener3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListener3f", Descriptors.FD_alGetListener3f);
        /// The method handle of `alGetListenerfv`.
        public static final MethodHandle MH_alGetListenerfv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListenerfv", Descriptors.FD_alGetListenerfv);
        /// The method handle of `alGetListeneri`.
        public static final MethodHandle MH_alGetListeneri = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListeneri", Descriptors.FD_alGetListeneri);
        /// The method handle of `alGetListener3i`.
        public static final MethodHandle MH_alGetListener3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListener3i", Descriptors.FD_alGetListener3i);
        /// The method handle of `alGetListeneriv`.
        public static final MethodHandle MH_alGetListeneriv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListeneriv", Descriptors.FD_alGetListeneriv);
        /// The method handle of `alGenSources`.
        public static final MethodHandle MH_alGenSources = RuntimeHelper.downcall(ALInternal.lookup(), "alGenSources", Descriptors.FD_alGenSources);
        /// The method handle of `alDeleteSources`.
        public static final MethodHandle MH_alDeleteSources = RuntimeHelper.downcall(ALInternal.lookup(), "alDeleteSources", Descriptors.FD_alDeleteSources);
        /// The method handle of `alIsSource`.
        public static final MethodHandle MH_alIsSource = RuntimeHelper.downcall(ALInternal.lookup(), "alIsSource", Descriptors.FD_alIsSource);
        /// The method handle of `alSourcef`.
        public static final MethodHandle MH_alSourcef = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcef", Descriptors.FD_alSourcef);
        /// The method handle of `alSource3f`.
        public static final MethodHandle MH_alSource3f = RuntimeHelper.downcall(ALInternal.lookup(), "alSource3f", Descriptors.FD_alSource3f);
        /// The method handle of `alSourcefv`.
        public static final MethodHandle MH_alSourcefv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcefv", Descriptors.FD_alSourcefv);
        /// The method handle of `alSourcei`.
        public static final MethodHandle MH_alSourcei = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcei", Descriptors.FD_alSourcei);
        /// The method handle of `alSource3i`.
        public static final MethodHandle MH_alSource3i = RuntimeHelper.downcall(ALInternal.lookup(), "alSource3i", Descriptors.FD_alSource3i);
        /// The method handle of `alSourceiv`.
        public static final MethodHandle MH_alSourceiv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceiv", Descriptors.FD_alSourceiv);
        /// The method handle of `alGetSourcef`.
        public static final MethodHandle MH_alGetSourcef = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcef", Descriptors.FD_alGetSourcef);
        /// The method handle of `alGetSource3f`.
        public static final MethodHandle MH_alGetSource3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSource3f", Descriptors.FD_alGetSource3f);
        /// The method handle of `alGetSourcefv`.
        public static final MethodHandle MH_alGetSourcefv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcefv", Descriptors.FD_alGetSourcefv);
        /// The method handle of `alGetSourcei`.
        public static final MethodHandle MH_alGetSourcei = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcei", Descriptors.FD_alGetSourcei);
        /// The method handle of `alGetSource3i`.
        public static final MethodHandle MH_alGetSource3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSource3i", Descriptors.FD_alGetSource3i);
        /// The method handle of `alGetSourceiv`.
        public static final MethodHandle MH_alGetSourceiv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourceiv", Descriptors.FD_alGetSourceiv);
        /// The method handle of `alSourcePlay`.
        public static final MethodHandle MH_alSourcePlay = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePlay", Descriptors.FD_alSourcePlay);
        /// The method handle of `alSourceStop`.
        public static final MethodHandle MH_alSourceStop = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceStop", Descriptors.FD_alSourceStop);
        /// The method handle of `alSourceRewind`.
        public static final MethodHandle MH_alSourceRewind = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceRewind", Descriptors.FD_alSourceRewind);
        /// The method handle of `alSourcePause`.
        public static final MethodHandle MH_alSourcePause = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePause", Descriptors.FD_alSourcePause);
        /// The method handle of `alSourcePlayv`.
        public static final MethodHandle MH_alSourcePlayv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePlayv", Descriptors.FD_alSourcePlayv);
        /// The method handle of `alSourceStopv`.
        public static final MethodHandle MH_alSourceStopv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceStopv", Descriptors.FD_alSourceStopv);
        /// The method handle of `alSourceRewindv`.
        public static final MethodHandle MH_alSourceRewindv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceRewindv", Descriptors.FD_alSourceRewindv);
        /// The method handle of `alSourcePausev`.
        public static final MethodHandle MH_alSourcePausev = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePausev", Descriptors.FD_alSourcePausev);
        /// The method handle of `alSourceQueueBuffers`.
        public static final MethodHandle MH_alSourceQueueBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceQueueBuffers", Descriptors.FD_alSourceQueueBuffers);
        /// The method handle of `alSourceUnqueueBuffers`.
        public static final MethodHandle MH_alSourceUnqueueBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceUnqueueBuffers", Descriptors.FD_alSourceUnqueueBuffers);
        /// The method handle of `alGenBuffers`.
        public static final MethodHandle MH_alGenBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alGenBuffers", Descriptors.FD_alGenBuffers);
        /// The method handle of `alDeleteBuffers`.
        public static final MethodHandle MH_alDeleteBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alDeleteBuffers", Descriptors.FD_alDeleteBuffers);
        /// The method handle of `alIsBuffer`.
        public static final MethodHandle MH_alIsBuffer = RuntimeHelper.downcall(ALInternal.lookup(), "alIsBuffer", Descriptors.FD_alIsBuffer);
        /// The method handle of `alBufferData`.
        public static final MethodHandle MH_alBufferData = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferData", Descriptors.FD_alBufferData);
        /// The method handle of `alBufferf`.
        public static final MethodHandle MH_alBufferf = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferf", Descriptors.FD_alBufferf);
        /// The method handle of `alBuffer3f`.
        public static final MethodHandle MH_alBuffer3f = RuntimeHelper.downcall(ALInternal.lookup(), "alBuffer3f", Descriptors.FD_alBuffer3f);
        /// The method handle of `alBufferfv`.
        public static final MethodHandle MH_alBufferfv = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferfv", Descriptors.FD_alBufferfv);
        /// The method handle of `alBufferi`.
        public static final MethodHandle MH_alBufferi = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferi", Descriptors.FD_alBufferi);
        /// The method handle of `alBuffer3i`.
        public static final MethodHandle MH_alBuffer3i = RuntimeHelper.downcall(ALInternal.lookup(), "alBuffer3i", Descriptors.FD_alBuffer3i);
        /// The method handle of `alBufferiv`.
        public static final MethodHandle MH_alBufferiv = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferiv", Descriptors.FD_alBufferiv);
        /// The method handle of `alGetBufferf`.
        public static final MethodHandle MH_alGetBufferf = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferf", Descriptors.FD_alGetBufferf);
        /// The method handle of `alGetBuffer3f`.
        public static final MethodHandle MH_alGetBuffer3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBuffer3f", Descriptors.FD_alGetBuffer3f);
        /// The method handle of `alGetBufferfv`.
        public static final MethodHandle MH_alGetBufferfv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferfv", Descriptors.FD_alGetBufferfv);
        /// The method handle of `alGetBufferi`.
        public static final MethodHandle MH_alGetBufferi = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferi", Descriptors.FD_alGetBufferi);
        /// The method handle of `alGetBuffer3i`.
        public static final MethodHandle MH_alGetBuffer3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBuffer3i", Descriptors.FD_alGetBuffer3i);
        /// The method handle of `alGetBufferiv`.
        public static final MethodHandle MH_alGetBufferiv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferiv", Descriptors.FD_alGetBufferiv);
    }

    public static void alEnable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alEnable.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    public static void alDisable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alDisable.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    public static @CType("ALboolean") boolean alIsEnabled(@CType("ALenum") int capability) {
        try {
            return (boolean) Handles.MH_alIsEnabled.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    public static void alDopplerFactor(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerFactor.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    public static void alDopplerVelocity(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerVelocity.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    public static void alSpeedOfSound(@CType("ALfloat") float value) {
        try {
            Handles.MH_alSpeedOfSound.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    public static void alDistanceModel(@CType("ALenum") int distanceModel) {
        try {
            Handles.MH_alDistanceModel.invokeExact(distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    public static @CType("const ALchar*") java.lang.foreign.MemorySegment alGetString_(@CType("ALenum") int param) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetString.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static @CType("const ALchar*") java.lang.String alGetString(@CType("ALenum") int param) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_alGetString.invokeExact(param));
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static void alGetBooleanv(@CType("ALenum") int param, @Out @CType("ALboolean *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBooleanv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetIntegerv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetIntegerv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetFloatv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetFloatv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetDoublev.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") double[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetDoublev.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static @CType("ALboolean") boolean alGetBoolean(@CType("ALenum") int param) {
        try {
            return (boolean) Handles.MH_alGetBoolean.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    public static @CType("ALint") int alGetInteger(@CType("ALenum") int param) {
        try {
            return (int) Handles.MH_alGetInteger.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    public static @CType("ALfloat") float alGetFloat(@CType("ALenum") int param) {
        try {
            return (float) Handles.MH_alGetFloat.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    public static @CType("ALdouble") double alGetDouble(@CType("ALenum") int param) {
        try {
            return (double) Handles.MH_alGetDouble.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    public static @CType("ALenum") int alGetError() {
        try {
            return (int) Handles.MH_alGetError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") java.lang.foreign.MemorySegment extname) {
        try {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(extname);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") java.lang.String extname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(Marshal.marshal(__overrungl_stack, extname));
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetProcAddress(@CType("const ALchar*") java.lang.foreign.MemorySegment fname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetProcAddress.invokeExact(fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetProcAddress(@CType("const ALchar*") java.lang.String fname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Marshal.marshal(__overrungl_stack, fname));
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") java.lang.foreign.MemorySegment ename) {
        try {
            return (int) Handles.MH_alGetEnumValue.invokeExact(ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") java.lang.String ename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_alGetEnumValue.invokeExact(Marshal.marshal(__overrungl_stack, ename));
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    public static void alListenerf(@CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alListenerf.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    public static void alListener3f(@CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    public static void alListenerfv(@CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alListenerfv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    public static void alListeneri(@CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alListeneri.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    public static void alListener3i(@CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    public static void alListeneriv(@CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alListeneriv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetListenerf.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListenerf.invokeExact(param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3f.invokeExact(param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetListenerfv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListenerfv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetListeneri.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListeneri.invokeExact(param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3i.invokeExact(param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetListeneriv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListeneriv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    public static void alGenSources(@CType("ALsizei") int n, @Out @CType("ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alGenSources.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    public static void alDeleteSources(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alDeleteSources.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    public static @CType("ALboolean") boolean alIsSource(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsSource.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    public static void alSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alSourcef.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    public static void alSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    public static void alSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    public static void alSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alSourcei.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    public static void alSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    public static void alSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetSourcef.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcef.invokeExact(source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3f.invokeExact(source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourcefv.invokeExact(source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetSourcei.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcei.invokeExact(source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3i.invokeExact(source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourceiv.invokeExact(source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    public static void alSourcePlay(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePlay.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    public static void alSourceStop(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceStop.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    public static void alSourceRewind(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceRewind.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    public static void alSourcePause(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePause.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    public static void alSourcePlayv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourcePlayv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    public static void alSourceStopv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourceStopv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    public static void alSourceRewindv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourceRewindv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    public static void alSourcePausev(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourcePausev.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    public static void alSourceQueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alSourceQueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    public static void alSourceUnqueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @Out @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alSourceUnqueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    public static void alGenBuffers(@CType("ALsizei") int n, @Out @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alGenBuffers.invokeExact(n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    public static void alDeleteBuffers(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alDeleteBuffers.invokeExact(n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    public static @CType("ALboolean") boolean alIsBuffer(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsBuffer.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    public static void alBufferData(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int samplerate) {
        try {
            Handles.MH_alBufferData.invokeExact(buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    public static void alBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    public static void alBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    public static void alBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    public static void alBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    public static void alBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    public static void alBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferf.invokeExact(buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3f.invokeExact(buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferfv.invokeExact(buffer, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferi.invokeExact(buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3i.invokeExact(buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferiv.invokeExact(buffer, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
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
