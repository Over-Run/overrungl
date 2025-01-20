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
package overrungl.openal;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.*;
import overrungl.util.*;
public final class ALEXTDirectContext {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alcGetProcAddress2`.
        public static final MethodHandle MH_alcGetProcAddress2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alEnableDirect`.
        public static final MethodHandle MH_alEnableDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alDisableDirect`.
        public static final MethodHandle MH_alDisableDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alIsEnabledDirect`.
        public static final MethodHandle MH_alIsEnabledDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alDopplerFactorDirect`.
        public static final MethodHandle MH_alDopplerFactorDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSpeedOfSoundDirect`.
        public static final MethodHandle MH_alSpeedOfSoundDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDistanceModelDirect`.
        public static final MethodHandle MH_alDistanceModelDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetStringDirect`.
        public static final MethodHandle MH_alGetStringDirect = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetBooleanvDirect`.
        public static final MethodHandle MH_alGetBooleanvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetIntegervDirect`.
        public static final MethodHandle MH_alGetIntegervDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFloatvDirect`.
        public static final MethodHandle MH_alGetFloatvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetDoublevDirect`.
        public static final MethodHandle MH_alGetDoublevDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBooleanDirect`.
        public static final MethodHandle MH_alGetBooleanDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetIntegerDirect`.
        public static final MethodHandle MH_alGetIntegerDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetFloatDirect`.
        public static final MethodHandle MH_alGetFloatDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetDoubleDirect`.
        public static final MethodHandle MH_alGetDoubleDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetErrorDirect`.
        public static final MethodHandle MH_alGetErrorDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsExtensionPresentDirect`.
        public static final MethodHandle MH_alIsExtensionPresentDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetProcAddressDirect`.
        public static final MethodHandle MH_alGetProcAddressDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetEnumValueDirect`.
        public static final MethodHandle MH_alGetEnumValueDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alListenerfDirect`.
        public static final MethodHandle MH_alListenerfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListener3fDirect`.
        public static final MethodHandle MH_alListener3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListenerfvDirect`.
        public static final MethodHandle MH_alListenerfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListeneriDirect`.
        public static final MethodHandle MH_alListeneriDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListener3iDirect`.
        public static final MethodHandle MH_alListener3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListenerivDirect`.
        public static final MethodHandle MH_alListenerivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerfDirect`.
        public static final MethodHandle MH_alGetListenerfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3fDirect`.
        public static final MethodHandle MH_alGetListener3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerfvDirect`.
        public static final MethodHandle MH_alGetListenerfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneriDirect`.
        public static final MethodHandle MH_alGetListeneriDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3iDirect`.
        public static final MethodHandle MH_alGetListener3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerivDirect`.
        public static final MethodHandle MH_alGetListenerivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenSourcesDirect`.
        public static final MethodHandle MH_alGenSourcesDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteSourcesDirect`.
        public static final MethodHandle MH_alDeleteSourcesDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsSourceDirect`.
        public static final MethodHandle MH_alIsSourceDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcefDirect`.
        public static final MethodHandle MH_alSourcefDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSource3fDirect`.
        public static final MethodHandle MH_alSource3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSourcefvDirect`.
        public static final MethodHandle MH_alSourcefvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceiDirect`.
        public static final MethodHandle MH_alSourceiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSource3iDirect`.
        public static final MethodHandle MH_alSource3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceivDirect`.
        public static final MethodHandle MH_alSourceivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcefDirect`.
        public static final MethodHandle MH_alGetSourcefDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3fDirect`.
        public static final MethodHandle MH_alGetSource3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcefvDirect`.
        public static final MethodHandle MH_alGetSourcefvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourceiDirect`.
        public static final MethodHandle MH_alGetSourceiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3iDirect`.
        public static final MethodHandle MH_alGetSource3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourceivDirect`.
        public static final MethodHandle MH_alGetSourceivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePlayDirect`.
        public static final MethodHandle MH_alSourcePlayDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceStopDirect`.
        public static final MethodHandle MH_alSourceStopDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceRewindDirect`.
        public static final MethodHandle MH_alSourceRewindDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePauseDirect`.
        public static final MethodHandle MH_alSourcePauseDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePlayvDirect`.
        public static final MethodHandle MH_alSourcePlayvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceStopvDirect`.
        public static final MethodHandle MH_alSourceStopvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceRewindvDirect`.
        public static final MethodHandle MH_alSourceRewindvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePausevDirect`.
        public static final MethodHandle MH_alSourcePausevDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceQueueBuffersDirect`.
        public static final MethodHandle MH_alSourceQueueBuffersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceUnqueueBuffersDirect`.
        public static final MethodHandle MH_alSourceUnqueueBuffersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenBuffersDirect`.
        public static final MethodHandle MH_alGenBuffersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteBuffersDirect`.
        public static final MethodHandle MH_alDeleteBuffersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsBufferDirect`.
        public static final MethodHandle MH_alIsBufferDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferDataDirect`.
        public static final MethodHandle MH_alBufferDataDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferfDirect`.
        public static final MethodHandle MH_alBufferfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBuffer3fDirect`.
        public static final MethodHandle MH_alBuffer3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBufferfvDirect`.
        public static final MethodHandle MH_alBufferfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferiDirect`.
        public static final MethodHandle MH_alBufferiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBuffer3iDirect`.
        public static final MethodHandle MH_alBuffer3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferivDirect`.
        public static final MethodHandle MH_alBufferivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferfDirect`.
        public static final MethodHandle MH_alGetBufferfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3fDirect`.
        public static final MethodHandle MH_alGetBuffer3fDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferfvDirect`.
        public static final MethodHandle MH_alGetBufferfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferiDirect`.
        public static final MethodHandle MH_alGetBufferiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3iDirect`.
        public static final MethodHandle MH_alGetBuffer3iDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferivDirect`.
        public static final MethodHandle MH_alGetBufferivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenEffectsDirect`.
        public static final MethodHandle MH_alGenEffectsDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteEffectsDirect`.
        public static final MethodHandle MH_alDeleteEffectsDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsEffectDirect`.
        public static final MethodHandle MH_alIsEffectDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alEffectiDirect`.
        public static final MethodHandle MH_alEffectiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alEffectivDirect`.
        public static final MethodHandle MH_alEffectivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alEffectfDirect`.
        public static final MethodHandle MH_alEffectfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alEffectfvDirect`.
        public static final MethodHandle MH_alEffectfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetEffectiDirect`.
        public static final MethodHandle MH_alGetEffectiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetEffectivDirect`.
        public static final MethodHandle MH_alGetEffectivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetEffectfDirect`.
        public static final MethodHandle MH_alGetEffectfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetEffectfvDirect`.
        public static final MethodHandle MH_alGetEffectfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenFiltersDirect`.
        public static final MethodHandle MH_alGenFiltersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteFiltersDirect`.
        public static final MethodHandle MH_alDeleteFiltersDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsFilterDirect`.
        public static final MethodHandle MH_alIsFilterDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alFilteriDirect`.
        public static final MethodHandle MH_alFilteriDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alFilterivDirect`.
        public static final MethodHandle MH_alFilterivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alFilterfDirect`.
        public static final MethodHandle MH_alFilterfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alFilterfvDirect`.
        public static final MethodHandle MH_alFilterfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFilteriDirect`.
        public static final MethodHandle MH_alGetFilteriDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFilterivDirect`.
        public static final MethodHandle MH_alGetFilterivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFilterfDirect`.
        public static final MethodHandle MH_alGetFilterfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFilterfvDirect`.
        public static final MethodHandle MH_alGetFilterfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenAuxiliaryEffectSlotsDirect`.
        public static final MethodHandle MH_alGenAuxiliaryEffectSlotsDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteAuxiliaryEffectSlotsDirect`.
        public static final MethodHandle MH_alDeleteAuxiliaryEffectSlotsDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsAuxiliaryEffectSlotDirect`.
        public static final MethodHandle MH_alIsAuxiliaryEffectSlotDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alAuxiliaryEffectSlotiDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alAuxiliaryEffectSlotivDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alAuxiliaryEffectSlotfDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alAuxiliaryEffectSlotfvDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetAuxiliaryEffectSlotiDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotiDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetAuxiliaryEffectSlotivDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotivDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetAuxiliaryEffectSlotfDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetAuxiliaryEffectSlotfvDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfvDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferDataStaticDirect`.
        public static final MethodHandle MH_alBufferDataStaticDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alDebugMessageCallbackDirectEXT`.
        public static final MethodHandle MH_alDebugMessageCallbackDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alDebugMessageInsertDirectEXT`.
        public static final MethodHandle MH_alDebugMessageInsertDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alDebugMessageControlDirectEXT`.
        public static final MethodHandle MH_alDebugMessageControlDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `alPushDebugGroupDirectEXT`.
        public static final MethodHandle MH_alPushDebugGroupDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alPopDebugGroupDirectEXT`.
        public static final MethodHandle MH_alPopDebugGroupDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alGetDebugMessageLogDirectEXT`.
        public static final MethodHandle MH_alGetDebugMessageLogDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alObjectLabelDirectEXT`.
        public static final MethodHandle MH_alObjectLabelDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetObjectLabelDirectEXT`.
        public static final MethodHandle MH_alGetObjectLabelDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetPointerDirectEXT`.
        public static final MethodHandle MH_alGetPointerDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetPointervDirectEXT`.
        public static final MethodHandle MH_alGetPointervDirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alRequestFoldbackStartDirect`.
        public static final MethodHandle MH_alRequestFoldbackStartDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alRequestFoldbackStopDirect`.
        public static final MethodHandle MH_alRequestFoldbackStopDirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alBufferSubDataDirectSOFT`.
        public static final MethodHandle MH_alBufferSubDataDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcedDirectSOFT`.
        public static final MethodHandle MH_alSourcedDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSource3dDirectSOFT`.
        public static final MethodHandle MH_alSource3dDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSourcedvDirectSOFT`.
        public static final MethodHandle MH_alSourcedvDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedDirectSOFT`.
        public static final MethodHandle MH_alGetSourcedDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3dDirectSOFT`.
        public static final MethodHandle MH_alGetSource3dDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedvDirectSOFT`.
        public static final MethodHandle MH_alGetSourcedvDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei64DirectSOFT`.
        public static final MethodHandle MH_alSourcei64DirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of `alSource3i64DirectSOFT`.
        public static final MethodHandle MH_alSource3i64DirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `alSourcei64vDirectSOFT`.
        public static final MethodHandle MH_alSourcei64vDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64DirectSOFT`.
        public static final MethodHandle MH_alGetSourcei64DirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i64DirectSOFT`.
        public static final MethodHandle MH_alGetSource3i64DirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64vDirectSOFT`.
        public static final MethodHandle MH_alGetSourcei64vDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeferUpdatesDirectSOFT`.
        public static final MethodHandle MH_alDeferUpdatesDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alProcessUpdatesDirectSOFT`.
        public static final MethodHandle MH_alProcessUpdatesDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `alGetStringiDirectSOFT`.
        public static final MethodHandle MH_alGetStringiDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alEventControlDirectSOFT`.
        public static final MethodHandle MH_alEventControlDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `alEventCallbackDirectSOFT`.
        public static final MethodHandle MH_alEventCallbackDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetPointerDirectSOFT`.
        public static final MethodHandle MH_alGetPointerDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetPointervDirectSOFT`.
        public static final MethodHandle MH_alGetPointervDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferCallbackDirectSOFT`.
        public static final MethodHandle MH_alBufferCallbackDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferPtrDirectSOFT`.
        public static final MethodHandle MH_alGetBufferPtrDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3PtrDirectSOFT`.
        public static final MethodHandle MH_alGetBuffer3PtrDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferPtrvDirectSOFT`.
        public static final MethodHandle MH_alGetBufferPtrvDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePlayAtTimeDirectSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimeDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of `alSourcePlayAtTimevDirectSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimevDirectSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of `EAXSetDirect`.
        public static final MethodHandle MH_EAXSetDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `EAXGetDirect`.
        public static final MethodHandle MH_EAXGetDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `EAXSetBufferModeDirect`.
        public static final MethodHandle MH_EAXSetBufferModeDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `EAXGetBufferModeDirect`.
        public static final MethodHandle MH_EAXGetBufferModeDirect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of `alcGetProcAddress2`.
        public final MemorySegment PFN_alcGetProcAddress2;
        /// The function address of `alEnableDirect`.
        public final MemorySegment PFN_alEnableDirect;
        /// The function address of `alDisableDirect`.
        public final MemorySegment PFN_alDisableDirect;
        /// The function address of `alIsEnabledDirect`.
        public final MemorySegment PFN_alIsEnabledDirect;
        /// The function address of `alDopplerFactorDirect`.
        public final MemorySegment PFN_alDopplerFactorDirect;
        /// The function address of `alSpeedOfSoundDirect`.
        public final MemorySegment PFN_alSpeedOfSoundDirect;
        /// The function address of `alDistanceModelDirect`.
        public final MemorySegment PFN_alDistanceModelDirect;
        /// The function address of `alGetStringDirect`.
        public final MemorySegment PFN_alGetStringDirect;
        /// The function address of `alGetBooleanvDirect`.
        public final MemorySegment PFN_alGetBooleanvDirect;
        /// The function address of `alGetIntegervDirect`.
        public final MemorySegment PFN_alGetIntegervDirect;
        /// The function address of `alGetFloatvDirect`.
        public final MemorySegment PFN_alGetFloatvDirect;
        /// The function address of `alGetDoublevDirect`.
        public final MemorySegment PFN_alGetDoublevDirect;
        /// The function address of `alGetBooleanDirect`.
        public final MemorySegment PFN_alGetBooleanDirect;
        /// The function address of `alGetIntegerDirect`.
        public final MemorySegment PFN_alGetIntegerDirect;
        /// The function address of `alGetFloatDirect`.
        public final MemorySegment PFN_alGetFloatDirect;
        /// The function address of `alGetDoubleDirect`.
        public final MemorySegment PFN_alGetDoubleDirect;
        /// The function address of `alGetErrorDirect`.
        public final MemorySegment PFN_alGetErrorDirect;
        /// The function address of `alIsExtensionPresentDirect`.
        public final MemorySegment PFN_alIsExtensionPresentDirect;
        /// The function address of `alGetProcAddressDirect`.
        public final MemorySegment PFN_alGetProcAddressDirect;
        /// The function address of `alGetEnumValueDirect`.
        public final MemorySegment PFN_alGetEnumValueDirect;
        /// The function address of `alListenerfDirect`.
        public final MemorySegment PFN_alListenerfDirect;
        /// The function address of `alListener3fDirect`.
        public final MemorySegment PFN_alListener3fDirect;
        /// The function address of `alListenerfvDirect`.
        public final MemorySegment PFN_alListenerfvDirect;
        /// The function address of `alListeneriDirect`.
        public final MemorySegment PFN_alListeneriDirect;
        /// The function address of `alListener3iDirect`.
        public final MemorySegment PFN_alListener3iDirect;
        /// The function address of `alListenerivDirect`.
        public final MemorySegment PFN_alListenerivDirect;
        /// The function address of `alGetListenerfDirect`.
        public final MemorySegment PFN_alGetListenerfDirect;
        /// The function address of `alGetListener3fDirect`.
        public final MemorySegment PFN_alGetListener3fDirect;
        /// The function address of `alGetListenerfvDirect`.
        public final MemorySegment PFN_alGetListenerfvDirect;
        /// The function address of `alGetListeneriDirect`.
        public final MemorySegment PFN_alGetListeneriDirect;
        /// The function address of `alGetListener3iDirect`.
        public final MemorySegment PFN_alGetListener3iDirect;
        /// The function address of `alGetListenerivDirect`.
        public final MemorySegment PFN_alGetListenerivDirect;
        /// The function address of `alGenSourcesDirect`.
        public final MemorySegment PFN_alGenSourcesDirect;
        /// The function address of `alDeleteSourcesDirect`.
        public final MemorySegment PFN_alDeleteSourcesDirect;
        /// The function address of `alIsSourceDirect`.
        public final MemorySegment PFN_alIsSourceDirect;
        /// The function address of `alSourcefDirect`.
        public final MemorySegment PFN_alSourcefDirect;
        /// The function address of `alSource3fDirect`.
        public final MemorySegment PFN_alSource3fDirect;
        /// The function address of `alSourcefvDirect`.
        public final MemorySegment PFN_alSourcefvDirect;
        /// The function address of `alSourceiDirect`.
        public final MemorySegment PFN_alSourceiDirect;
        /// The function address of `alSource3iDirect`.
        public final MemorySegment PFN_alSource3iDirect;
        /// The function address of `alSourceivDirect`.
        public final MemorySegment PFN_alSourceivDirect;
        /// The function address of `alGetSourcefDirect`.
        public final MemorySegment PFN_alGetSourcefDirect;
        /// The function address of `alGetSource3fDirect`.
        public final MemorySegment PFN_alGetSource3fDirect;
        /// The function address of `alGetSourcefvDirect`.
        public final MemorySegment PFN_alGetSourcefvDirect;
        /// The function address of `alGetSourceiDirect`.
        public final MemorySegment PFN_alGetSourceiDirect;
        /// The function address of `alGetSource3iDirect`.
        public final MemorySegment PFN_alGetSource3iDirect;
        /// The function address of `alGetSourceivDirect`.
        public final MemorySegment PFN_alGetSourceivDirect;
        /// The function address of `alSourcePlayDirect`.
        public final MemorySegment PFN_alSourcePlayDirect;
        /// The function address of `alSourceStopDirect`.
        public final MemorySegment PFN_alSourceStopDirect;
        /// The function address of `alSourceRewindDirect`.
        public final MemorySegment PFN_alSourceRewindDirect;
        /// The function address of `alSourcePauseDirect`.
        public final MemorySegment PFN_alSourcePauseDirect;
        /// The function address of `alSourcePlayvDirect`.
        public final MemorySegment PFN_alSourcePlayvDirect;
        /// The function address of `alSourceStopvDirect`.
        public final MemorySegment PFN_alSourceStopvDirect;
        /// The function address of `alSourceRewindvDirect`.
        public final MemorySegment PFN_alSourceRewindvDirect;
        /// The function address of `alSourcePausevDirect`.
        public final MemorySegment PFN_alSourcePausevDirect;
        /// The function address of `alSourceQueueBuffersDirect`.
        public final MemorySegment PFN_alSourceQueueBuffersDirect;
        /// The function address of `alSourceUnqueueBuffersDirect`.
        public final MemorySegment PFN_alSourceUnqueueBuffersDirect;
        /// The function address of `alGenBuffersDirect`.
        public final MemorySegment PFN_alGenBuffersDirect;
        /// The function address of `alDeleteBuffersDirect`.
        public final MemorySegment PFN_alDeleteBuffersDirect;
        /// The function address of `alIsBufferDirect`.
        public final MemorySegment PFN_alIsBufferDirect;
        /// The function address of `alBufferDataDirect`.
        public final MemorySegment PFN_alBufferDataDirect;
        /// The function address of `alBufferfDirect`.
        public final MemorySegment PFN_alBufferfDirect;
        /// The function address of `alBuffer3fDirect`.
        public final MemorySegment PFN_alBuffer3fDirect;
        /// The function address of `alBufferfvDirect`.
        public final MemorySegment PFN_alBufferfvDirect;
        /// The function address of `alBufferiDirect`.
        public final MemorySegment PFN_alBufferiDirect;
        /// The function address of `alBuffer3iDirect`.
        public final MemorySegment PFN_alBuffer3iDirect;
        /// The function address of `alBufferivDirect`.
        public final MemorySegment PFN_alBufferivDirect;
        /// The function address of `alGetBufferfDirect`.
        public final MemorySegment PFN_alGetBufferfDirect;
        /// The function address of `alGetBuffer3fDirect`.
        public final MemorySegment PFN_alGetBuffer3fDirect;
        /// The function address of `alGetBufferfvDirect`.
        public final MemorySegment PFN_alGetBufferfvDirect;
        /// The function address of `alGetBufferiDirect`.
        public final MemorySegment PFN_alGetBufferiDirect;
        /// The function address of `alGetBuffer3iDirect`.
        public final MemorySegment PFN_alGetBuffer3iDirect;
        /// The function address of `alGetBufferivDirect`.
        public final MemorySegment PFN_alGetBufferivDirect;
        /// The function address of `alGenEffectsDirect`.
        public final MemorySegment PFN_alGenEffectsDirect;
        /// The function address of `alDeleteEffectsDirect`.
        public final MemorySegment PFN_alDeleteEffectsDirect;
        /// The function address of `alIsEffectDirect`.
        public final MemorySegment PFN_alIsEffectDirect;
        /// The function address of `alEffectiDirect`.
        public final MemorySegment PFN_alEffectiDirect;
        /// The function address of `alEffectivDirect`.
        public final MemorySegment PFN_alEffectivDirect;
        /// The function address of `alEffectfDirect`.
        public final MemorySegment PFN_alEffectfDirect;
        /// The function address of `alEffectfvDirect`.
        public final MemorySegment PFN_alEffectfvDirect;
        /// The function address of `alGetEffectiDirect`.
        public final MemorySegment PFN_alGetEffectiDirect;
        /// The function address of `alGetEffectivDirect`.
        public final MemorySegment PFN_alGetEffectivDirect;
        /// The function address of `alGetEffectfDirect`.
        public final MemorySegment PFN_alGetEffectfDirect;
        /// The function address of `alGetEffectfvDirect`.
        public final MemorySegment PFN_alGetEffectfvDirect;
        /// The function address of `alGenFiltersDirect`.
        public final MemorySegment PFN_alGenFiltersDirect;
        /// The function address of `alDeleteFiltersDirect`.
        public final MemorySegment PFN_alDeleteFiltersDirect;
        /// The function address of `alIsFilterDirect`.
        public final MemorySegment PFN_alIsFilterDirect;
        /// The function address of `alFilteriDirect`.
        public final MemorySegment PFN_alFilteriDirect;
        /// The function address of `alFilterivDirect`.
        public final MemorySegment PFN_alFilterivDirect;
        /// The function address of `alFilterfDirect`.
        public final MemorySegment PFN_alFilterfDirect;
        /// The function address of `alFilterfvDirect`.
        public final MemorySegment PFN_alFilterfvDirect;
        /// The function address of `alGetFilteriDirect`.
        public final MemorySegment PFN_alGetFilteriDirect;
        /// The function address of `alGetFilterivDirect`.
        public final MemorySegment PFN_alGetFilterivDirect;
        /// The function address of `alGetFilterfDirect`.
        public final MemorySegment PFN_alGetFilterfDirect;
        /// The function address of `alGetFilterfvDirect`.
        public final MemorySegment PFN_alGetFilterfvDirect;
        /// The function address of `alGenAuxiliaryEffectSlotsDirect`.
        public final MemorySegment PFN_alGenAuxiliaryEffectSlotsDirect;
        /// The function address of `alDeleteAuxiliaryEffectSlotsDirect`.
        public final MemorySegment PFN_alDeleteAuxiliaryEffectSlotsDirect;
        /// The function address of `alIsAuxiliaryEffectSlotDirect`.
        public final MemorySegment PFN_alIsAuxiliaryEffectSlotDirect;
        /// The function address of `alAuxiliaryEffectSlotiDirect`.
        public final MemorySegment PFN_alAuxiliaryEffectSlotiDirect;
        /// The function address of `alAuxiliaryEffectSlotivDirect`.
        public final MemorySegment PFN_alAuxiliaryEffectSlotivDirect;
        /// The function address of `alAuxiliaryEffectSlotfDirect`.
        public final MemorySegment PFN_alAuxiliaryEffectSlotfDirect;
        /// The function address of `alAuxiliaryEffectSlotfvDirect`.
        public final MemorySegment PFN_alAuxiliaryEffectSlotfvDirect;
        /// The function address of `alGetAuxiliaryEffectSlotiDirect`.
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotiDirect;
        /// The function address of `alGetAuxiliaryEffectSlotivDirect`.
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotivDirect;
        /// The function address of `alGetAuxiliaryEffectSlotfDirect`.
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotfDirect;
        /// The function address of `alGetAuxiliaryEffectSlotfvDirect`.
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotfvDirect;
        /// The function address of `alBufferDataStaticDirect`.
        public final MemorySegment PFN_alBufferDataStaticDirect;
        /// The function address of `alDebugMessageCallbackDirectEXT`.
        public final MemorySegment PFN_alDebugMessageCallbackDirectEXT;
        /// The function address of `alDebugMessageInsertDirectEXT`.
        public final MemorySegment PFN_alDebugMessageInsertDirectEXT;
        /// The function address of `alDebugMessageControlDirectEXT`.
        public final MemorySegment PFN_alDebugMessageControlDirectEXT;
        /// The function address of `alPushDebugGroupDirectEXT`.
        public final MemorySegment PFN_alPushDebugGroupDirectEXT;
        /// The function address of `alPopDebugGroupDirectEXT`.
        public final MemorySegment PFN_alPopDebugGroupDirectEXT;
        /// The function address of `alGetDebugMessageLogDirectEXT`.
        public final MemorySegment PFN_alGetDebugMessageLogDirectEXT;
        /// The function address of `alObjectLabelDirectEXT`.
        public final MemorySegment PFN_alObjectLabelDirectEXT;
        /// The function address of `alGetObjectLabelDirectEXT`.
        public final MemorySegment PFN_alGetObjectLabelDirectEXT;
        /// The function address of `alGetPointerDirectEXT`.
        public final MemorySegment PFN_alGetPointerDirectEXT;
        /// The function address of `alGetPointervDirectEXT`.
        public final MemorySegment PFN_alGetPointervDirectEXT;
        /// The function address of `alRequestFoldbackStartDirect`.
        public final MemorySegment PFN_alRequestFoldbackStartDirect;
        /// The function address of `alRequestFoldbackStopDirect`.
        public final MemorySegment PFN_alRequestFoldbackStopDirect;
        /// The function address of `alBufferSubDataDirectSOFT`.
        public final MemorySegment PFN_alBufferSubDataDirectSOFT;
        /// The function address of `alSourcedDirectSOFT`.
        public final MemorySegment PFN_alSourcedDirectSOFT;
        /// The function address of `alSource3dDirectSOFT`.
        public final MemorySegment PFN_alSource3dDirectSOFT;
        /// The function address of `alSourcedvDirectSOFT`.
        public final MemorySegment PFN_alSourcedvDirectSOFT;
        /// The function address of `alGetSourcedDirectSOFT`.
        public final MemorySegment PFN_alGetSourcedDirectSOFT;
        /// The function address of `alGetSource3dDirectSOFT`.
        public final MemorySegment PFN_alGetSource3dDirectSOFT;
        /// The function address of `alGetSourcedvDirectSOFT`.
        public final MemorySegment PFN_alGetSourcedvDirectSOFT;
        /// The function address of `alSourcei64DirectSOFT`.
        public final MemorySegment PFN_alSourcei64DirectSOFT;
        /// The function address of `alSource3i64DirectSOFT`.
        public final MemorySegment PFN_alSource3i64DirectSOFT;
        /// The function address of `alSourcei64vDirectSOFT`.
        public final MemorySegment PFN_alSourcei64vDirectSOFT;
        /// The function address of `alGetSourcei64DirectSOFT`.
        public final MemorySegment PFN_alGetSourcei64DirectSOFT;
        /// The function address of `alGetSource3i64DirectSOFT`.
        public final MemorySegment PFN_alGetSource3i64DirectSOFT;
        /// The function address of `alGetSourcei64vDirectSOFT`.
        public final MemorySegment PFN_alGetSourcei64vDirectSOFT;
        /// The function address of `alDeferUpdatesDirectSOFT`.
        public final MemorySegment PFN_alDeferUpdatesDirectSOFT;
        /// The function address of `alProcessUpdatesDirectSOFT`.
        public final MemorySegment PFN_alProcessUpdatesDirectSOFT;
        /// The function address of `alGetStringiDirectSOFT`.
        public final MemorySegment PFN_alGetStringiDirectSOFT;
        /// The function address of `alEventControlDirectSOFT`.
        public final MemorySegment PFN_alEventControlDirectSOFT;
        /// The function address of `alEventCallbackDirectSOFT`.
        public final MemorySegment PFN_alEventCallbackDirectSOFT;
        /// The function address of `alGetPointerDirectSOFT`.
        public final MemorySegment PFN_alGetPointerDirectSOFT;
        /// The function address of `alGetPointervDirectSOFT`.
        public final MemorySegment PFN_alGetPointervDirectSOFT;
        /// The function address of `alBufferCallbackDirectSOFT`.
        public final MemorySegment PFN_alBufferCallbackDirectSOFT;
        /// The function address of `alGetBufferPtrDirectSOFT`.
        public final MemorySegment PFN_alGetBufferPtrDirectSOFT;
        /// The function address of `alGetBuffer3PtrDirectSOFT`.
        public final MemorySegment PFN_alGetBuffer3PtrDirectSOFT;
        /// The function address of `alGetBufferPtrvDirectSOFT`.
        public final MemorySegment PFN_alGetBufferPtrvDirectSOFT;
        /// The function address of `alSourcePlayAtTimeDirectSOFT`.
        public final MemorySegment PFN_alSourcePlayAtTimeDirectSOFT;
        /// The function address of `alSourcePlayAtTimevDirectSOFT`.
        public final MemorySegment PFN_alSourcePlayAtTimevDirectSOFT;
        /// The function address of `EAXSetDirect`.
        public final MemorySegment PFN_EAXSetDirect;
        /// The function address of `EAXGetDirect`.
        public final MemorySegment PFN_EAXGetDirect;
        /// The function address of `EAXSetBufferModeDirect`.
        public final MemorySegment PFN_EAXSetBufferModeDirect;
        /// The function address of `EAXGetBufferModeDirect`.
        public final MemorySegment PFN_EAXGetBufferModeDirect;
        private Handles() {
            PFN_alcGetProcAddress2 = ALInternal.lookup().find("alcGetProcAddress2").orElse(MemorySegment.NULL);
            PFN_alEnableDirect = ALInternal.lookup().find("alEnableDirect").orElse(MemorySegment.NULL);
            PFN_alDisableDirect = ALInternal.lookup().find("alDisableDirect").orElse(MemorySegment.NULL);
            PFN_alIsEnabledDirect = ALInternal.lookup().find("alIsEnabledDirect").orElse(MemorySegment.NULL);
            PFN_alDopplerFactorDirect = ALInternal.lookup().find("alDopplerFactorDirect").orElse(MemorySegment.NULL);
            PFN_alSpeedOfSoundDirect = ALInternal.lookup().find("alSpeedOfSoundDirect").orElse(MemorySegment.NULL);
            PFN_alDistanceModelDirect = ALInternal.lookup().find("alDistanceModelDirect").orElse(MemorySegment.NULL);
            PFN_alGetStringDirect = ALInternal.lookup().find("alGetStringDirect").orElse(MemorySegment.NULL);
            PFN_alGetBooleanvDirect = ALInternal.lookup().find("alGetBooleanvDirect").orElse(MemorySegment.NULL);
            PFN_alGetIntegervDirect = ALInternal.lookup().find("alGetIntegervDirect").orElse(MemorySegment.NULL);
            PFN_alGetFloatvDirect = ALInternal.lookup().find("alGetFloatvDirect").orElse(MemorySegment.NULL);
            PFN_alGetDoublevDirect = ALInternal.lookup().find("alGetDoublevDirect").orElse(MemorySegment.NULL);
            PFN_alGetBooleanDirect = ALInternal.lookup().find("alGetBooleanDirect").orElse(MemorySegment.NULL);
            PFN_alGetIntegerDirect = ALInternal.lookup().find("alGetIntegerDirect").orElse(MemorySegment.NULL);
            PFN_alGetFloatDirect = ALInternal.lookup().find("alGetFloatDirect").orElse(MemorySegment.NULL);
            PFN_alGetDoubleDirect = ALInternal.lookup().find("alGetDoubleDirect").orElse(MemorySegment.NULL);
            PFN_alGetErrorDirect = ALInternal.lookup().find("alGetErrorDirect").orElse(MemorySegment.NULL);
            PFN_alIsExtensionPresentDirect = ALInternal.lookup().find("alIsExtensionPresentDirect").orElse(MemorySegment.NULL);
            PFN_alGetProcAddressDirect = ALInternal.lookup().find("alGetProcAddressDirect").orElse(MemorySegment.NULL);
            PFN_alGetEnumValueDirect = ALInternal.lookup().find("alGetEnumValueDirect").orElse(MemorySegment.NULL);
            PFN_alListenerfDirect = ALInternal.lookup().find("alListenerfDirect").orElse(MemorySegment.NULL);
            PFN_alListener3fDirect = ALInternal.lookup().find("alListener3fDirect").orElse(MemorySegment.NULL);
            PFN_alListenerfvDirect = ALInternal.lookup().find("alListenerfvDirect").orElse(MemorySegment.NULL);
            PFN_alListeneriDirect = ALInternal.lookup().find("alListeneriDirect").orElse(MemorySegment.NULL);
            PFN_alListener3iDirect = ALInternal.lookup().find("alListener3iDirect").orElse(MemorySegment.NULL);
            PFN_alListenerivDirect = ALInternal.lookup().find("alListenerivDirect").orElse(MemorySegment.NULL);
            PFN_alGetListenerfDirect = ALInternal.lookup().find("alGetListenerfDirect").orElse(MemorySegment.NULL);
            PFN_alGetListener3fDirect = ALInternal.lookup().find("alGetListener3fDirect").orElse(MemorySegment.NULL);
            PFN_alGetListenerfvDirect = ALInternal.lookup().find("alGetListenerfvDirect").orElse(MemorySegment.NULL);
            PFN_alGetListeneriDirect = ALInternal.lookup().find("alGetListeneriDirect").orElse(MemorySegment.NULL);
            PFN_alGetListener3iDirect = ALInternal.lookup().find("alGetListener3iDirect").orElse(MemorySegment.NULL);
            PFN_alGetListenerivDirect = ALInternal.lookup().find("alGetListenerivDirect").orElse(MemorySegment.NULL);
            PFN_alGenSourcesDirect = ALInternal.lookup().find("alGenSourcesDirect").orElse(MemorySegment.NULL);
            PFN_alDeleteSourcesDirect = ALInternal.lookup().find("alDeleteSourcesDirect").orElse(MemorySegment.NULL);
            PFN_alIsSourceDirect = ALInternal.lookup().find("alIsSourceDirect").orElse(MemorySegment.NULL);
            PFN_alSourcefDirect = ALInternal.lookup().find("alSourcefDirect").orElse(MemorySegment.NULL);
            PFN_alSource3fDirect = ALInternal.lookup().find("alSource3fDirect").orElse(MemorySegment.NULL);
            PFN_alSourcefvDirect = ALInternal.lookup().find("alSourcefvDirect").orElse(MemorySegment.NULL);
            PFN_alSourceiDirect = ALInternal.lookup().find("alSourceiDirect").orElse(MemorySegment.NULL);
            PFN_alSource3iDirect = ALInternal.lookup().find("alSource3iDirect").orElse(MemorySegment.NULL);
            PFN_alSourceivDirect = ALInternal.lookup().find("alSourceivDirect").orElse(MemorySegment.NULL);
            PFN_alGetSourcefDirect = ALInternal.lookup().find("alGetSourcefDirect").orElse(MemorySegment.NULL);
            PFN_alGetSource3fDirect = ALInternal.lookup().find("alGetSource3fDirect").orElse(MemorySegment.NULL);
            PFN_alGetSourcefvDirect = ALInternal.lookup().find("alGetSourcefvDirect").orElse(MemorySegment.NULL);
            PFN_alGetSourceiDirect = ALInternal.lookup().find("alGetSourceiDirect").orElse(MemorySegment.NULL);
            PFN_alGetSource3iDirect = ALInternal.lookup().find("alGetSource3iDirect").orElse(MemorySegment.NULL);
            PFN_alGetSourceivDirect = ALInternal.lookup().find("alGetSourceivDirect").orElse(MemorySegment.NULL);
            PFN_alSourcePlayDirect = ALInternal.lookup().find("alSourcePlayDirect").orElse(MemorySegment.NULL);
            PFN_alSourceStopDirect = ALInternal.lookup().find("alSourceStopDirect").orElse(MemorySegment.NULL);
            PFN_alSourceRewindDirect = ALInternal.lookup().find("alSourceRewindDirect").orElse(MemorySegment.NULL);
            PFN_alSourcePauseDirect = ALInternal.lookup().find("alSourcePauseDirect").orElse(MemorySegment.NULL);
            PFN_alSourcePlayvDirect = ALInternal.lookup().find("alSourcePlayvDirect").orElse(MemorySegment.NULL);
            PFN_alSourceStopvDirect = ALInternal.lookup().find("alSourceStopvDirect").orElse(MemorySegment.NULL);
            PFN_alSourceRewindvDirect = ALInternal.lookup().find("alSourceRewindvDirect").orElse(MemorySegment.NULL);
            PFN_alSourcePausevDirect = ALInternal.lookup().find("alSourcePausevDirect").orElse(MemorySegment.NULL);
            PFN_alSourceQueueBuffersDirect = ALInternal.lookup().find("alSourceQueueBuffersDirect").orElse(MemorySegment.NULL);
            PFN_alSourceUnqueueBuffersDirect = ALInternal.lookup().find("alSourceUnqueueBuffersDirect").orElse(MemorySegment.NULL);
            PFN_alGenBuffersDirect = ALInternal.lookup().find("alGenBuffersDirect").orElse(MemorySegment.NULL);
            PFN_alDeleteBuffersDirect = ALInternal.lookup().find("alDeleteBuffersDirect").orElse(MemorySegment.NULL);
            PFN_alIsBufferDirect = ALInternal.lookup().find("alIsBufferDirect").orElse(MemorySegment.NULL);
            PFN_alBufferDataDirect = ALInternal.lookup().find("alBufferDataDirect").orElse(MemorySegment.NULL);
            PFN_alBufferfDirect = ALInternal.lookup().find("alBufferfDirect").orElse(MemorySegment.NULL);
            PFN_alBuffer3fDirect = ALInternal.lookup().find("alBuffer3fDirect").orElse(MemorySegment.NULL);
            PFN_alBufferfvDirect = ALInternal.lookup().find("alBufferfvDirect").orElse(MemorySegment.NULL);
            PFN_alBufferiDirect = ALInternal.lookup().find("alBufferiDirect").orElse(MemorySegment.NULL);
            PFN_alBuffer3iDirect = ALInternal.lookup().find("alBuffer3iDirect").orElse(MemorySegment.NULL);
            PFN_alBufferivDirect = ALInternal.lookup().find("alBufferivDirect").orElse(MemorySegment.NULL);
            PFN_alGetBufferfDirect = ALInternal.lookup().find("alGetBufferfDirect").orElse(MemorySegment.NULL);
            PFN_alGetBuffer3fDirect = ALInternal.lookup().find("alGetBuffer3fDirect").orElse(MemorySegment.NULL);
            PFN_alGetBufferfvDirect = ALInternal.lookup().find("alGetBufferfvDirect").orElse(MemorySegment.NULL);
            PFN_alGetBufferiDirect = ALInternal.lookup().find("alGetBufferiDirect").orElse(MemorySegment.NULL);
            PFN_alGetBuffer3iDirect = ALInternal.lookup().find("alGetBuffer3iDirect").orElse(MemorySegment.NULL);
            PFN_alGetBufferivDirect = ALInternal.lookup().find("alGetBufferivDirect").orElse(MemorySegment.NULL);
            PFN_alGenEffectsDirect = ALInternal.lookup().find("alGenEffectsDirect").orElse(MemorySegment.NULL);
            PFN_alDeleteEffectsDirect = ALInternal.lookup().find("alDeleteEffectsDirect").orElse(MemorySegment.NULL);
            PFN_alIsEffectDirect = ALInternal.lookup().find("alIsEffectDirect").orElse(MemorySegment.NULL);
            PFN_alEffectiDirect = ALInternal.lookup().find("alEffectiDirect").orElse(MemorySegment.NULL);
            PFN_alEffectivDirect = ALInternal.lookup().find("alEffectivDirect").orElse(MemorySegment.NULL);
            PFN_alEffectfDirect = ALInternal.lookup().find("alEffectfDirect").orElse(MemorySegment.NULL);
            PFN_alEffectfvDirect = ALInternal.lookup().find("alEffectfvDirect").orElse(MemorySegment.NULL);
            PFN_alGetEffectiDirect = ALInternal.lookup().find("alGetEffectiDirect").orElse(MemorySegment.NULL);
            PFN_alGetEffectivDirect = ALInternal.lookup().find("alGetEffectivDirect").orElse(MemorySegment.NULL);
            PFN_alGetEffectfDirect = ALInternal.lookup().find("alGetEffectfDirect").orElse(MemorySegment.NULL);
            PFN_alGetEffectfvDirect = ALInternal.lookup().find("alGetEffectfvDirect").orElse(MemorySegment.NULL);
            PFN_alGenFiltersDirect = ALInternal.lookup().find("alGenFiltersDirect").orElse(MemorySegment.NULL);
            PFN_alDeleteFiltersDirect = ALInternal.lookup().find("alDeleteFiltersDirect").orElse(MemorySegment.NULL);
            PFN_alIsFilterDirect = ALInternal.lookup().find("alIsFilterDirect").orElse(MemorySegment.NULL);
            PFN_alFilteriDirect = ALInternal.lookup().find("alFilteriDirect").orElse(MemorySegment.NULL);
            PFN_alFilterivDirect = ALInternal.lookup().find("alFilterivDirect").orElse(MemorySegment.NULL);
            PFN_alFilterfDirect = ALInternal.lookup().find("alFilterfDirect").orElse(MemorySegment.NULL);
            PFN_alFilterfvDirect = ALInternal.lookup().find("alFilterfvDirect").orElse(MemorySegment.NULL);
            PFN_alGetFilteriDirect = ALInternal.lookup().find("alGetFilteriDirect").orElse(MemorySegment.NULL);
            PFN_alGetFilterivDirect = ALInternal.lookup().find("alGetFilterivDirect").orElse(MemorySegment.NULL);
            PFN_alGetFilterfDirect = ALInternal.lookup().find("alGetFilterfDirect").orElse(MemorySegment.NULL);
            PFN_alGetFilterfvDirect = ALInternal.lookup().find("alGetFilterfvDirect").orElse(MemorySegment.NULL);
            PFN_alGenAuxiliaryEffectSlotsDirect = ALInternal.lookup().find("alGenAuxiliaryEffectSlotsDirect").orElse(MemorySegment.NULL);
            PFN_alDeleteAuxiliaryEffectSlotsDirect = ALInternal.lookup().find("alDeleteAuxiliaryEffectSlotsDirect").orElse(MemorySegment.NULL);
            PFN_alIsAuxiliaryEffectSlotDirect = ALInternal.lookup().find("alIsAuxiliaryEffectSlotDirect").orElse(MemorySegment.NULL);
            PFN_alAuxiliaryEffectSlotiDirect = ALInternal.lookup().find("alAuxiliaryEffectSlotiDirect").orElse(MemorySegment.NULL);
            PFN_alAuxiliaryEffectSlotivDirect = ALInternal.lookup().find("alAuxiliaryEffectSlotivDirect").orElse(MemorySegment.NULL);
            PFN_alAuxiliaryEffectSlotfDirect = ALInternal.lookup().find("alAuxiliaryEffectSlotfDirect").orElse(MemorySegment.NULL);
            PFN_alAuxiliaryEffectSlotfvDirect = ALInternal.lookup().find("alAuxiliaryEffectSlotfvDirect").orElse(MemorySegment.NULL);
            PFN_alGetAuxiliaryEffectSlotiDirect = ALInternal.lookup().find("alGetAuxiliaryEffectSlotiDirect").orElse(MemorySegment.NULL);
            PFN_alGetAuxiliaryEffectSlotivDirect = ALInternal.lookup().find("alGetAuxiliaryEffectSlotivDirect").orElse(MemorySegment.NULL);
            PFN_alGetAuxiliaryEffectSlotfDirect = ALInternal.lookup().find("alGetAuxiliaryEffectSlotfDirect").orElse(MemorySegment.NULL);
            PFN_alGetAuxiliaryEffectSlotfvDirect = ALInternal.lookup().find("alGetAuxiliaryEffectSlotfvDirect").orElse(MemorySegment.NULL);
            PFN_alBufferDataStaticDirect = ALInternal.lookup().find("alBufferDataStaticDirect").orElse(MemorySegment.NULL);
            PFN_alDebugMessageCallbackDirectEXT = ALInternal.lookup().find("alDebugMessageCallbackDirectEXT").orElse(MemorySegment.NULL);
            PFN_alDebugMessageInsertDirectEXT = ALInternal.lookup().find("alDebugMessageInsertDirectEXT").orElse(MemorySegment.NULL);
            PFN_alDebugMessageControlDirectEXT = ALInternal.lookup().find("alDebugMessageControlDirectEXT").orElse(MemorySegment.NULL);
            PFN_alPushDebugGroupDirectEXT = ALInternal.lookup().find("alPushDebugGroupDirectEXT").orElse(MemorySegment.NULL);
            PFN_alPopDebugGroupDirectEXT = ALInternal.lookup().find("alPopDebugGroupDirectEXT").orElse(MemorySegment.NULL);
            PFN_alGetDebugMessageLogDirectEXT = ALInternal.lookup().find("alGetDebugMessageLogDirectEXT").orElse(MemorySegment.NULL);
            PFN_alObjectLabelDirectEXT = ALInternal.lookup().find("alObjectLabelDirectEXT").orElse(MemorySegment.NULL);
            PFN_alGetObjectLabelDirectEXT = ALInternal.lookup().find("alGetObjectLabelDirectEXT").orElse(MemorySegment.NULL);
            PFN_alGetPointerDirectEXT = ALInternal.lookup().find("alGetPointerDirectEXT").orElse(MemorySegment.NULL);
            PFN_alGetPointervDirectEXT = ALInternal.lookup().find("alGetPointervDirectEXT").orElse(MemorySegment.NULL);
            PFN_alRequestFoldbackStartDirect = ALInternal.lookup().find("alRequestFoldbackStartDirect").orElse(MemorySegment.NULL);
            PFN_alRequestFoldbackStopDirect = ALInternal.lookup().find("alRequestFoldbackStopDirect").orElse(MemorySegment.NULL);
            PFN_alBufferSubDataDirectSOFT = ALInternal.lookup().find("alBufferSubDataDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcedDirectSOFT = ALInternal.lookup().find("alSourcedDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSource3dDirectSOFT = ALInternal.lookup().find("alSource3dDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcedvDirectSOFT = ALInternal.lookup().find("alSourcedvDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcedDirectSOFT = ALInternal.lookup().find("alGetSourcedDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSource3dDirectSOFT = ALInternal.lookup().find("alGetSource3dDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcedvDirectSOFT = ALInternal.lookup().find("alGetSourcedvDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcei64DirectSOFT = ALInternal.lookup().find("alSourcei64DirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSource3i64DirectSOFT = ALInternal.lookup().find("alSource3i64DirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcei64vDirectSOFT = ALInternal.lookup().find("alSourcei64vDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcei64DirectSOFT = ALInternal.lookup().find("alGetSourcei64DirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSource3i64DirectSOFT = ALInternal.lookup().find("alGetSource3i64DirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcei64vDirectSOFT = ALInternal.lookup().find("alGetSourcei64vDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alDeferUpdatesDirectSOFT = ALInternal.lookup().find("alDeferUpdatesDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alProcessUpdatesDirectSOFT = ALInternal.lookup().find("alProcessUpdatesDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetStringiDirectSOFT = ALInternal.lookup().find("alGetStringiDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alEventControlDirectSOFT = ALInternal.lookup().find("alEventControlDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alEventCallbackDirectSOFT = ALInternal.lookup().find("alEventCallbackDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetPointerDirectSOFT = ALInternal.lookup().find("alGetPointerDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetPointervDirectSOFT = ALInternal.lookup().find("alGetPointervDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alBufferCallbackDirectSOFT = ALInternal.lookup().find("alBufferCallbackDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBufferPtrDirectSOFT = ALInternal.lookup().find("alGetBufferPtrDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBuffer3PtrDirectSOFT = ALInternal.lookup().find("alGetBuffer3PtrDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBufferPtrvDirectSOFT = ALInternal.lookup().find("alGetBufferPtrvDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcePlayAtTimeDirectSOFT = ALInternal.lookup().find("alSourcePlayAtTimeDirectSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcePlayAtTimevDirectSOFT = ALInternal.lookup().find("alSourcePlayAtTimevDirectSOFT").orElse(MemorySegment.NULL);
            PFN_EAXSetDirect = ALInternal.lookup().find("EAXSetDirect").orElse(MemorySegment.NULL);
            PFN_EAXGetDirect = ALInternal.lookup().find("EAXGetDirect").orElse(MemorySegment.NULL);
            PFN_EAXSetBufferModeDirect = ALInternal.lookup().find("EAXSetBufferModeDirect").orElse(MemorySegment.NULL);
            PFN_EAXGetBufferModeDirect = ALInternal.lookup().find("EAXGetBufferModeDirect").orElse(MemorySegment.NULL);
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

    public static @CType("ALCvoid *") MemorySegment alcGetProcAddress2(@CType("ALCdevice *") MemorySegment device, @CType("const ALCchar*") MemorySegment funcName) {
        if (Handles.MH_alcGetProcAddress2 == null) throw new SymbolNotFoundError("Symbol not found: alcGetProcAddress2");
        try {
            return (MemorySegment) Handles.MH_alcGetProcAddress2.invokeExact(Handles.get().PFN_alcGetProcAddress2, device, funcName);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress2", e); }
    }

    public static void alEnableDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alEnableDirect == null) throw new SymbolNotFoundError("Symbol not found: alEnableDirect");
        try {
            Handles.MH_alEnableDirect.invokeExact(Handles.get().PFN_alEnableDirect, context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnableDirect", e); }
    }

    public static void alDisableDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alDisableDirect == null) throw new SymbolNotFoundError("Symbol not found: alDisableDirect");
        try {
            Handles.MH_alDisableDirect.invokeExact(Handles.get().PFN_alDisableDirect, context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisableDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsEnabledDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alIsEnabledDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsEnabledDirect");
        try {
            return (boolean) Handles.MH_alIsEnabledDirect.invokeExact(Handles.get().PFN_alIsEnabledDirect, context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabledDirect", e); }
    }

    public static void alDopplerFactorDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALfloat") float value) {
        if (Handles.MH_alDopplerFactorDirect == null) throw new SymbolNotFoundError("Symbol not found: alDopplerFactorDirect");
        try {
            Handles.MH_alDopplerFactorDirect.invokeExact(Handles.get().PFN_alDopplerFactorDirect, context, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactorDirect", e); }
    }

    public static void alSpeedOfSoundDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALfloat") float value) {
        if (Handles.MH_alSpeedOfSoundDirect == null) throw new SymbolNotFoundError("Symbol not found: alSpeedOfSoundDirect");
        try {
            Handles.MH_alSpeedOfSoundDirect.invokeExact(Handles.get().PFN_alSpeedOfSoundDirect, context, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSoundDirect", e); }
    }

    public static void alDistanceModelDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int distanceModel) {
        if (Handles.MH_alDistanceModelDirect == null) throw new SymbolNotFoundError("Symbol not found: alDistanceModelDirect");
        try {
            Handles.MH_alDistanceModelDirect.invokeExact(Handles.get().PFN_alDistanceModelDirect, context, distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModelDirect", e); }
    }

    public static @CType("const ALchar*") MemorySegment alGetStringDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetStringDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetStringDirect");
        try {
            return (MemorySegment) Handles.MH_alGetStringDirect.invokeExact(Handles.get().PFN_alGetStringDirect, context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetStringDirect", e); }
    }

    public static void alGetBooleanvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALboolean *") MemorySegment values) {
        if (Handles.MH_alGetBooleanvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBooleanvDirect");
        try {
            Handles.MH_alGetBooleanvDirect.invokeExact(Handles.get().PFN_alGetBooleanvDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanvDirect", e); }
    }

    public static void alGetIntegervDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint *") MemorySegment values) {
        if (Handles.MH_alGetIntegervDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetIntegervDirect");
        try {
            Handles.MH_alGetIntegervDirect.invokeExact(Handles.get().PFN_alGetIntegervDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegervDirect", e); }
    }

    public static void alGetFloatvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment values) {
        if (Handles.MH_alGetFloatvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFloatvDirect");
        try {
            Handles.MH_alGetFloatvDirect.invokeExact(Handles.get().PFN_alGetFloatvDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatvDirect", e); }
    }

    public static void alGetDoublevDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment values) {
        if (Handles.MH_alGetDoublevDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetDoublevDirect");
        try {
            Handles.MH_alGetDoublevDirect.invokeExact(Handles.get().PFN_alGetDoublevDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublevDirect", e); }
    }

    public static @CType("ALboolean") boolean alGetBooleanDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetBooleanDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBooleanDirect");
        try {
            return (boolean) Handles.MH_alGetBooleanDirect.invokeExact(Handles.get().PFN_alGetBooleanDirect, context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanDirect", e); }
    }

    public static @CType("ALint") int alGetIntegerDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetIntegerDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetIntegerDirect");
        try {
            return (int) Handles.MH_alGetIntegerDirect.invokeExact(Handles.get().PFN_alGetIntegerDirect, context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerDirect", e); }
    }

    public static @CType("ALfloat") float alGetFloatDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetFloatDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFloatDirect");
        try {
            return (float) Handles.MH_alGetFloatDirect.invokeExact(Handles.get().PFN_alGetFloatDirect, context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatDirect", e); }
    }

    public static @CType("ALdouble") double alGetDoubleDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetDoubleDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetDoubleDirect");
        try {
            return (double) Handles.MH_alGetDoubleDirect.invokeExact(Handles.get().PFN_alGetDoubleDirect, context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoubleDirect", e); }
    }

    public static @CType("ALenum") int alGetErrorDirect(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alGetErrorDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetErrorDirect");
        try {
            return (int) Handles.MH_alGetErrorDirect.invokeExact(Handles.get().PFN_alGetErrorDirect, context);
        } catch (Throwable e) { throw new RuntimeException("error in alGetErrorDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresentDirect(@CType("ALCcontext *") MemorySegment context, @CType("const ALchar*") MemorySegment extname) {
        if (Handles.MH_alIsExtensionPresentDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsExtensionPresentDirect");
        try {
            return (boolean) Handles.MH_alIsExtensionPresentDirect.invokeExact(Handles.get().PFN_alIsExtensionPresentDirect, context, extname);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresentDirect", e); }
    }

    public static @CType("void*") MemorySegment alGetProcAddressDirect(@CType("ALCcontext *") MemorySegment context, @CType("const ALchar*") MemorySegment fname) {
        if (Handles.MH_alGetProcAddressDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetProcAddressDirect");
        try {
            return (MemorySegment) Handles.MH_alGetProcAddressDirect.invokeExact(Handles.get().PFN_alGetProcAddressDirect, context, fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddressDirect", e); }
    }

    public static @CType("ALenum") int alGetEnumValueDirect(@CType("ALCcontext *") MemorySegment context, @CType("const ALchar*") MemorySegment ename) {
        if (Handles.MH_alGetEnumValueDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEnumValueDirect");
        try {
            return (int) Handles.MH_alGetEnumValueDirect.invokeExact(Handles.get().PFN_alGetEnumValueDirect, context, ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValueDirect", e); }
    }

    public static void alListenerfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alListenerfDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerfDirect");
        try {
            Handles.MH_alListenerfDirect.invokeExact(Handles.get().PFN_alListenerfDirect, context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfDirect", e); }
    }

    public static void alListener3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alListener3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alListener3fDirect");
        try {
            Handles.MH_alListener3fDirect.invokeExact(Handles.get().PFN_alListener3fDirect, context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3fDirect", e); }
    }

    public static void alListenerfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        if (Handles.MH_alListenerfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerfvDirect");
        try {
            Handles.MH_alListenerfvDirect.invokeExact(Handles.get().PFN_alListenerfvDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfvDirect", e); }
    }

    public static void alListeneriDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alListeneriDirect == null) throw new SymbolNotFoundError("Symbol not found: alListeneriDirect");
        try {
            Handles.MH_alListeneriDirect.invokeExact(Handles.get().PFN_alListeneriDirect, context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriDirect", e); }
    }

    public static void alListener3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alListener3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alListener3iDirect");
        try {
            Handles.MH_alListener3iDirect.invokeExact(Handles.get().PFN_alListener3iDirect, context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3iDirect", e); }
    }

    public static void alListenerivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        if (Handles.MH_alListenerivDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerivDirect");
        try {
            Handles.MH_alListenerivDirect.invokeExact(Handles.get().PFN_alListenerivDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerivDirect", e); }
    }

    public static void alGetListenerfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value) {
        if (Handles.MH_alGetListenerfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerfDirect");
        try {
            Handles.MH_alGetListenerfDirect.invokeExact(Handles.get().PFN_alGetListenerfDirect, context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfDirect", e); }
    }

    public static void alGetListener3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value1, @CType("ALfloat *") MemorySegment value2, @CType("ALfloat *") MemorySegment value3) {
        if (Handles.MH_alGetListener3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListener3fDirect");
        try {
            Handles.MH_alGetListener3fDirect.invokeExact(Handles.get().PFN_alGetListener3fDirect, context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3fDirect", e); }
    }

    public static void alGetListenerfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment values) {
        if (Handles.MH_alGetListenerfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerfvDirect");
        try {
            Handles.MH_alGetListenerfvDirect.invokeExact(Handles.get().PFN_alGetListenerfvDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfvDirect", e); }
    }

    public static void alGetListeneriDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint *") MemorySegment value) {
        if (Handles.MH_alGetListeneriDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListeneriDirect");
        try {
            Handles.MH_alGetListeneriDirect.invokeExact(Handles.get().PFN_alGetListeneriDirect, context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriDirect", e); }
    }

    public static void alGetListener3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint *") MemorySegment value1, @CType("ALint *") MemorySegment value2, @CType("ALint *") MemorySegment value3) {
        if (Handles.MH_alGetListener3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListener3iDirect");
        try {
            Handles.MH_alGetListener3iDirect.invokeExact(Handles.get().PFN_alGetListener3iDirect, context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3iDirect", e); }
    }

    public static void alGetListenerivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int param, @CType("ALint *") MemorySegment values) {
        if (Handles.MH_alGetListenerivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerivDirect");
        try {
            Handles.MH_alGetListenerivDirect.invokeExact(Handles.get().PFN_alGetListenerivDirect, context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerivDirect", e); }
    }

    public static void alGenSourcesDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") MemorySegment sources) {
        if (Handles.MH_alGenSourcesDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenSourcesDirect");
        try {
            Handles.MH_alGenSourcesDirect.invokeExact(Handles.get().PFN_alGenSourcesDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSourcesDirect", e); }
    }

    public static void alDeleteSourcesDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        if (Handles.MH_alDeleteSourcesDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteSourcesDirect");
        try {
            Handles.MH_alDeleteSourcesDirect.invokeExact(Handles.get().PFN_alDeleteSourcesDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSourcesDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsSourceDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alIsSourceDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsSourceDirect");
        try {
            return (boolean) Handles.MH_alIsSourceDirect.invokeExact(Handles.get().PFN_alIsSourceDirect, context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSourceDirect", e); }
    }

    public static void alSourcefDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alSourcefDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcefDirect");
        try {
            Handles.MH_alSourcefDirect.invokeExact(Handles.get().PFN_alSourcefDirect, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefDirect", e); }
    }

    public static void alSource3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alSource3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alSource3fDirect");
        try {
            Handles.MH_alSource3fDirect.invokeExact(Handles.get().PFN_alSource3fDirect, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3fDirect", e); }
    }

    public static void alSourcefvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        if (Handles.MH_alSourcefvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcefvDirect");
        try {
            Handles.MH_alSourcefvDirect.invokeExact(Handles.get().PFN_alSourcefvDirect, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefvDirect", e); }
    }

    public static void alSourceiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alSourceiDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceiDirect");
        try {
            Handles.MH_alSourceiDirect.invokeExact(Handles.get().PFN_alSourceiDirect, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiDirect", e); }
    }

    public static void alSource3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alSource3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alSource3iDirect");
        try {
            Handles.MH_alSource3iDirect.invokeExact(Handles.get().PFN_alSource3iDirect, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3iDirect", e); }
    }

    public static void alSourceivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        if (Handles.MH_alSourceivDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceivDirect");
        try {
            Handles.MH_alSourceivDirect.invokeExact(Handles.get().PFN_alSourceivDirect, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceivDirect", e); }
    }

    public static void alGetSourcefDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value) {
        if (Handles.MH_alGetSourcefDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcefDirect");
        try {
            Handles.MH_alGetSourcefDirect.invokeExact(Handles.get().PFN_alGetSourcefDirect, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefDirect", e); }
    }

    public static void alGetSource3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value1, @CType("ALfloat *") MemorySegment value2, @CType("ALfloat *") MemorySegment value3) {
        if (Handles.MH_alGetSource3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3fDirect");
        try {
            Handles.MH_alGetSource3fDirect.invokeExact(Handles.get().PFN_alGetSource3fDirect, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3fDirect", e); }
    }

    public static void alGetSourcefvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment values) {
        if (Handles.MH_alGetSourcefvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcefvDirect");
        try {
            Handles.MH_alGetSourcefvDirect.invokeExact(Handles.get().PFN_alGetSourcefvDirect, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefvDirect", e); }
    }

    public static void alGetSourceiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") MemorySegment value) {
        if (Handles.MH_alGetSourceiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourceiDirect");
        try {
            Handles.MH_alGetSourceiDirect.invokeExact(Handles.get().PFN_alGetSourceiDirect, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiDirect", e); }
    }

    public static void alGetSource3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") MemorySegment value1, @CType("ALint *") MemorySegment value2, @CType("ALint *") MemorySegment value3) {
        if (Handles.MH_alGetSource3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3iDirect");
        try {
            Handles.MH_alGetSource3iDirect.invokeExact(Handles.get().PFN_alGetSource3iDirect, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3iDirect", e); }
    }

    public static void alGetSourceivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") MemorySegment values) {
        if (Handles.MH_alGetSourceivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourceivDirect");
        try {
            Handles.MH_alGetSourceivDirect.invokeExact(Handles.get().PFN_alGetSourceivDirect, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceivDirect", e); }
    }

    public static void alSourcePlayDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourcePlayDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayDirect");
        try {
            Handles.MH_alSourcePlayDirect.invokeExact(Handles.get().PFN_alSourcePlayDirect, context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayDirect", e); }
    }

    public static void alSourceStopDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourceStopDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceStopDirect");
        try {
            Handles.MH_alSourceStopDirect.invokeExact(Handles.get().PFN_alSourceStopDirect, context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopDirect", e); }
    }

    public static void alSourceRewindDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourceRewindDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceRewindDirect");
        try {
            Handles.MH_alSourceRewindDirect.invokeExact(Handles.get().PFN_alSourceRewindDirect, context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindDirect", e); }
    }

    public static void alSourcePauseDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourcePauseDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePauseDirect");
        try {
            Handles.MH_alSourcePauseDirect.invokeExact(Handles.get().PFN_alSourcePauseDirect, context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePauseDirect", e); }
    }

    public static void alSourcePlayvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        if (Handles.MH_alSourcePlayvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayvDirect");
        try {
            Handles.MH_alSourcePlayvDirect.invokeExact(Handles.get().PFN_alSourcePlayvDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayvDirect", e); }
    }

    public static void alSourceStopvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        if (Handles.MH_alSourceStopvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceStopvDirect");
        try {
            Handles.MH_alSourceStopvDirect.invokeExact(Handles.get().PFN_alSourceStopvDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopvDirect", e); }
    }

    public static void alSourceRewindvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        if (Handles.MH_alSourceRewindvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceRewindvDirect");
        try {
            Handles.MH_alSourceRewindvDirect.invokeExact(Handles.get().PFN_alSourceRewindvDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindvDirect", e); }
    }

    public static void alSourcePausevDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources) {
        if (Handles.MH_alSourcePausevDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePausevDirect");
        try {
            Handles.MH_alSourcePausevDirect.invokeExact(Handles.get().PFN_alSourcePausevDirect, context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausevDirect", e); }
    }

    public static void alSourceQueueBuffersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALsizei") int nb, @CType("const ALuint *") MemorySegment buffers) {
        if (Handles.MH_alSourceQueueBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceQueueBuffersDirect");
        try {
            Handles.MH_alSourceQueueBuffersDirect.invokeExact(Handles.get().PFN_alSourceQueueBuffersDirect, context, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffersDirect", e); }
    }

    public static void alSourceUnqueueBuffersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALsizei") int nb, @CType("ALuint *") MemorySegment buffers) {
        if (Handles.MH_alSourceUnqueueBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceUnqueueBuffersDirect");
        try {
            Handles.MH_alSourceUnqueueBuffersDirect.invokeExact(Handles.get().PFN_alSourceUnqueueBuffersDirect, context, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffersDirect", e); }
    }

    public static void alGenBuffersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") MemorySegment buffers) {
        if (Handles.MH_alGenBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenBuffersDirect");
        try {
            Handles.MH_alGenBuffersDirect.invokeExact(Handles.get().PFN_alGenBuffersDirect, context, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffersDirect", e); }
    }

    public static void alDeleteBuffersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment buffers) {
        if (Handles.MH_alDeleteBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteBuffersDirect");
        try {
            Handles.MH_alDeleteBuffersDirect.invokeExact(Handles.get().PFN_alDeleteBuffersDirect, context, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffersDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsBufferDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer) {
        if (Handles.MH_alIsBufferDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsBufferDirect");
        try {
            return (boolean) Handles.MH_alIsBufferDirect.invokeExact(Handles.get().PFN_alIsBufferDirect, context, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBufferDirect", e); }
    }

    public static void alBufferDataDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int samplerate) {
        if (Handles.MH_alBufferDataDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferDataDirect");
        try {
            Handles.MH_alBufferDataDirect.invokeExact(Handles.get().PFN_alBufferDataDirect, context, buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferDataDirect", e); }
    }

    public static void alBufferfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alBufferfDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferfDirect");
        try {
            Handles.MH_alBufferfDirect.invokeExact(Handles.get().PFN_alBufferfDirect, context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfDirect", e); }
    }

    public static void alBuffer3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alBuffer3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alBuffer3fDirect");
        try {
            Handles.MH_alBuffer3fDirect.invokeExact(Handles.get().PFN_alBuffer3fDirect, context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3fDirect", e); }
    }

    public static void alBufferfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment values) {
        if (Handles.MH_alBufferfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferfvDirect");
        try {
            Handles.MH_alBufferfvDirect.invokeExact(Handles.get().PFN_alBufferfvDirect, context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfvDirect", e); }
    }

    public static void alBufferiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alBufferiDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferiDirect");
        try {
            Handles.MH_alBufferiDirect.invokeExact(Handles.get().PFN_alBufferiDirect, context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiDirect", e); }
    }

    public static void alBuffer3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alBuffer3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alBuffer3iDirect");
        try {
            Handles.MH_alBuffer3iDirect.invokeExact(Handles.get().PFN_alBuffer3iDirect, context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3iDirect", e); }
    }

    public static void alBufferivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALint *") MemorySegment values) {
        if (Handles.MH_alBufferivDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferivDirect");
        try {
            Handles.MH_alBufferivDirect.invokeExact(Handles.get().PFN_alBufferivDirect, context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferivDirect", e); }
    }

    public static void alGetBufferfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value) {
        if (Handles.MH_alGetBufferfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferfDirect");
        try {
            Handles.MH_alGetBufferfDirect.invokeExact(Handles.get().PFN_alGetBufferfDirect, context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfDirect", e); }
    }

    public static void alGetBuffer3fDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment value1, @CType("ALfloat *") MemorySegment value2, @CType("ALfloat *") MemorySegment value3) {
        if (Handles.MH_alGetBuffer3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3fDirect");
        try {
            Handles.MH_alGetBuffer3fDirect.invokeExact(Handles.get().PFN_alGetBuffer3fDirect, context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3fDirect", e); }
    }

    public static void alGetBufferfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment values) {
        if (Handles.MH_alGetBufferfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferfvDirect");
        try {
            Handles.MH_alGetBufferfvDirect.invokeExact(Handles.get().PFN_alGetBufferfvDirect, context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfvDirect", e); }
    }

    public static void alGetBufferiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") MemorySegment value) {
        if (Handles.MH_alGetBufferiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferiDirect");
        try {
            Handles.MH_alGetBufferiDirect.invokeExact(Handles.get().PFN_alGetBufferiDirect, context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiDirect", e); }
    }

    public static void alGetBuffer3iDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") MemorySegment value1, @CType("ALint *") MemorySegment value2, @CType("ALint *") MemorySegment value3) {
        if (Handles.MH_alGetBuffer3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3iDirect");
        try {
            Handles.MH_alGetBuffer3iDirect.invokeExact(Handles.get().PFN_alGetBuffer3iDirect, context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3iDirect", e); }
    }

    public static void alGetBufferivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") MemorySegment values) {
        if (Handles.MH_alGetBufferivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferivDirect");
        try {
            Handles.MH_alGetBufferivDirect.invokeExact(Handles.get().PFN_alGetBufferivDirect, context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferivDirect", e); }
    }

    public static void alGenEffectsDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") MemorySegment effects) {
        if (Handles.MH_alGenEffectsDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenEffectsDirect");
        try {
            Handles.MH_alGenEffectsDirect.invokeExact(Handles.get().PFN_alGenEffectsDirect, context, n, effects);
        } catch (Throwable e) { throw new RuntimeException("error in alGenEffectsDirect", e); }
    }

    public static void alDeleteEffectsDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment effects) {
        if (Handles.MH_alDeleteEffectsDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteEffectsDirect");
        try {
            Handles.MH_alDeleteEffectsDirect.invokeExact(Handles.get().PFN_alDeleteEffectsDirect, context, n, effects);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteEffectsDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsEffectDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect) {
        if (Handles.MH_alIsEffectDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsEffectDirect");
        try {
            return (boolean) Handles.MH_alIsEffectDirect.invokeExact(Handles.get().PFN_alIsEffectDirect, context, effect);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEffectDirect", e); }
    }

    public static void alEffectiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alEffectiDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectiDirect");
        try {
            Handles.MH_alEffectiDirect.invokeExact(Handles.get().PFN_alEffectiDirect, context, effect, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectiDirect", e); }
    }

    public static void alEffectivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("const ALint *") MemorySegment piValues) {
        if (Handles.MH_alEffectivDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectivDirect");
        try {
            Handles.MH_alEffectivDirect.invokeExact(Handles.get().PFN_alEffectivDirect, context, effect, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectivDirect", e); }
    }

    public static void alEffectfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alEffectfDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectfDirect");
        try {
            Handles.MH_alEffectfDirect.invokeExact(Handles.get().PFN_alEffectfDirect, context, effect, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectfDirect", e); }
    }

    public static void alEffectfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alEffectfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectfvDirect");
        try {
            Handles.MH_alEffectfvDirect.invokeExact(Handles.get().PFN_alEffectfvDirect, context, effect, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectfvDirect", e); }
    }

    public static void alGetEffectiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValue) {
        if (Handles.MH_alGetEffectiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectiDirect");
        try {
            Handles.MH_alGetEffectiDirect.invokeExact(Handles.get().PFN_alGetEffectiDirect, context, effect, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectiDirect", e); }
    }

    public static void alGetEffectivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValues) {
        if (Handles.MH_alGetEffectivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectivDirect");
        try {
            Handles.MH_alGetEffectivDirect.invokeExact(Handles.get().PFN_alGetEffectivDirect, context, effect, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectivDirect", e); }
    }

    public static void alGetEffectfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValue) {
        if (Handles.MH_alGetEffectfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectfDirect");
        try {
            Handles.MH_alGetEffectfDirect.invokeExact(Handles.get().PFN_alGetEffectfDirect, context, effect, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectfDirect", e); }
    }

    public static void alGetEffectfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alGetEffectfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectfvDirect");
        try {
            Handles.MH_alGetEffectfvDirect.invokeExact(Handles.get().PFN_alGetEffectfvDirect, context, effect, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectfvDirect", e); }
    }

    public static void alGenFiltersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") MemorySegment filters) {
        if (Handles.MH_alGenFiltersDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenFiltersDirect");
        try {
            Handles.MH_alGenFiltersDirect.invokeExact(Handles.get().PFN_alGenFiltersDirect, context, n, filters);
        } catch (Throwable e) { throw new RuntimeException("error in alGenFiltersDirect", e); }
    }

    public static void alDeleteFiltersDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment filters) {
        if (Handles.MH_alDeleteFiltersDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteFiltersDirect");
        try {
            Handles.MH_alDeleteFiltersDirect.invokeExact(Handles.get().PFN_alDeleteFiltersDirect, context, n, filters);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteFiltersDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsFilterDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter) {
        if (Handles.MH_alIsFilterDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsFilterDirect");
        try {
            return (boolean) Handles.MH_alIsFilterDirect.invokeExact(Handles.get().PFN_alIsFilterDirect, context, filter);
        } catch (Throwable e) { throw new RuntimeException("error in alIsFilterDirect", e); }
    }

    public static void alFilteriDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alFilteriDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilteriDirect");
        try {
            Handles.MH_alFilteriDirect.invokeExact(Handles.get().PFN_alFilteriDirect, context, filter, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alFilteriDirect", e); }
    }

    public static void alFilterivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("const ALint *") MemorySegment piValues) {
        if (Handles.MH_alFilterivDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterivDirect");
        try {
            Handles.MH_alFilterivDirect.invokeExact(Handles.get().PFN_alFilterivDirect, context, filter, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterivDirect", e); }
    }

    public static void alFilterfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alFilterfDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterfDirect");
        try {
            Handles.MH_alFilterfDirect.invokeExact(Handles.get().PFN_alFilterfDirect, context, filter, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterfDirect", e); }
    }

    public static void alFilterfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alFilterfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterfvDirect");
        try {
            Handles.MH_alFilterfvDirect.invokeExact(Handles.get().PFN_alFilterfvDirect, context, filter, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterfvDirect", e); }
    }

    public static void alGetFilteriDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValue) {
        if (Handles.MH_alGetFilteriDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilteriDirect");
        try {
            Handles.MH_alGetFilteriDirect.invokeExact(Handles.get().PFN_alGetFilteriDirect, context, filter, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilteriDirect", e); }
    }

    public static void alGetFilterivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValues) {
        if (Handles.MH_alGetFilterivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterivDirect");
        try {
            Handles.MH_alGetFilterivDirect.invokeExact(Handles.get().PFN_alGetFilterivDirect, context, filter, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterivDirect", e); }
    }

    public static void alGetFilterfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValue) {
        if (Handles.MH_alGetFilterfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterfDirect");
        try {
            Handles.MH_alGetFilterfDirect.invokeExact(Handles.get().PFN_alGetFilterfDirect, context, filter, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterfDirect", e); }
    }

    public static void alGetFilterfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alGetFilterfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterfvDirect");
        try {
            Handles.MH_alGetFilterfvDirect.invokeExact(Handles.get().PFN_alGetFilterfvDirect, context, filter, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterfvDirect", e); }
    }

    public static void alGenAuxiliaryEffectSlotsDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") MemorySegment effectslots) {
        if (Handles.MH_alGenAuxiliaryEffectSlotsDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenAuxiliaryEffectSlotsDirect");
        try {
            Handles.MH_alGenAuxiliaryEffectSlotsDirect.invokeExact(Handles.get().PFN_alGenAuxiliaryEffectSlotsDirect, context, n, effectslots);
        } catch (Throwable e) { throw new RuntimeException("error in alGenAuxiliaryEffectSlotsDirect", e); }
    }

    public static void alDeleteAuxiliaryEffectSlotsDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment effectslots) {
        if (Handles.MH_alDeleteAuxiliaryEffectSlotsDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteAuxiliaryEffectSlotsDirect");
        try {
            Handles.MH_alDeleteAuxiliaryEffectSlotsDirect.invokeExact(Handles.get().PFN_alDeleteAuxiliaryEffectSlotsDirect, context, n, effectslots);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteAuxiliaryEffectSlotsDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsAuxiliaryEffectSlotDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot) {
        if (Handles.MH_alIsAuxiliaryEffectSlotDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsAuxiliaryEffectSlotDirect");
        try {
            return (boolean) Handles.MH_alIsAuxiliaryEffectSlotDirect.invokeExact(Handles.get().PFN_alIsAuxiliaryEffectSlotDirect, context, effectslot);
        } catch (Throwable e) { throw new RuntimeException("error in alIsAuxiliaryEffectSlotDirect", e); }
    }

    public static void alAuxiliaryEffectSlotiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alAuxiliaryEffectSlotiDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotiDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotiDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotiDirect, context, effectslot, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotiDirect", e); }
    }

    public static void alAuxiliaryEffectSlotivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("const ALint *") MemorySegment piValues) {
        if (Handles.MH_alAuxiliaryEffectSlotivDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotivDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotivDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotivDirect, context, effectslot, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotivDirect", e); }
    }

    public static void alAuxiliaryEffectSlotfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alAuxiliaryEffectSlotfDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotfDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotfDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotfDirect, context, effectslot, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfDirect", e); }
    }

    public static void alAuxiliaryEffectSlotfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("const ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alAuxiliaryEffectSlotfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotfvDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotfvDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotfvDirect, context, effectslot, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfvDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotiDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValue) {
        if (Handles.MH_alGetAuxiliaryEffectSlotiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotiDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotiDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotiDirect, context, effectslot, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotiDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotivDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint *") MemorySegment piValues) {
        if (Handles.MH_alGetAuxiliaryEffectSlotivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotivDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotivDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotivDirect, context, effectslot, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotivDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotfDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValue) {
        if (Handles.MH_alGetAuxiliaryEffectSlotfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotfDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotfDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotfDirect, context, effectslot, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotfvDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat *") MemorySegment pflValues) {
        if (Handles.MH_alGetAuxiliaryEffectSlotfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotfvDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotfvDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotfvDirect, context, effectslot, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfvDirect", e); }
    }

    public static void alBufferDataStaticDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALvoid *") MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int freq) {
        if (Handles.MH_alBufferDataStaticDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferDataStaticDirect");
        try {
            Handles.MH_alBufferDataStaticDirect.invokeExact(Handles.get().PFN_alBufferDataStaticDirect, context, buffer, format, data, size, freq);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferDataStaticDirect", e); }
    }

    public static void alDebugMessageCallbackDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALDEBUGPROCEXT") MemorySegment callback, @CType("void*") MemorySegment userParam) {
        if (Handles.MH_alDebugMessageCallbackDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageCallbackDirectEXT");
        try {
            Handles.MH_alDebugMessageCallbackDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageCallbackDirectEXT, context, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackDirectEXT", e); }
    }

    public static void alDebugMessageInsertDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment message) {
        if (Handles.MH_alDebugMessageInsertDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageInsertDirectEXT");
        try {
            Handles.MH_alDebugMessageInsertDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageInsertDirectEXT, context, source, type, id, severity, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertDirectEXT", e); }
    }

    public static void alDebugMessageControlDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int source, @CType("ALenum") int type, @CType("ALenum") int severity, @CType("ALsizei") int count, @CType("const ALuint *") MemorySegment ids, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alDebugMessageControlDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageControlDirectEXT");
        try {
            Handles.MH_alDebugMessageControlDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageControlDirectEXT, context, source, type, severity, count, ids, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlDirectEXT", e); }
    }

    public static void alPushDebugGroupDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int source, @CType("ALuint") int id, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment message) {
        if (Handles.MH_alPushDebugGroupDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alPushDebugGroupDirectEXT");
        try {
            Handles.MH_alPushDebugGroupDirectEXT.invokeExact(Handles.get().PFN_alPushDebugGroupDirectEXT, context, source, id, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupDirectEXT", e); }
    }

    public static void alPopDebugGroupDirectEXT(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alPopDebugGroupDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alPopDebugGroupDirectEXT");
        try {
            Handles.MH_alPopDebugGroupDirectEXT.invokeExact(Handles.get().PFN_alPopDebugGroupDirectEXT, context);
        } catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupDirectEXT", e); }
    }

    public static @CType("ALuint") int alGetDebugMessageLogDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int count, @CType("ALsizei") int logBufSize, @CType("ALenum *") MemorySegment sources, @CType("ALenum *") MemorySegment types, @CType("ALuint *") MemorySegment ids, @CType("ALenum *") MemorySegment severities, @CType("ALsizei *") MemorySegment lengths, @CType("ALchar*") MemorySegment logBuf) {
        if (Handles.MH_alGetDebugMessageLogDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetDebugMessageLogDirectEXT");
        try {
            return (int) Handles.MH_alGetDebugMessageLogDirectEXT.invokeExact(Handles.get().PFN_alGetDebugMessageLogDirectEXT, context, count, logBufSize, sources, types, ids, severities, lengths, logBuf);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogDirectEXT", e); }
    }

    public static void alObjectLabelDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment label) {
        if (Handles.MH_alObjectLabelDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alObjectLabelDirectEXT");
        try {
            Handles.MH_alObjectLabelDirectEXT.invokeExact(Handles.get().PFN_alObjectLabelDirectEXT, context, identifier, name, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alObjectLabelDirectEXT", e); }
    }

    public static void alGetObjectLabelDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int bufSize, @CType("ALsizei *") MemorySegment length, @CType("ALchar*") MemorySegment label) {
        if (Handles.MH_alGetObjectLabelDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetObjectLabelDirectEXT");
        try {
            Handles.MH_alGetObjectLabelDirectEXT.invokeExact(Handles.get().PFN_alGetObjectLabelDirectEXT, context, identifier, name, bufSize, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelDirectEXT", e); }
    }

    public static @CType("void*") MemorySegment alGetPointerDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerDirectEXT");
        try {
            return (MemorySegment) Handles.MH_alGetPointerDirectEXT.invokeExact(Handles.get().PFN_alGetPointerDirectEXT, context, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectEXT", e); }
    }

    public static void alGetPointervDirectEXT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int pname, @CType("void**") MemorySegment values) {
        if (Handles.MH_alGetPointervDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervDirectEXT");
        try {
            Handles.MH_alGetPointervDirectEXT.invokeExact(Handles.get().PFN_alGetPointervDirectEXT, context, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectEXT", e); }
    }

    public static void alRequestFoldbackStartDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int mode, @CType("ALsizei") int count, @CType("ALsizei") int length, @CType("ALfloat *") MemorySegment mem, @CType("LPALFOLDBACKCALLBACK") MemorySegment callback) {
        if (Handles.MH_alRequestFoldbackStartDirect == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStartDirect");
        try {
            Handles.MH_alRequestFoldbackStartDirect.invokeExact(Handles.get().PFN_alRequestFoldbackStartDirect, context, mode, count, length, mem, callback);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStartDirect", e); }
    }

    public static void alRequestFoldbackStopDirect(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alRequestFoldbackStopDirect == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStopDirect");
        try {
            Handles.MH_alRequestFoldbackStopDirect.invokeExact(Handles.get().PFN_alRequestFoldbackStopDirect, context);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStopDirect", e); }
    }

    public static void alBufferSubDataDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") MemorySegment data, @CType("ALsizei") int offset, @CType("ALsizei") int length) {
        if (Handles.MH_alBufferSubDataDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferSubDataDirectSOFT");
        try {
            Handles.MH_alBufferSubDataDirectSOFT.invokeExact(Handles.get().PFN_alBufferSubDataDirectSOFT, context, buffer, format, data, offset, length);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferSubDataDirectSOFT", e); }
    }

    public static void alSourcedDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value) {
        if (Handles.MH_alSourcedDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedDirectSOFT");
        try {
            Handles.MH_alSourcedDirectSOFT.invokeExact(Handles.get().PFN_alSourcedDirectSOFT, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedDirectSOFT", e); }
    }

    public static void alSource3dDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value1, @CType("ALdouble") double value2, @CType("ALdouble") double value3) {
        if (Handles.MH_alSource3dDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3dDirectSOFT");
        try {
            Handles.MH_alSource3dDirectSOFT.invokeExact(Handles.get().PFN_alSource3dDirectSOFT, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3dDirectSOFT", e); }
    }

    public static void alSourcedvDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALdouble *") MemorySegment values) {
        if (Handles.MH_alSourcedvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedvDirectSOFT");
        try {
            Handles.MH_alSourcedvDirectSOFT.invokeExact(Handles.get().PFN_alSourcedvDirectSOFT, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedvDirectSOFT", e); }
    }

    public static void alGetSourcedDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment value) {
        if (Handles.MH_alGetSourcedDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedDirectSOFT");
        try {
            Handles.MH_alGetSourcedDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcedDirectSOFT, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedDirectSOFT", e); }
    }

    public static void alGetSource3dDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment value1, @CType("ALdouble *") MemorySegment value2, @CType("ALdouble *") MemorySegment value3) {
        if (Handles.MH_alGetSource3dDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3dDirectSOFT");
        try {
            Handles.MH_alGetSource3dDirectSOFT.invokeExact(Handles.get().PFN_alGetSource3dDirectSOFT, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3dDirectSOFT", e); }
    }

    public static void alGetSourcedvDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment values) {
        if (Handles.MH_alGetSourcedvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedvDirectSOFT");
        try {
            Handles.MH_alGetSourcedvDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcedvDirectSOFT, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvDirectSOFT", e); }
    }

    public static void alSourcei64DirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value) {
        if (Handles.MH_alSourcei64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64DirectSOFT");
        try {
            Handles.MH_alSourcei64DirectSOFT.invokeExact(Handles.get().PFN_alSourcei64DirectSOFT, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64DirectSOFT", e); }
    }

    public static void alSource3i64DirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value1, @CType("ALint64SOFT") long value2, @CType("ALint64SOFT") long value3) {
        if (Handles.MH_alSource3i64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3i64DirectSOFT");
        try {
            Handles.MH_alSource3i64DirectSOFT.invokeExact(Handles.get().PFN_alSource3i64DirectSOFT, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i64DirectSOFT", e); }
    }

    public static void alSourcei64vDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint64SOFT *") MemorySegment values) {
        if (Handles.MH_alSourcei64vDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64vDirectSOFT");
        try {
            Handles.MH_alSourcei64vDirectSOFT.invokeExact(Handles.get().PFN_alSourcei64vDirectSOFT, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64vDirectSOFT", e); }
    }

    public static void alGetSourcei64DirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment value) {
        if (Handles.MH_alGetSourcei64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64DirectSOFT");
        try {
            Handles.MH_alGetSourcei64DirectSOFT.invokeExact(Handles.get().PFN_alGetSourcei64DirectSOFT, context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64DirectSOFT", e); }
    }

    public static void alGetSource3i64DirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment value1, @CType("ALint64SOFT *") MemorySegment value2, @CType("ALint64SOFT *") MemorySegment value3) {
        if (Handles.MH_alGetSource3i64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3i64DirectSOFT");
        try {
            Handles.MH_alGetSource3i64DirectSOFT.invokeExact(Handles.get().PFN_alGetSource3i64DirectSOFT, context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64DirectSOFT", e); }
    }

    public static void alGetSourcei64vDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment values) {
        if (Handles.MH_alGetSourcei64vDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64vDirectSOFT");
        try {
            Handles.MH_alGetSourcei64vDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcei64vDirectSOFT, context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vDirectSOFT", e); }
    }

    public static void alDeferUpdatesDirectSOFT(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alDeferUpdatesDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alDeferUpdatesDirectSOFT");
        try {
            Handles.MH_alDeferUpdatesDirectSOFT.invokeExact(Handles.get().PFN_alDeferUpdatesDirectSOFT, context);
        } catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesDirectSOFT", e); }
    }

    public static void alProcessUpdatesDirectSOFT(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alProcessUpdatesDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alProcessUpdatesDirectSOFT");
        try {
            Handles.MH_alProcessUpdatesDirectSOFT.invokeExact(Handles.get().PFN_alProcessUpdatesDirectSOFT, context);
        } catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesDirectSOFT", e); }
    }

    public static @CType("const ALchar*") MemorySegment alGetStringiDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int pname, @CType("ALsizei") int index) {
        if (Handles.MH_alGetStringiDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetStringiDirectSOFT");
        try {
            return (MemorySegment) Handles.MH_alGetStringiDirectSOFT.invokeExact(Handles.get().PFN_alGetStringiDirectSOFT, context, pname, index);
        } catch (Throwable e) { throw new RuntimeException("error in alGetStringiDirectSOFT", e); }
    }

    public static void alEventControlDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int count, @CType("const ALenum *") MemorySegment types, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alEventControlDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventControlDirectSOFT");
        try {
            Handles.MH_alEventControlDirectSOFT.invokeExact(Handles.get().PFN_alEventControlDirectSOFT, context, count, types, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alEventControlDirectSOFT", e); }
    }

    public static void alEventCallbackDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALEVENTPROCSOFT") MemorySegment callback, @CType("void*") MemorySegment userParam) {
        if (Handles.MH_alEventCallbackDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventCallbackDirectSOFT");
        try {
            Handles.MH_alEventCallbackDirectSOFT.invokeExact(Handles.get().PFN_alEventCallbackDirectSOFT, context, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alEventCallbackDirectSOFT", e); }
    }

    public static @CType("void*") MemorySegment alGetPointerDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerDirectSOFT");
        try {
            return (MemorySegment) Handles.MH_alGetPointerDirectSOFT.invokeExact(Handles.get().PFN_alGetPointerDirectSOFT, context, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectSOFT", e); }
    }

    public static void alGetPointervDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALenum") int pname, @CType("void**") MemorySegment values) {
        if (Handles.MH_alGetPointervDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervDirectSOFT");
        try {
            Handles.MH_alGetPointervDirectSOFT.invokeExact(Handles.get().PFN_alGetPointervDirectSOFT, context, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectSOFT", e); }
    }

    public static void alBufferCallbackDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALsizei") int freq, @CType("ALBUFFERCALLBACKTYPESOFT") MemorySegment callback, @CType("ALvoid *") MemorySegment userptr) {
        if (Handles.MH_alBufferCallbackDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferCallbackDirectSOFT");
        try {
            Handles.MH_alBufferCallbackDirectSOFT.invokeExact(Handles.get().PFN_alBufferCallbackDirectSOFT, context, buffer, format, freq, callback, userptr);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackDirectSOFT", e); }
    }

    public static void alGetBufferPtrDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrDirectSOFT");
        try {
            Handles.MH_alGetBufferPtrDirectSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrDirectSOFT, context, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrDirectSOFT", e); }
    }

    public static void alGetBuffer3PtrDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr0, @CType("ALvoid **") MemorySegment ptr1, @CType("ALvoid **") MemorySegment ptr2) {
        if (Handles.MH_alGetBuffer3PtrDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3PtrDirectSOFT");
        try {
            Handles.MH_alGetBuffer3PtrDirectSOFT.invokeExact(Handles.get().PFN_alGetBuffer3PtrDirectSOFT, context, buffer, param, ptr0, ptr1, ptr2);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrDirectSOFT", e); }
    }

    public static void alGetBufferPtrvDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrvDirectSOFT");
        try {
            Handles.MH_alGetBufferPtrvDirectSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrvDirectSOFT, context, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvDirectSOFT", e); }
    }

    public static void alSourcePlayAtTimeDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int source, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimeDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimeDirectSOFT");
        try {
            Handles.MH_alSourcePlayAtTimeDirectSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimeDirectSOFT, context, source, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeDirectSOFT", e); }
    }

    public static void alSourcePlayAtTimevDirectSOFT(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment sources, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimevDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimevDirectSOFT");
        try {
            Handles.MH_alSourcePlayAtTimevDirectSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimevDirectSOFT, context, n, sources, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevDirectSOFT", e); }
    }

    public static @CType("ALenum") int EAXSetDirect(@CType("ALCcontext *") MemorySegment context, @CType("const struct _GUID *") MemorySegment property_set_id, @CType("ALuint") int property_id, @CType("ALuint") int source_id, @CType("ALvoid *") MemorySegment value, @CType("ALuint") int value_size) {
        if (Handles.MH_EAXSetDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXSetDirect");
        try {
            return (int) Handles.MH_EAXSetDirect.invokeExact(Handles.get().PFN_EAXSetDirect, context, property_set_id, property_id, source_id, value, value_size);
        } catch (Throwable e) { throw new RuntimeException("error in EAXSetDirect", e); }
    }

    public static @CType("ALenum") int EAXGetDirect(@CType("ALCcontext *") MemorySegment context, @CType("const struct _GUID *") MemorySegment property_set_id, @CType("ALuint") int property_id, @CType("ALuint") int source_id, @CType("ALvoid *") MemorySegment value, @CType("ALuint") int value_size) {
        if (Handles.MH_EAXGetDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXGetDirect");
        try {
            return (int) Handles.MH_EAXGetDirect.invokeExact(Handles.get().PFN_EAXGetDirect, context, property_set_id, property_id, source_id, value, value_size);
        } catch (Throwable e) { throw new RuntimeException("error in EAXGetDirect", e); }
    }

    public static @CType("ALboolean") boolean EAXSetBufferModeDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") MemorySegment buffers, @CType("ALint") int value) {
        if (Handles.MH_EAXSetBufferModeDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXSetBufferModeDirect");
        try {
            return (boolean) Handles.MH_EAXSetBufferModeDirect.invokeExact(Handles.get().PFN_EAXSetBufferModeDirect, context, n, buffers, value);
        } catch (Throwable e) { throw new RuntimeException("error in EAXSetBufferModeDirect", e); }
    }

    public static @CType("ALenum") int EAXGetBufferModeDirect(@CType("ALCcontext *") MemorySegment context, @CType("ALuint") int buffer, @CType("ALint *") MemorySegment pReserved) {
        if (Handles.MH_EAXGetBufferModeDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXGetBufferModeDirect");
        try {
            return (int) Handles.MH_EAXGetBufferModeDirect.invokeExact(Handles.get().PFN_EAXGetBufferModeDirect, context, buffer, pReserved);
        } catch (Throwable e) { throw new RuntimeException("error in EAXGetBufferModeDirect", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTDirectContext() {
    }
}
