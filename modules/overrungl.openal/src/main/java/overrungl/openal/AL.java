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

import overrungl.util.MemoryStack;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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
        /// The method handle of `alEnable`.
        public static final MethodHandle MH_alEnable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alDisable`.
        public static final MethodHandle MH_alDisable = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alIsEnabled`.
        public static final MethodHandle MH_alIsEnabled = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alDopplerFactor`.
        public static final MethodHandle MH_alDopplerFactor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDopplerVelocity`.
        public static final MethodHandle MH_alDopplerVelocity = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSpeedOfSound`.
        public static final MethodHandle MH_alSpeedOfSound = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDistanceModel`.
        public static final MethodHandle MH_alDistanceModel = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alGetString`.
        public static final MethodHandle MH_alGetString = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetBooleanv`.
        public static final MethodHandle MH_alGetBooleanv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetIntegerv`.
        public static final MethodHandle MH_alGetIntegerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFloatv`.
        public static final MethodHandle MH_alGetFloatv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetDoublev`.
        public static final MethodHandle MH_alGetDoublev = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBoolean`.
        public static final MethodHandle MH_alGetBoolean = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alGetInteger`.
        public static final MethodHandle MH_alGetInteger = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetFloat`.
        public static final MethodHandle MH_alGetFloat = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetDouble`.
        public static final MethodHandle MH_alGetDouble = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT));
        /// The method handle of `alGetError`.
        public static final MethodHandle MH_alGetError = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `alIsExtensionPresent`.
        public static final MethodHandle MH_alIsExtensionPresent = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of `alGetProcAddress`.
        public static final MethodHandle MH_alGetProcAddress = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetEnumValue`.
        public static final MethodHandle MH_alGetEnumValue = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListenerf`.
        public static final MethodHandle MH_alListenerf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListener3f`.
        public static final MethodHandle MH_alListener3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListenerfv`.
        public static final MethodHandle MH_alListenerfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListeneri`.
        public static final MethodHandle MH_alListeneri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListener3i`.
        public static final MethodHandle MH_alListener3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListeneriv`.
        public static final MethodHandle MH_alListeneriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerf`.
        public static final MethodHandle MH_alGetListenerf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3f`.
        public static final MethodHandle MH_alGetListener3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerfv`.
        public static final MethodHandle MH_alGetListenerfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneri`.
        public static final MethodHandle MH_alGetListeneri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3i`.
        public static final MethodHandle MH_alGetListener3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneriv`.
        public static final MethodHandle MH_alGetListeneriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenSources`.
        public static final MethodHandle MH_alGenSources = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteSources`.
        public static final MethodHandle MH_alDeleteSources = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsSource`.
        public static final MethodHandle MH_alIsSource = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcef`.
        public static final MethodHandle MH_alSourcef = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSource3f`.
        public static final MethodHandle MH_alSource3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSourcefv`.
        public static final MethodHandle MH_alSourcefv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei`.
        public static final MethodHandle MH_alSourcei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSource3i`.
        public static final MethodHandle MH_alSource3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceiv`.
        public static final MethodHandle MH_alSourceiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcef`.
        public static final MethodHandle MH_alGetSourcef = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3f`.
        public static final MethodHandle MH_alGetSource3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcefv`.
        public static final MethodHandle MH_alGetSourcefv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei`.
        public static final MethodHandle MH_alGetSourcei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i`.
        public static final MethodHandle MH_alGetSource3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourceiv`.
        public static final MethodHandle MH_alGetSourceiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePlay`.
        public static final MethodHandle MH_alSourcePlay = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceStop`.
        public static final MethodHandle MH_alSourceStop = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceRewind`.
        public static final MethodHandle MH_alSourceRewind = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePause`.
        public static final MethodHandle MH_alSourcePause = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePlayv`.
        public static final MethodHandle MH_alSourcePlayv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceStopv`.
        public static final MethodHandle MH_alSourceStopv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceRewindv`.
        public static final MethodHandle MH_alSourceRewindv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePausev`.
        public static final MethodHandle MH_alSourcePausev = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceQueueBuffers`.
        public static final MethodHandle MH_alSourceQueueBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceUnqueueBuffers`.
        public static final MethodHandle MH_alSourceUnqueueBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenBuffers`.
        public static final MethodHandle MH_alGenBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteBuffers`.
        public static final MethodHandle MH_alDeleteBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsBuffer`.
        public static final MethodHandle MH_alIsBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferData`.
        public static final MethodHandle MH_alBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferf`.
        public static final MethodHandle MH_alBufferf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBuffer3f`.
        public static final MethodHandle MH_alBuffer3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBufferfv`.
        public static final MethodHandle MH_alBufferfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferi`.
        public static final MethodHandle MH_alBufferi = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBuffer3i`.
        public static final MethodHandle MH_alBuffer3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferiv`.
        public static final MethodHandle MH_alBufferiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferf`.
        public static final MethodHandle MH_alGetBufferf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3f`.
        public static final MethodHandle MH_alGetBuffer3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferfv`.
        public static final MethodHandle MH_alGetBufferfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferi`.
        public static final MethodHandle MH_alGetBufferi = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3i`.
        public static final MethodHandle MH_alGetBuffer3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferiv`.
        public static final MethodHandle MH_alGetBufferiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// void alEnable((int) ALenum capability);
    /// ```
    public static void alEnable(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEnable", capability); }
        Handles.MH_alEnable.invokeExact(Handles.get().PFN_alEnable, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    /// ```
    /// void alDisable((int) ALenum capability);
    /// ```
    public static void alDisable(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDisable", capability); }
        Handles.MH_alDisable.invokeExact(Handles.get().PFN_alDisable, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    /// ```
    /// ALboolean alIsEnabled((int) ALenum capability);
    /// ```
    public static boolean alIsEnabled(int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsEnabled", capability); }
        return (((byte) Handles.MH_alIsEnabled.invokeExact(Handles.get().PFN_alIsEnabled, capability)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    /// ```
    /// void alDopplerFactor((float) ALfloat value);
    /// ```
    public static void alDopplerFactor(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDopplerFactor", value); }
        Handles.MH_alDopplerFactor.invokeExact(Handles.get().PFN_alDopplerFactor, value); }
        catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    /// ```
    /// void alDopplerVelocity((float) ALfloat value);
    /// ```
    public static void alDopplerVelocity(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDopplerVelocity", value); }
        Handles.MH_alDopplerVelocity.invokeExact(Handles.get().PFN_alDopplerVelocity, value); }
        catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    /// ```
    /// void alSpeedOfSound((float) ALfloat value);
    /// ```
    public static void alSpeedOfSound(float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSpeedOfSound", value); }
        Handles.MH_alSpeedOfSound.invokeExact(Handles.get().PFN_alSpeedOfSound, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    /// ```
    /// void alDistanceModel((int) ALenum distanceModel);
    /// ```
    public static void alDistanceModel(int distanceModel) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDistanceModel", distanceModel); }
        Handles.MH_alDistanceModel.invokeExact(Handles.get().PFN_alDistanceModel, distanceModel); }
        catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    /// ```
    /// const ALchar* alGetString((int) ALenum param);
    /// ```
    public static MemorySegment alGetString(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetString", param); }
        return (MemorySegment) Handles.MH_alGetString.invokeExact(Handles.get().PFN_alGetString, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    /// ```
    /// void alGetBooleanv((int) ALenum param, ALboolean* values);
    /// ```
    public static void alGetBooleanv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBooleanv", param, values); }
        Handles.MH_alGetBooleanv.invokeExact(Handles.get().PFN_alGetBooleanv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    /// ```
    /// void alGetIntegerv((int) ALenum param, ALint* values);
    /// ```
    public static void alGetIntegerv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetIntegerv", param, values); }
        Handles.MH_alGetIntegerv.invokeExact(Handles.get().PFN_alGetIntegerv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    /// ```
    /// void alGetFloatv((int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetFloatv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloatv", param, values); }
        Handles.MH_alGetFloatv.invokeExact(Handles.get().PFN_alGetFloatv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    /// ```
    /// void alGetDoublev((int) ALenum param, ALdouble* values);
    /// ```
    public static void alGetDoublev(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDoublev", param, values); }
        Handles.MH_alGetDoublev.invokeExact(Handles.get().PFN_alGetDoublev, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    /// ```
    /// ALboolean alGetBoolean((int) ALenum param);
    /// ```
    public static boolean alGetBoolean(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBoolean", param); }
        return (((byte) Handles.MH_alGetBoolean.invokeExact(Handles.get().PFN_alGetBoolean, param)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    /// ```
    /// (int) ALint alGetInteger((int) ALenum param);
    /// ```
    public static int alGetInteger(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetInteger", param); }
        return (int) Handles.MH_alGetInteger.invokeExact(Handles.get().PFN_alGetInteger, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    /// ```
    /// (float) ALfloat alGetFloat((int) ALenum param);
    /// ```
    public static float alGetFloat(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloat", param); }
        return (float) Handles.MH_alGetFloat.invokeExact(Handles.get().PFN_alGetFloat, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    /// ```
    /// (double) ALdouble alGetDouble((int) ALenum param);
    /// ```
    public static double alGetDouble(int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDouble", param); }
        return (double) Handles.MH_alGetDouble.invokeExact(Handles.get().PFN_alGetDouble, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    /// ```
    /// (int) ALenum alGetError();
    /// ```
    public static int alGetError() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetError"); }
        return (int) Handles.MH_alGetError.invokeExact(Handles.get().PFN_alGetError); }
        catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    /// ```
    /// ALboolean alIsExtensionPresent(const ALchar* extname);
    /// ```
    public static boolean alIsExtensionPresent(MemorySegment extname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsExtensionPresent", extname); }
        return (((byte) Handles.MH_alIsExtensionPresent.invokeExact(Handles.get().PFN_alIsExtensionPresent, extname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    /// ```
    /// void* alGetProcAddress(const ALchar* fname);
    /// ```
    public static MemorySegment alGetProcAddress(MemorySegment fname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetProcAddress", fname); }
        return (MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Handles.get().PFN_alGetProcAddress, fname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    /// ```
    /// (int) ALenum alGetEnumValue(const ALchar* ename);
    /// ```
    public static int alGetEnumValue(MemorySegment ename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEnumValue", ename); }
        return (int) Handles.MH_alGetEnumValue.invokeExact(Handles.get().PFN_alGetEnumValue, ename); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    /// ```
    /// void alListenerf((int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alListenerf(int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerf", param, value); }
        Handles.MH_alListenerf.invokeExact(Handles.get().PFN_alListenerf, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    /// ```
    /// void alListener3f((int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alListener3f(int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3f", param, value1, value2, value3); }
        Handles.MH_alListener3f.invokeExact(Handles.get().PFN_alListener3f, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    /// ```
    /// void alListenerfv((int) ALenum param, const ALfloat* values);
    /// ```
    public static void alListenerfv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerfv", param, values); }
        Handles.MH_alListenerfv.invokeExact(Handles.get().PFN_alListenerfv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    /// ```
    /// void alListeneri((int) ALenum param, (int) ALint value);
    /// ```
    public static void alListeneri(int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListeneri", param, value); }
        Handles.MH_alListeneri.invokeExact(Handles.get().PFN_alListeneri, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    /// ```
    /// void alListener3i((int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alListener3i(int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3i", param, value1, value2, value3); }
        Handles.MH_alListener3i.invokeExact(Handles.get().PFN_alListener3i, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    /// ```
    /// void alListeneriv((int) ALenum param, const ALint* values);
    /// ```
    public static void alListeneriv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListeneriv", param, values); }
        Handles.MH_alListeneriv.invokeExact(Handles.get().PFN_alListeneriv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    /// ```
    /// void alGetListenerf((int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetListenerf(int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerf", param, value); }
        Handles.MH_alGetListenerf.invokeExact(Handles.get().PFN_alGetListenerf, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    /// ```
    /// void alGetListener3f((int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetListener3f(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3f", param, value1, value2, value3); }
        Handles.MH_alGetListener3f.invokeExact(Handles.get().PFN_alGetListener3f, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    /// ```
    /// void alGetListenerfv((int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetListenerfv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerfv", param, values); }
        Handles.MH_alGetListenerfv.invokeExact(Handles.get().PFN_alGetListenerfv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    /// ```
    /// void alGetListeneri((int) ALenum param, ALint* value);
    /// ```
    public static void alGetListeneri(int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListeneri", param, value); }
        Handles.MH_alGetListeneri.invokeExact(Handles.get().PFN_alGetListeneri, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    /// ```
    /// void alGetListener3i((int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetListener3i(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3i", param, value1, value2, value3); }
        Handles.MH_alGetListener3i.invokeExact(Handles.get().PFN_alGetListener3i, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    /// ```
    /// void alGetListeneriv((int) ALenum param, ALint* values);
    /// ```
    public static void alGetListeneriv(int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListeneriv", param, values); }
        Handles.MH_alGetListeneriv.invokeExact(Handles.get().PFN_alGetListeneriv, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    /// ```
    /// void alGenSources((int) ALsizei n, ALuint* sources);
    /// ```
    public static void alGenSources(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenSources", n, sources); }
        Handles.MH_alGenSources.invokeExact(Handles.get().PFN_alGenSources, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    /// ```
    /// void alDeleteSources((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alDeleteSources(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteSources", n, sources); }
        Handles.MH_alDeleteSources.invokeExact(Handles.get().PFN_alDeleteSources, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    /// ```
    /// ALboolean alIsSource((unsigned int) ALuint source);
    /// ```
    public static boolean alIsSource(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsSource", source); }
        return (((byte) Handles.MH_alIsSource.invokeExact(Handles.get().PFN_alIsSource, source)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    /// ```
    /// void alSourcef((unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alSourcef(int source, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcef", source, param, value); }
        Handles.MH_alSourcef.invokeExact(Handles.get().PFN_alSourcef, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    /// ```
    /// void alSource3f((unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alSource3f(int source, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3f", source, param, value1, value2, value3); }
        Handles.MH_alSource3f.invokeExact(Handles.get().PFN_alSource3f, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    /// ```
    /// void alSourcefv((unsigned int) ALuint source, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alSourcefv(int source, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcefv", source, param, values); }
        Handles.MH_alSourcefv.invokeExact(Handles.get().PFN_alSourcefv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    /// ```
    /// void alSourcei((unsigned int) ALuint source, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alSourcei(int source, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei", source, param, value); }
        Handles.MH_alSourcei.invokeExact(Handles.get().PFN_alSourcei, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    /// ```
    /// void alSource3i((unsigned int) ALuint source, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alSource3i(int source, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3i", source, param, value1, value2, value3); }
        Handles.MH_alSource3i.invokeExact(Handles.get().PFN_alSource3i, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    /// ```
    /// void alSourceiv((unsigned int) ALuint source, (int) ALenum param, const ALint* values);
    /// ```
    public static void alSourceiv(int source, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceiv", source, param, values); }
        Handles.MH_alSourceiv.invokeExact(Handles.get().PFN_alSourceiv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    /// ```
    /// void alGetSourcef((unsigned int) ALuint source, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetSourcef(int source, int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcef", source, param, value); }
        Handles.MH_alGetSourcef.invokeExact(Handles.get().PFN_alGetSourcef, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    /// ```
    /// void alGetSource3f((unsigned int) ALuint source, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetSource3f(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3f", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3f.invokeExact(Handles.get().PFN_alGetSource3f, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    /// ```
    /// void alGetSourcefv((unsigned int) ALuint source, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetSourcefv(int source, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcefv", source, param, values); }
        Handles.MH_alGetSourcefv.invokeExact(Handles.get().PFN_alGetSourcefv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    /// ```
    /// void alGetSourcei((unsigned int) ALuint source, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetSourcei(int source, int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei", source, param, value); }
        Handles.MH_alGetSourcei.invokeExact(Handles.get().PFN_alGetSourcei, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    /// ```
    /// void alGetSource3i((unsigned int) ALuint source, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetSource3i(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3i", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3i.invokeExact(Handles.get().PFN_alGetSource3i, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    /// ```
    /// void alGetSourceiv((unsigned int) ALuint source, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetSourceiv(int source, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourceiv", source, param, values); }
        Handles.MH_alGetSourceiv.invokeExact(Handles.get().PFN_alGetSourceiv, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    /// ```
    /// void alSourcePlay((unsigned int) ALuint source);
    /// ```
    public static void alSourcePlay(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlay", source); }
        Handles.MH_alSourcePlay.invokeExact(Handles.get().PFN_alSourcePlay, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    /// ```
    /// void alSourceStop((unsigned int) ALuint source);
    /// ```
    public static void alSourceStop(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStop", source); }
        Handles.MH_alSourceStop.invokeExact(Handles.get().PFN_alSourceStop, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    /// ```
    /// void alSourceRewind((unsigned int) ALuint source);
    /// ```
    public static void alSourceRewind(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewind", source); }
        Handles.MH_alSourceRewind.invokeExact(Handles.get().PFN_alSourceRewind, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    /// ```
    /// void alSourcePause((unsigned int) ALuint source);
    /// ```
    public static void alSourcePause(int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePause", source); }
        Handles.MH_alSourcePause.invokeExact(Handles.get().PFN_alSourcePause, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    /// ```
    /// void alSourcePlayv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePlayv(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayv", n, sources); }
        Handles.MH_alSourcePlayv.invokeExact(Handles.get().PFN_alSourcePlayv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    /// ```
    /// void alSourceStopv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceStopv(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStopv", n, sources); }
        Handles.MH_alSourceStopv.invokeExact(Handles.get().PFN_alSourceStopv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    /// ```
    /// void alSourceRewindv((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceRewindv(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewindv", n, sources); }
        Handles.MH_alSourceRewindv.invokeExact(Handles.get().PFN_alSourceRewindv, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    /// ```
    /// void alSourcePausev((int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePausev(int n, MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePausev", n, sources); }
        Handles.MH_alSourcePausev.invokeExact(Handles.get().PFN_alSourcePausev, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    /// ```
    /// void alSourceQueueBuffers((unsigned int) ALuint source, (int) ALsizei nb, const ALuint* buffers);
    /// ```
    public static void alSourceQueueBuffers(int source, int nb, MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceQueueBuffers", source, nb, buffers); }
        Handles.MH_alSourceQueueBuffers.invokeExact(Handles.get().PFN_alSourceQueueBuffers, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    /// ```
    /// void alSourceUnqueueBuffers((unsigned int) ALuint source, (int) ALsizei nb, ALuint* buffers);
    /// ```
    public static void alSourceUnqueueBuffers(int source, int nb, MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceUnqueueBuffers", source, nb, buffers); }
        Handles.MH_alSourceUnqueueBuffers.invokeExact(Handles.get().PFN_alSourceUnqueueBuffers, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    /// ```
    /// void alGenBuffers((int) ALsizei n, ALuint* buffers);
    /// ```
    public static void alGenBuffers(int n, MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenBuffers", n, buffers); }
        Handles.MH_alGenBuffers.invokeExact(Handles.get().PFN_alGenBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    /// ```
    /// void alDeleteBuffers((int) ALsizei n, const ALuint* buffers);
    /// ```
    public static void alDeleteBuffers(int n, MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteBuffers", n, buffers); }
        Handles.MH_alDeleteBuffers.invokeExact(Handles.get().PFN_alDeleteBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    /// ```
    /// ALboolean alIsBuffer((unsigned int) ALuint buffer);
    /// ```
    public static boolean alIsBuffer(int buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsBuffer", buffer); }
        return (((byte) Handles.MH_alIsBuffer.invokeExact(Handles.get().PFN_alIsBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    /// ```
    /// void alBufferData((unsigned int) ALuint buffer, (int) ALenum format, const ALvoid* data, (int) ALsizei size, (int) ALsizei samplerate);
    /// ```
    public static void alBufferData(int buffer, int format, MemorySegment data, int size, int samplerate) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferData", buffer, format, data, size, samplerate); }
        Handles.MH_alBufferData.invokeExact(Handles.get().PFN_alBufferData, buffer, format, data, size, samplerate); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    /// ```
    /// void alBufferf((unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alBufferf(int buffer, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferf", buffer, param, value); }
        Handles.MH_alBufferf.invokeExact(Handles.get().PFN_alBufferf, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    /// ```
    /// void alBuffer3f((unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alBuffer3f(int buffer, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3f", buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3f.invokeExact(Handles.get().PFN_alBuffer3f, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    /// ```
    /// void alBufferfv((unsigned int) ALuint buffer, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alBufferfv(int buffer, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferfv", buffer, param, values); }
        Handles.MH_alBufferfv.invokeExact(Handles.get().PFN_alBufferfv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    /// ```
    /// void alBufferi((unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alBufferi(int buffer, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferi", buffer, param, value); }
        Handles.MH_alBufferi.invokeExact(Handles.get().PFN_alBufferi, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    /// ```
    /// void alBuffer3i((unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alBuffer3i(int buffer, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3i", buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3i.invokeExact(Handles.get().PFN_alBuffer3i, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    /// ```
    /// void alBufferiv((unsigned int) ALuint buffer, (int) ALenum param, const ALint* values);
    /// ```
    public static void alBufferiv(int buffer, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferiv", buffer, param, values); }
        Handles.MH_alBufferiv.invokeExact(Handles.get().PFN_alBufferiv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    /// ```
    /// void alGetBufferf((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetBufferf(int buffer, int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferf", buffer, param, value); }
        Handles.MH_alGetBufferf.invokeExact(Handles.get().PFN_alGetBufferf, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    /// ```
    /// void alGetBuffer3f((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetBuffer3f(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3f", buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3f.invokeExact(Handles.get().PFN_alGetBuffer3f, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    /// ```
    /// void alGetBufferfv((unsigned int) ALuint buffer, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetBufferfv(int buffer, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferfv", buffer, param, values); }
        Handles.MH_alGetBufferfv.invokeExact(Handles.get().PFN_alGetBufferfv, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    /// ```
    /// void alGetBufferi((unsigned int) ALuint buffer, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetBufferi(int buffer, int param, MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferi", buffer, param, value); }
        Handles.MH_alGetBufferi.invokeExact(Handles.get().PFN_alGetBufferi, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    /// ```
    /// void alGetBuffer3i((unsigned int) ALuint buffer, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetBuffer3i(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3i", buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3i.invokeExact(Handles.get().PFN_alGetBuffer3i, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    /// ```
    /// void alGetBufferiv((unsigned int) ALuint buffer, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetBufferiv(int buffer, int param, MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferiv", buffer, param, values); }
        Handles.MH_alGetBufferiv.invokeExact(Handles.get().PFN_alGetBufferiv, buffer, param, values); }
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
