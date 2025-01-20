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
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alEnable`.
        public static final MethodHandle MH_alEnable = RuntimeHelper.downcall(Descriptors.FD_alEnable);
        /// The method handle of `alDisable`.
        public static final MethodHandle MH_alDisable = RuntimeHelper.downcall(Descriptors.FD_alDisable);
        /// The method handle of `alIsEnabled`.
        public static final MethodHandle MH_alIsEnabled = RuntimeHelper.downcall(Descriptors.FD_alIsEnabled);
        /// The method handle of `alDopplerFactor`.
        public static final MethodHandle MH_alDopplerFactor = RuntimeHelper.downcall(Descriptors.FD_alDopplerFactor);
        /// The method handle of `alDopplerVelocity`.
        public static final MethodHandle MH_alDopplerVelocity = RuntimeHelper.downcall(Descriptors.FD_alDopplerVelocity);
        /// The method handle of `alSpeedOfSound`.
        public static final MethodHandle MH_alSpeedOfSound = RuntimeHelper.downcall(Descriptors.FD_alSpeedOfSound);
        /// The method handle of `alDistanceModel`.
        public static final MethodHandle MH_alDistanceModel = RuntimeHelper.downcall(Descriptors.FD_alDistanceModel);
        /// The method handle of `alGetString`.
        public static final MethodHandle MH_alGetString = RuntimeHelper.downcall(Descriptors.FD_alGetString);
        /// The method handle of `alGetBooleanv`.
        public static final MethodHandle MH_alGetBooleanv = RuntimeHelper.downcall(Descriptors.FD_alGetBooleanv);
        /// The method handle of `alGetIntegerv`.
        public static final MethodHandle MH_alGetIntegerv = RuntimeHelper.downcall(Descriptors.FD_alGetIntegerv);
        /// The method handle of `alGetFloatv`.
        public static final MethodHandle MH_alGetFloatv = RuntimeHelper.downcall(Descriptors.FD_alGetFloatv);
        /// The method handle of `alGetDoublev`.
        public static final MethodHandle MH_alGetDoublev = RuntimeHelper.downcall(Descriptors.FD_alGetDoublev);
        /// The method handle of `alGetBoolean`.
        public static final MethodHandle MH_alGetBoolean = RuntimeHelper.downcall(Descriptors.FD_alGetBoolean);
        /// The method handle of `alGetInteger`.
        public static final MethodHandle MH_alGetInteger = RuntimeHelper.downcall(Descriptors.FD_alGetInteger);
        /// The method handle of `alGetFloat`.
        public static final MethodHandle MH_alGetFloat = RuntimeHelper.downcall(Descriptors.FD_alGetFloat);
        /// The method handle of `alGetDouble`.
        public static final MethodHandle MH_alGetDouble = RuntimeHelper.downcall(Descriptors.FD_alGetDouble);
        /// The method handle of `alGetError`.
        public static final MethodHandle MH_alGetError = RuntimeHelper.downcall(Descriptors.FD_alGetError);
        /// The method handle of `alIsExtensionPresent`.
        public static final MethodHandle MH_alIsExtensionPresent = RuntimeHelper.downcall(Descriptors.FD_alIsExtensionPresent);
        /// The method handle of `alGetProcAddress`.
        public static final MethodHandle MH_alGetProcAddress = RuntimeHelper.downcall(Descriptors.FD_alGetProcAddress);
        /// The method handle of `alGetEnumValue`.
        public static final MethodHandle MH_alGetEnumValue = RuntimeHelper.downcall(Descriptors.FD_alGetEnumValue);
        /// The method handle of `alListenerf`.
        public static final MethodHandle MH_alListenerf = RuntimeHelper.downcall(Descriptors.FD_alListenerf);
        /// The method handle of `alListener3f`.
        public static final MethodHandle MH_alListener3f = RuntimeHelper.downcall(Descriptors.FD_alListener3f);
        /// The method handle of `alListenerfv`.
        public static final MethodHandle MH_alListenerfv = RuntimeHelper.downcall(Descriptors.FD_alListenerfv);
        /// The method handle of `alListeneri`.
        public static final MethodHandle MH_alListeneri = RuntimeHelper.downcall(Descriptors.FD_alListeneri);
        /// The method handle of `alListener3i`.
        public static final MethodHandle MH_alListener3i = RuntimeHelper.downcall(Descriptors.FD_alListener3i);
        /// The method handle of `alListeneriv`.
        public static final MethodHandle MH_alListeneriv = RuntimeHelper.downcall(Descriptors.FD_alListeneriv);
        /// The method handle of `alGetListenerf`.
        public static final MethodHandle MH_alGetListenerf = RuntimeHelper.downcall(Descriptors.FD_alGetListenerf);
        /// The method handle of `alGetListener3f`.
        public static final MethodHandle MH_alGetListener3f = RuntimeHelper.downcall(Descriptors.FD_alGetListener3f);
        /// The method handle of `alGetListenerfv`.
        public static final MethodHandle MH_alGetListenerfv = RuntimeHelper.downcall(Descriptors.FD_alGetListenerfv);
        /// The method handle of `alGetListeneri`.
        public static final MethodHandle MH_alGetListeneri = RuntimeHelper.downcall(Descriptors.FD_alGetListeneri);
        /// The method handle of `alGetListener3i`.
        public static final MethodHandle MH_alGetListener3i = RuntimeHelper.downcall(Descriptors.FD_alGetListener3i);
        /// The method handle of `alGetListeneriv`.
        public static final MethodHandle MH_alGetListeneriv = RuntimeHelper.downcall(Descriptors.FD_alGetListeneriv);
        /// The method handle of `alGenSources`.
        public static final MethodHandle MH_alGenSources = RuntimeHelper.downcall(Descriptors.FD_alGenSources);
        /// The method handle of `alDeleteSources`.
        public static final MethodHandle MH_alDeleteSources = RuntimeHelper.downcall(Descriptors.FD_alDeleteSources);
        /// The method handle of `alIsSource`.
        public static final MethodHandle MH_alIsSource = RuntimeHelper.downcall(Descriptors.FD_alIsSource);
        /// The method handle of `alSourcef`.
        public static final MethodHandle MH_alSourcef = RuntimeHelper.downcall(Descriptors.FD_alSourcef);
        /// The method handle of `alSource3f`.
        public static final MethodHandle MH_alSource3f = RuntimeHelper.downcall(Descriptors.FD_alSource3f);
        /// The method handle of `alSourcefv`.
        public static final MethodHandle MH_alSourcefv = RuntimeHelper.downcall(Descriptors.FD_alSourcefv);
        /// The method handle of `alSourcei`.
        public static final MethodHandle MH_alSourcei = RuntimeHelper.downcall(Descriptors.FD_alSourcei);
        /// The method handle of `alSource3i`.
        public static final MethodHandle MH_alSource3i = RuntimeHelper.downcall(Descriptors.FD_alSource3i);
        /// The method handle of `alSourceiv`.
        public static final MethodHandle MH_alSourceiv = RuntimeHelper.downcall(Descriptors.FD_alSourceiv);
        /// The method handle of `alGetSourcef`.
        public static final MethodHandle MH_alGetSourcef = RuntimeHelper.downcall(Descriptors.FD_alGetSourcef);
        /// The method handle of `alGetSource3f`.
        public static final MethodHandle MH_alGetSource3f = RuntimeHelper.downcall(Descriptors.FD_alGetSource3f);
        /// The method handle of `alGetSourcefv`.
        public static final MethodHandle MH_alGetSourcefv = RuntimeHelper.downcall(Descriptors.FD_alGetSourcefv);
        /// The method handle of `alGetSourcei`.
        public static final MethodHandle MH_alGetSourcei = RuntimeHelper.downcall(Descriptors.FD_alGetSourcei);
        /// The method handle of `alGetSource3i`.
        public static final MethodHandle MH_alGetSource3i = RuntimeHelper.downcall(Descriptors.FD_alGetSource3i);
        /// The method handle of `alGetSourceiv`.
        public static final MethodHandle MH_alGetSourceiv = RuntimeHelper.downcall(Descriptors.FD_alGetSourceiv);
        /// The method handle of `alSourcePlay`.
        public static final MethodHandle MH_alSourcePlay = RuntimeHelper.downcall(Descriptors.FD_alSourcePlay);
        /// The method handle of `alSourceStop`.
        public static final MethodHandle MH_alSourceStop = RuntimeHelper.downcall(Descriptors.FD_alSourceStop);
        /// The method handle of `alSourceRewind`.
        public static final MethodHandle MH_alSourceRewind = RuntimeHelper.downcall(Descriptors.FD_alSourceRewind);
        /// The method handle of `alSourcePause`.
        public static final MethodHandle MH_alSourcePause = RuntimeHelper.downcall(Descriptors.FD_alSourcePause);
        /// The method handle of `alSourcePlayv`.
        public static final MethodHandle MH_alSourcePlayv = RuntimeHelper.downcall(Descriptors.FD_alSourcePlayv);
        /// The method handle of `alSourceStopv`.
        public static final MethodHandle MH_alSourceStopv = RuntimeHelper.downcall(Descriptors.FD_alSourceStopv);
        /// The method handle of `alSourceRewindv`.
        public static final MethodHandle MH_alSourceRewindv = RuntimeHelper.downcall(Descriptors.FD_alSourceRewindv);
        /// The method handle of `alSourcePausev`.
        public static final MethodHandle MH_alSourcePausev = RuntimeHelper.downcall(Descriptors.FD_alSourcePausev);
        /// The method handle of `alSourceQueueBuffers`.
        public static final MethodHandle MH_alSourceQueueBuffers = RuntimeHelper.downcall(Descriptors.FD_alSourceQueueBuffers);
        /// The method handle of `alSourceUnqueueBuffers`.
        public static final MethodHandle MH_alSourceUnqueueBuffers = RuntimeHelper.downcall(Descriptors.FD_alSourceUnqueueBuffers);
        /// The method handle of `alGenBuffers`.
        public static final MethodHandle MH_alGenBuffers = RuntimeHelper.downcall(Descriptors.FD_alGenBuffers);
        /// The method handle of `alDeleteBuffers`.
        public static final MethodHandle MH_alDeleteBuffers = RuntimeHelper.downcall(Descriptors.FD_alDeleteBuffers);
        /// The method handle of `alIsBuffer`.
        public static final MethodHandle MH_alIsBuffer = RuntimeHelper.downcall(Descriptors.FD_alIsBuffer);
        /// The method handle of `alBufferData`.
        public static final MethodHandle MH_alBufferData = RuntimeHelper.downcall(Descriptors.FD_alBufferData);
        /// The method handle of `alBufferf`.
        public static final MethodHandle MH_alBufferf = RuntimeHelper.downcall(Descriptors.FD_alBufferf);
        /// The method handle of `alBuffer3f`.
        public static final MethodHandle MH_alBuffer3f = RuntimeHelper.downcall(Descriptors.FD_alBuffer3f);
        /// The method handle of `alBufferfv`.
        public static final MethodHandle MH_alBufferfv = RuntimeHelper.downcall(Descriptors.FD_alBufferfv);
        /// The method handle of `alBufferi`.
        public static final MethodHandle MH_alBufferi = RuntimeHelper.downcall(Descriptors.FD_alBufferi);
        /// The method handle of `alBuffer3i`.
        public static final MethodHandle MH_alBuffer3i = RuntimeHelper.downcall(Descriptors.FD_alBuffer3i);
        /// The method handle of `alBufferiv`.
        public static final MethodHandle MH_alBufferiv = RuntimeHelper.downcall(Descriptors.FD_alBufferiv);
        /// The method handle of `alGetBufferf`.
        public static final MethodHandle MH_alGetBufferf = RuntimeHelper.downcall(Descriptors.FD_alGetBufferf);
        /// The method handle of `alGetBuffer3f`.
        public static final MethodHandle MH_alGetBuffer3f = RuntimeHelper.downcall(Descriptors.FD_alGetBuffer3f);
        /// The method handle of `alGetBufferfv`.
        public static final MethodHandle MH_alGetBufferfv = RuntimeHelper.downcall(Descriptors.FD_alGetBufferfv);
        /// The method handle of `alGetBufferi`.
        public static final MethodHandle MH_alGetBufferi = RuntimeHelper.downcall(Descriptors.FD_alGetBufferi);
        /// The method handle of `alGetBuffer3i`.
        public static final MethodHandle MH_alGetBuffer3i = RuntimeHelper.downcall(Descriptors.FD_alGetBuffer3i);
        /// The method handle of `alGetBufferiv`.
        public static final MethodHandle MH_alGetBufferiv = RuntimeHelper.downcall(Descriptors.FD_alGetBufferiv);
        /// The function address of `alEnable`.
        public final MemorySegment PFN_alEnable;
        /// The function address of `alDisable`.
        public final MemorySegment PFN_alDisable;
        /// The function address of `alIsEnabled`.
        public final MemorySegment PFN_alIsEnabled;
        /// The function address of `alDopplerFactor`.
        public final MemorySegment PFN_alDopplerFactor;
        /// The function address of `alDopplerVelocity`.
        public final MemorySegment PFN_alDopplerVelocity;
        /// The function address of `alSpeedOfSound`.
        public final MemorySegment PFN_alSpeedOfSound;
        /// The function address of `alDistanceModel`.
        public final MemorySegment PFN_alDistanceModel;
        /// The function address of `alGetString`.
        public final MemorySegment PFN_alGetString;
        /// The function address of `alGetBooleanv`.
        public final MemorySegment PFN_alGetBooleanv;
        /// The function address of `alGetIntegerv`.
        public final MemorySegment PFN_alGetIntegerv;
        /// The function address of `alGetFloatv`.
        public final MemorySegment PFN_alGetFloatv;
        /// The function address of `alGetDoublev`.
        public final MemorySegment PFN_alGetDoublev;
        /// The function address of `alGetBoolean`.
        public final MemorySegment PFN_alGetBoolean;
        /// The function address of `alGetInteger`.
        public final MemorySegment PFN_alGetInteger;
        /// The function address of `alGetFloat`.
        public final MemorySegment PFN_alGetFloat;
        /// The function address of `alGetDouble`.
        public final MemorySegment PFN_alGetDouble;
        /// The function address of `alGetError`.
        public final MemorySegment PFN_alGetError;
        /// The function address of `alIsExtensionPresent`.
        public final MemorySegment PFN_alIsExtensionPresent;
        /// The function address of `alGetProcAddress`.
        public final MemorySegment PFN_alGetProcAddress;
        /// The function address of `alGetEnumValue`.
        public final MemorySegment PFN_alGetEnumValue;
        /// The function address of `alListenerf`.
        public final MemorySegment PFN_alListenerf;
        /// The function address of `alListener3f`.
        public final MemorySegment PFN_alListener3f;
        /// The function address of `alListenerfv`.
        public final MemorySegment PFN_alListenerfv;
        /// The function address of `alListeneri`.
        public final MemorySegment PFN_alListeneri;
        /// The function address of `alListener3i`.
        public final MemorySegment PFN_alListener3i;
        /// The function address of `alListeneriv`.
        public final MemorySegment PFN_alListeneriv;
        /// The function address of `alGetListenerf`.
        public final MemorySegment PFN_alGetListenerf;
        /// The function address of `alGetListener3f`.
        public final MemorySegment PFN_alGetListener3f;
        /// The function address of `alGetListenerfv`.
        public final MemorySegment PFN_alGetListenerfv;
        /// The function address of `alGetListeneri`.
        public final MemorySegment PFN_alGetListeneri;
        /// The function address of `alGetListener3i`.
        public final MemorySegment PFN_alGetListener3i;
        /// The function address of `alGetListeneriv`.
        public final MemorySegment PFN_alGetListeneriv;
        /// The function address of `alGenSources`.
        public final MemorySegment PFN_alGenSources;
        /// The function address of `alDeleteSources`.
        public final MemorySegment PFN_alDeleteSources;
        /// The function address of `alIsSource`.
        public final MemorySegment PFN_alIsSource;
        /// The function address of `alSourcef`.
        public final MemorySegment PFN_alSourcef;
        /// The function address of `alSource3f`.
        public final MemorySegment PFN_alSource3f;
        /// The function address of `alSourcefv`.
        public final MemorySegment PFN_alSourcefv;
        /// The function address of `alSourcei`.
        public final MemorySegment PFN_alSourcei;
        /// The function address of `alSource3i`.
        public final MemorySegment PFN_alSource3i;
        /// The function address of `alSourceiv`.
        public final MemorySegment PFN_alSourceiv;
        /// The function address of `alGetSourcef`.
        public final MemorySegment PFN_alGetSourcef;
        /// The function address of `alGetSource3f`.
        public final MemorySegment PFN_alGetSource3f;
        /// The function address of `alGetSourcefv`.
        public final MemorySegment PFN_alGetSourcefv;
        /// The function address of `alGetSourcei`.
        public final MemorySegment PFN_alGetSourcei;
        /// The function address of `alGetSource3i`.
        public final MemorySegment PFN_alGetSource3i;
        /// The function address of `alGetSourceiv`.
        public final MemorySegment PFN_alGetSourceiv;
        /// The function address of `alSourcePlay`.
        public final MemorySegment PFN_alSourcePlay;
        /// The function address of `alSourceStop`.
        public final MemorySegment PFN_alSourceStop;
        /// The function address of `alSourceRewind`.
        public final MemorySegment PFN_alSourceRewind;
        /// The function address of `alSourcePause`.
        public final MemorySegment PFN_alSourcePause;
        /// The function address of `alSourcePlayv`.
        public final MemorySegment PFN_alSourcePlayv;
        /// The function address of `alSourceStopv`.
        public final MemorySegment PFN_alSourceStopv;
        /// The function address of `alSourceRewindv`.
        public final MemorySegment PFN_alSourceRewindv;
        /// The function address of `alSourcePausev`.
        public final MemorySegment PFN_alSourcePausev;
        /// The function address of `alSourceQueueBuffers`.
        public final MemorySegment PFN_alSourceQueueBuffers;
        /// The function address of `alSourceUnqueueBuffers`.
        public final MemorySegment PFN_alSourceUnqueueBuffers;
        /// The function address of `alGenBuffers`.
        public final MemorySegment PFN_alGenBuffers;
        /// The function address of `alDeleteBuffers`.
        public final MemorySegment PFN_alDeleteBuffers;
        /// The function address of `alIsBuffer`.
        public final MemorySegment PFN_alIsBuffer;
        /// The function address of `alBufferData`.
        public final MemorySegment PFN_alBufferData;
        /// The function address of `alBufferf`.
        public final MemorySegment PFN_alBufferf;
        /// The function address of `alBuffer3f`.
        public final MemorySegment PFN_alBuffer3f;
        /// The function address of `alBufferfv`.
        public final MemorySegment PFN_alBufferfv;
        /// The function address of `alBufferi`.
        public final MemorySegment PFN_alBufferi;
        /// The function address of `alBuffer3i`.
        public final MemorySegment PFN_alBuffer3i;
        /// The function address of `alBufferiv`.
        public final MemorySegment PFN_alBufferiv;
        /// The function address of `alGetBufferf`.
        public final MemorySegment PFN_alGetBufferf;
        /// The function address of `alGetBuffer3f`.
        public final MemorySegment PFN_alGetBuffer3f;
        /// The function address of `alGetBufferfv`.
        public final MemorySegment PFN_alGetBufferfv;
        /// The function address of `alGetBufferi`.
        public final MemorySegment PFN_alGetBufferi;
        /// The function address of `alGetBuffer3i`.
        public final MemorySegment PFN_alGetBuffer3i;
        /// The function address of `alGetBufferiv`.
        public final MemorySegment PFN_alGetBufferiv;
        private Handles() {
            PFN_alEnable = ALInternal.lookup().findOrThrow("alEnable");
            PFN_alDisable = ALInternal.lookup().findOrThrow("alDisable");
            PFN_alIsEnabled = ALInternal.lookup().findOrThrow("alIsEnabled");
            PFN_alDopplerFactor = ALInternal.lookup().findOrThrow("alDopplerFactor");
            PFN_alDopplerVelocity = ALInternal.lookup().findOrThrow("alDopplerVelocity");
            PFN_alSpeedOfSound = ALInternal.lookup().findOrThrow("alSpeedOfSound");
            PFN_alDistanceModel = ALInternal.lookup().findOrThrow("alDistanceModel");
            PFN_alGetString = ALInternal.lookup().findOrThrow("alGetString");
            PFN_alGetBooleanv = ALInternal.lookup().findOrThrow("alGetBooleanv");
            PFN_alGetIntegerv = ALInternal.lookup().findOrThrow("alGetIntegerv");
            PFN_alGetFloatv = ALInternal.lookup().findOrThrow("alGetFloatv");
            PFN_alGetDoublev = ALInternal.lookup().findOrThrow("alGetDoublev");
            PFN_alGetBoolean = ALInternal.lookup().findOrThrow("alGetBoolean");
            PFN_alGetInteger = ALInternal.lookup().findOrThrow("alGetInteger");
            PFN_alGetFloat = ALInternal.lookup().findOrThrow("alGetFloat");
            PFN_alGetDouble = ALInternal.lookup().findOrThrow("alGetDouble");
            PFN_alGetError = ALInternal.lookup().findOrThrow("alGetError");
            PFN_alIsExtensionPresent = ALInternal.lookup().findOrThrow("alIsExtensionPresent");
            PFN_alGetProcAddress = ALInternal.lookup().findOrThrow("alGetProcAddress");
            PFN_alGetEnumValue = ALInternal.lookup().findOrThrow("alGetEnumValue");
            PFN_alListenerf = ALInternal.lookup().findOrThrow("alListenerf");
            PFN_alListener3f = ALInternal.lookup().findOrThrow("alListener3f");
            PFN_alListenerfv = ALInternal.lookup().findOrThrow("alListenerfv");
            PFN_alListeneri = ALInternal.lookup().findOrThrow("alListeneri");
            PFN_alListener3i = ALInternal.lookup().findOrThrow("alListener3i");
            PFN_alListeneriv = ALInternal.lookup().findOrThrow("alListeneriv");
            PFN_alGetListenerf = ALInternal.lookup().findOrThrow("alGetListenerf");
            PFN_alGetListener3f = ALInternal.lookup().findOrThrow("alGetListener3f");
            PFN_alGetListenerfv = ALInternal.lookup().findOrThrow("alGetListenerfv");
            PFN_alGetListeneri = ALInternal.lookup().findOrThrow("alGetListeneri");
            PFN_alGetListener3i = ALInternal.lookup().findOrThrow("alGetListener3i");
            PFN_alGetListeneriv = ALInternal.lookup().findOrThrow("alGetListeneriv");
            PFN_alGenSources = ALInternal.lookup().findOrThrow("alGenSources");
            PFN_alDeleteSources = ALInternal.lookup().findOrThrow("alDeleteSources");
            PFN_alIsSource = ALInternal.lookup().findOrThrow("alIsSource");
            PFN_alSourcef = ALInternal.lookup().findOrThrow("alSourcef");
            PFN_alSource3f = ALInternal.lookup().findOrThrow("alSource3f");
            PFN_alSourcefv = ALInternal.lookup().findOrThrow("alSourcefv");
            PFN_alSourcei = ALInternal.lookup().findOrThrow("alSourcei");
            PFN_alSource3i = ALInternal.lookup().findOrThrow("alSource3i");
            PFN_alSourceiv = ALInternal.lookup().findOrThrow("alSourceiv");
            PFN_alGetSourcef = ALInternal.lookup().findOrThrow("alGetSourcef");
            PFN_alGetSource3f = ALInternal.lookup().findOrThrow("alGetSource3f");
            PFN_alGetSourcefv = ALInternal.lookup().findOrThrow("alGetSourcefv");
            PFN_alGetSourcei = ALInternal.lookup().findOrThrow("alGetSourcei");
            PFN_alGetSource3i = ALInternal.lookup().findOrThrow("alGetSource3i");
            PFN_alGetSourceiv = ALInternal.lookup().findOrThrow("alGetSourceiv");
            PFN_alSourcePlay = ALInternal.lookup().findOrThrow("alSourcePlay");
            PFN_alSourceStop = ALInternal.lookup().findOrThrow("alSourceStop");
            PFN_alSourceRewind = ALInternal.lookup().findOrThrow("alSourceRewind");
            PFN_alSourcePause = ALInternal.lookup().findOrThrow("alSourcePause");
            PFN_alSourcePlayv = ALInternal.lookup().findOrThrow("alSourcePlayv");
            PFN_alSourceStopv = ALInternal.lookup().findOrThrow("alSourceStopv");
            PFN_alSourceRewindv = ALInternal.lookup().findOrThrow("alSourceRewindv");
            PFN_alSourcePausev = ALInternal.lookup().findOrThrow("alSourcePausev");
            PFN_alSourceQueueBuffers = ALInternal.lookup().findOrThrow("alSourceQueueBuffers");
            PFN_alSourceUnqueueBuffers = ALInternal.lookup().findOrThrow("alSourceUnqueueBuffers");
            PFN_alGenBuffers = ALInternal.lookup().findOrThrow("alGenBuffers");
            PFN_alDeleteBuffers = ALInternal.lookup().findOrThrow("alDeleteBuffers");
            PFN_alIsBuffer = ALInternal.lookup().findOrThrow("alIsBuffer");
            PFN_alBufferData = ALInternal.lookup().findOrThrow("alBufferData");
            PFN_alBufferf = ALInternal.lookup().findOrThrow("alBufferf");
            PFN_alBuffer3f = ALInternal.lookup().findOrThrow("alBuffer3f");
            PFN_alBufferfv = ALInternal.lookup().findOrThrow("alBufferfv");
            PFN_alBufferi = ALInternal.lookup().findOrThrow("alBufferi");
            PFN_alBuffer3i = ALInternal.lookup().findOrThrow("alBuffer3i");
            PFN_alBufferiv = ALInternal.lookup().findOrThrow("alBufferiv");
            PFN_alGetBufferf = ALInternal.lookup().findOrThrow("alGetBufferf");
            PFN_alGetBuffer3f = ALInternal.lookup().findOrThrow("alGetBuffer3f");
            PFN_alGetBufferfv = ALInternal.lookup().findOrThrow("alGetBufferfv");
            PFN_alGetBufferi = ALInternal.lookup().findOrThrow("alGetBufferi");
            PFN_alGetBuffer3i = ALInternal.lookup().findOrThrow("alGetBuffer3i");
            PFN_alGetBufferiv = ALInternal.lookup().findOrThrow("alGetBufferiv");
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

    public static void alEnable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alEnable.invokeExact(Handles.get().PFN_alEnable, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    public static void alDisable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alDisable.invokeExact(Handles.get().PFN_alDisable, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    public static @CType("ALboolean") boolean alIsEnabled(@CType("ALenum") int capability) {
        try {
            return (boolean) Handles.MH_alIsEnabled.invokeExact(Handles.get().PFN_alIsEnabled, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    public static void alDopplerFactor(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerFactor.invokeExact(Handles.get().PFN_alDopplerFactor, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    public static void alDopplerVelocity(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerVelocity.invokeExact(Handles.get().PFN_alDopplerVelocity, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    public static void alSpeedOfSound(@CType("ALfloat") float value) {
        try {
            Handles.MH_alSpeedOfSound.invokeExact(Handles.get().PFN_alSpeedOfSound, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    public static void alDistanceModel(@CType("ALenum") int distanceModel) {
        try {
            Handles.MH_alDistanceModel.invokeExact(Handles.get().PFN_alDistanceModel, distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    public static @CType("const ALchar*") MemorySegment alGetString_(@CType("ALenum") int param) {
        try {
            return (MemorySegment) Handles.MH_alGetString.invokeExact(Handles.get().PFN_alGetString, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static @CType("const ALchar*") String alGetString(@CType("ALenum") int param) {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_alGetString.invokeExact(Handles.get().PFN_alGetString, param));
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static void alGetBooleanv(@CType("ALenum") int param, @Out @CType("ALboolean *") MemorySegment values) {
        try {
            Handles.MH_alGetBooleanv.invokeExact(Handles.get().PFN_alGetBooleanv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") MemorySegment values) {
        try {
            Handles.MH_alGetIntegerv.invokeExact(Handles.get().PFN_alGetIntegerv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetIntegerv.invokeExact(Handles.get().PFN_alGetIntegerv, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alGetFloatv.invokeExact(Handles.get().PFN_alGetFloatv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetFloatv.invokeExact(Handles.get().PFN_alGetFloatv, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") MemorySegment values) {
        try {
            Handles.MH_alGetDoublev.invokeExact(Handles.get().PFN_alGetDoublev, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") double[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetDoublev.invokeExact(Handles.get().PFN_alGetDoublev, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static @CType("ALboolean") boolean alGetBoolean(@CType("ALenum") int param) {
        try {
            return (boolean) Handles.MH_alGetBoolean.invokeExact(Handles.get().PFN_alGetBoolean, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    public static @CType("ALint") int alGetInteger(@CType("ALenum") int param) {
        try {
            return (int) Handles.MH_alGetInteger.invokeExact(Handles.get().PFN_alGetInteger, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    public static @CType("ALfloat") float alGetFloat(@CType("ALenum") int param) {
        try {
            return (float) Handles.MH_alGetFloat.invokeExact(Handles.get().PFN_alGetFloat, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    public static @CType("ALdouble") double alGetDouble(@CType("ALenum") int param) {
        try {
            return (double) Handles.MH_alGetDouble.invokeExact(Handles.get().PFN_alGetDouble, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    public static @CType("ALenum") int alGetError() {
        try {
            return (int) Handles.MH_alGetError.invokeExact(Handles.get().PFN_alGetError);
        } catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") MemorySegment extname) {
        try {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(Handles.get().PFN_alIsExtensionPresent, extname);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") String extname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(Handles.get().PFN_alIsExtensionPresent, Marshal.marshal(__overrungl_stack, extname));
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    public static @CType("void*") MemorySegment alGetProcAddress(@CType("const ALchar*") MemorySegment fname) {
        try {
            return (MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Handles.get().PFN_alGetProcAddress, fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    public static @CType("void*") MemorySegment alGetProcAddress(@CType("const ALchar*") String fname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Handles.get().PFN_alGetProcAddress, Marshal.marshal(__overrungl_stack, fname));
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") MemorySegment ename) {
        try {
            return (int) Handles.MH_alGetEnumValue.invokeExact(Handles.get().PFN_alGetEnumValue, ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") String ename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_alGetEnumValue.invokeExact(Handles.get().PFN_alGetEnumValue, Marshal.marshal(__overrungl_stack, ename));
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    public static void alListenerf(@CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alListenerf.invokeExact(Handles.get().PFN_alListenerf, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    public static void alListener3f(@CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alListener3f.invokeExact(Handles.get().PFN_alListener3f, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    public static void alListenerfv(@CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alListenerfv.invokeExact(Handles.get().PFN_alListenerfv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    public static void alListeneri(@CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alListeneri.invokeExact(Handles.get().PFN_alListeneri, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    public static void alListener3i(@CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alListener3i.invokeExact(Handles.get().PFN_alListener3i, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    public static void alListeneriv(@CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        try {
            Handles.MH_alListeneriv.invokeExact(Handles.get().PFN_alListeneriv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value) {
        try {
            Handles.MH_alGetListenerf.invokeExact(Handles.get().PFN_alGetListenerf, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListenerf.invokeExact(Handles.get().PFN_alGetListenerf, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value1, @Out @CType("ALfloat *") MemorySegment value2, @Out @CType("ALfloat *") MemorySegment value3) {
        try {
            Handles.MH_alGetListener3f.invokeExact(Handles.get().PFN_alGetListener3f, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3f.invokeExact(Handles.get().PFN_alGetListener3f, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alGetListenerfv.invokeExact(Handles.get().PFN_alGetListenerfv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListenerfv.invokeExact(Handles.get().PFN_alGetListenerfv, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value) {
        try {
            Handles.MH_alGetListeneri.invokeExact(Handles.get().PFN_alGetListeneri, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListeneri.invokeExact(Handles.get().PFN_alGetListeneri, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value1, @Out @CType("ALint *") MemorySegment value2, @Out @CType("ALint *") MemorySegment value3) {
        try {
            Handles.MH_alGetListener3i.invokeExact(Handles.get().PFN_alGetListener3i, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3i.invokeExact(Handles.get().PFN_alGetListener3i, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") MemorySegment values) {
        try {
            Handles.MH_alGetListeneriv.invokeExact(Handles.get().PFN_alGetListeneriv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListeneriv.invokeExact(Handles.get().PFN_alGetListeneriv, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    public static void alGenSources(@CType("ALsizei") int n, @Out @CType("ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alGenSources.invokeExact(Handles.get().PFN_alGenSources, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    public static void alDeleteSources(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alDeleteSources.invokeExact(Handles.get().PFN_alDeleteSources, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    public static @CType("ALboolean") boolean alIsSource(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsSource.invokeExact(Handles.get().PFN_alIsSource, source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    public static void alSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alSourcef.invokeExact(Handles.get().PFN_alSourcef, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    public static void alSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alSource3f.invokeExact(Handles.get().PFN_alSource3f, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    public static void alSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alSourcefv.invokeExact(Handles.get().PFN_alSourcefv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    public static void alSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alSourcei.invokeExact(Handles.get().PFN_alSourcei, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    public static void alSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alSource3i.invokeExact(Handles.get().PFN_alSource3i, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    public static void alSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        try {
            Handles.MH_alSourceiv.invokeExact(Handles.get().PFN_alSourceiv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value) {
        try {
            Handles.MH_alGetSourcef.invokeExact(Handles.get().PFN_alGetSourcef, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcef.invokeExact(Handles.get().PFN_alGetSourcef, source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value1, @Out @CType("ALfloat *") MemorySegment value2, @Out @CType("ALfloat *") MemorySegment value3) {
        try {
            Handles.MH_alGetSource3f.invokeExact(Handles.get().PFN_alGetSource3f, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3f.invokeExact(Handles.get().PFN_alGetSource3f, source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alGetSourcefv.invokeExact(Handles.get().PFN_alGetSourcefv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourcefv.invokeExact(Handles.get().PFN_alGetSourcefv, source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value) {
        try {
            Handles.MH_alGetSourcei.invokeExact(Handles.get().PFN_alGetSourcei, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcei.invokeExact(Handles.get().PFN_alGetSourcei, source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value1, @Out @CType("ALint *") MemorySegment value2, @Out @CType("ALint *") MemorySegment value3) {
        try {
            Handles.MH_alGetSource3i.invokeExact(Handles.get().PFN_alGetSource3i, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3i.invokeExact(Handles.get().PFN_alGetSource3i, source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment values) {
        try {
            Handles.MH_alGetSourceiv.invokeExact(Handles.get().PFN_alGetSourceiv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourceiv.invokeExact(Handles.get().PFN_alGetSourceiv, source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    public static void alSourcePlay(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePlay.invokeExact(Handles.get().PFN_alSourcePlay, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    public static void alSourceStop(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceStop.invokeExact(Handles.get().PFN_alSourceStop, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    public static void alSourceRewind(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceRewind.invokeExact(Handles.get().PFN_alSourceRewind, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    public static void alSourcePause(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePause.invokeExact(Handles.get().PFN_alSourcePause, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    public static void alSourcePlayv(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alSourcePlayv.invokeExact(Handles.get().PFN_alSourcePlayv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    public static void alSourceStopv(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alSourceStopv.invokeExact(Handles.get().PFN_alSourceStopv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    public static void alSourceRewindv(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alSourceRewindv.invokeExact(Handles.get().PFN_alSourceRewindv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    public static void alSourcePausev(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        try {
            Handles.MH_alSourcePausev.invokeExact(Handles.get().PFN_alSourcePausev, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    public static void alSourceQueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @CType("const ALuint *") MemorySegment buffers) {
        try {
            Handles.MH_alSourceQueueBuffers.invokeExact(Handles.get().PFN_alSourceQueueBuffers, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    public static void alSourceUnqueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @Out @CType("ALuint *") MemorySegment buffers) {
        try {
            Handles.MH_alSourceUnqueueBuffers.invokeExact(Handles.get().PFN_alSourceUnqueueBuffers, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    public static void alGenBuffers(@CType("ALsizei") int n, @Out @CType("ALuint *") MemorySegment buffers) {
        try {
            Handles.MH_alGenBuffers.invokeExact(Handles.get().PFN_alGenBuffers, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    public static void alDeleteBuffers(@CType("ALsizei") int n, @CType("const ALuint *") MemorySegment buffers) {
        try {
            Handles.MH_alDeleteBuffers.invokeExact(Handles.get().PFN_alDeleteBuffers, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    public static @CType("ALboolean") boolean alIsBuffer(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsBuffer.invokeExact(Handles.get().PFN_alIsBuffer, source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    public static void alBufferData(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int samplerate) {
        try {
            Handles.MH_alBufferData.invokeExact(Handles.get().PFN_alBufferData, buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    public static void alBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alBufferf.invokeExact(Handles.get().PFN_alBufferf, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    public static void alBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alBuffer3f.invokeExact(Handles.get().PFN_alBuffer3f, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    public static void alBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alBufferfv.invokeExact(Handles.get().PFN_alBufferfv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    public static void alBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alBufferi.invokeExact(Handles.get().PFN_alBufferi, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    public static void alBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alBuffer3i.invokeExact(Handles.get().PFN_alBuffer3i, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    public static void alBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        try {
            Handles.MH_alBufferiv.invokeExact(Handles.get().PFN_alBufferiv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value) {
        try {
            Handles.MH_alGetBufferf.invokeExact(Handles.get().PFN_alGetBufferf, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferf.invokeExact(Handles.get().PFN_alGetBufferf, buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment value1, @Out @CType("ALfloat *") MemorySegment value2, @Out @CType("ALfloat *") MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3f.invokeExact(Handles.get().PFN_alGetBuffer3f, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3f.invokeExact(Handles.get().PFN_alGetBuffer3f, buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") MemorySegment values) {
        try {
            Handles.MH_alGetBufferfv.invokeExact(Handles.get().PFN_alGetBufferfv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferfv.invokeExact(Handles.get().PFN_alGetBufferfv, buffer, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value) {
        try {
            Handles.MH_alGetBufferi.invokeExact(Handles.get().PFN_alGetBufferi, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferi.invokeExact(Handles.get().PFN_alGetBufferi, buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment value1, @Out @CType("ALint *") MemorySegment value2, @Out @CType("ALint *") MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3i.invokeExact(Handles.get().PFN_alGetBuffer3i, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3i.invokeExact(Handles.get().PFN_alGetBuffer3i, buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") MemorySegment values) {
        try {
            Handles.MH_alGetBufferiv.invokeExact(Handles.get().PFN_alGetBufferiv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferiv.invokeExact(Handles.get().PFN_alGetBufferiv, buffer, param, __overrungl_ref_values);
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
