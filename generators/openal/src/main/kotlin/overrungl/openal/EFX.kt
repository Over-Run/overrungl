/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.openal

import overrungl.gen.float
import overrungl.gen.int
import overrungl.gen.string_u8
import overrungl.gen.void

fun efx() {
    downcall("ALC_EXT_EFX") {
        string_u8("ALC_EXT_EFX_NAME" to """"ALC_EXT_EFX"""")

        int("ALC_EFX_MAJOR_VERSION" to "0x20001")
        int("ALC_EFX_MINOR_VERSION" to "0x20002")
        int("ALC_MAX_AUXILIARY_SENDS" to "0x20003")

        int("AL_METERS_PER_UNIT" to "0x20004")

        int("AL_DIRECT_FILTER" to "0x20005")
        int("AL_AUXILIARY_SEND_FILTER" to "0x20006")
        int("AL_AIR_ABSORPTION_FACTOR" to "0x20007")
        int("AL_ROOM_ROLLOFF_FACTOR" to "0x20008")
        int("AL_CONE_OUTER_GAINHF" to "0x20009")
        int("AL_DIRECT_FILTER_GAINHF_AUTO" to "0x2000A")
        int("AL_AUXILIARY_SEND_FILTER_GAIN_AUTO" to "0x2000B")
        int("AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO" to "0x2000C")

        int("AL_REVERB_DENSITY" to "0x0001")
        int("AL_REVERB_DIFFUSION" to "0x0002")
        int("AL_REVERB_GAIN" to "0x0003")
        int("AL_REVERB_GAINHF" to "0x0004")
        int("AL_REVERB_DECAY_TIME" to "0x0005")
        int("AL_REVERB_DECAY_HFRATIO" to "0x0006")
        int("AL_REVERB_REFLECTIONS_GAIN" to "0x0007")
        int("AL_REVERB_REFLECTIONS_DELAY" to "0x0008")
        int("AL_REVERB_LATE_REVERB_GAIN" to "0x0009")
        int("AL_REVERB_LATE_REVERB_DELAY" to "0x000A")
        int("AL_REVERB_AIR_ABSORPTION_GAINHF" to "0x000B")
        int("AL_REVERB_ROOM_ROLLOFF_FACTOR" to "0x000C")
        int("AL_REVERB_DECAY_HFLIMIT" to "0x000D")

        int("AL_EAXREVERB_DENSITY" to "0x0001")
        int("AL_EAXREVERB_DIFFUSION" to "0x0002")
        int("AL_EAXREVERB_GAIN" to "0x0003")
        int("AL_EAXREVERB_GAINHF" to "0x0004")
        int("AL_EAXREVERB_GAINLF" to "0x0005")
        int("AL_EAXREVERB_DECAY_TIME" to "0x0006")
        int("AL_EAXREVERB_DECAY_HFRATIO" to "0x0007")
        int("AL_EAXREVERB_DECAY_LFRATIO" to "0x0008")
        int("AL_EAXREVERB_REFLECTIONS_GAIN" to "0x0009")
        int("AL_EAXREVERB_REFLECTIONS_DELAY" to "0x000A")
        int("AL_EAXREVERB_REFLECTIONS_PAN" to "0x000B")
        int("AL_EAXREVERB_LATE_REVERB_GAIN" to "0x000C")
        int("AL_EAXREVERB_LATE_REVERB_DELAY" to "0x000D")
        int("AL_EAXREVERB_LATE_REVERB_PAN" to "0x000E")
        int("AL_EAXREVERB_ECHO_TIME" to "0x000F")
        int("AL_EAXREVERB_ECHO_DEPTH" to "0x0010")
        int("AL_EAXREVERB_MODULATION_TIME" to "0x0011")
        int("AL_EAXREVERB_MODULATION_DEPTH" to "0x0012")
        int("AL_EAXREVERB_AIR_ABSORPTION_GAINHF" to "0x0013")
        int("AL_EAXREVERB_HFREFERENCE" to "0x0014")
        int("AL_EAXREVERB_LFREFERENCE" to "0x0015")
        int("AL_EAXREVERB_ROOM_ROLLOFF_FACTOR" to "0x0016")
        int("AL_EAXREVERB_DECAY_HFLIMIT" to "0x0017")

        int("AL_CHORUS_WAVEFORM" to "0x0001")
        int("AL_CHORUS_PHASE" to "0x0002")
        int("AL_CHORUS_RATE" to "0x0003")
        int("AL_CHORUS_DEPTH" to "0x0004")
        int("AL_CHORUS_FEEDBACK" to "0x0005")
        int("AL_CHORUS_DELAY" to "0x0006")

        int("AL_DISTORTION_EDGE" to "0x0001")
        int("AL_DISTORTION_GAIN" to "0x0002")
        int("AL_DISTORTION_LOWPASS_CUTOFF" to "0x0003")
        int("AL_DISTORTION_EQCENTER" to "0x0004")
        int("AL_DISTORTION_EQBANDWIDTH" to "0x0005")

        int("AL_ECHO_DELAY" to "0x0001")
        int("AL_ECHO_LRDELAY" to "0x0002")
        int("AL_ECHO_DAMPING" to "0x0003")
        int("AL_ECHO_FEEDBACK" to "0x0004")
        int("AL_ECHO_SPREAD" to "0x0005")

        int("AL_FLANGER_WAVEFORM" to "0x0001")
        int("AL_FLANGER_PHASE" to "0x0002")
        int("AL_FLANGER_RATE" to "0x0003")
        int("AL_FLANGER_DEPTH" to "0x0004")
        int("AL_FLANGER_FEEDBACK" to "0x0005")
        int("AL_FLANGER_DELAY" to "0x0006")

        int("AL_FREQUENCY_SHIFTER_FREQUENCY" to "0x0001")
        int("AL_FREQUENCY_SHIFTER_LEFT_DIRECTION" to "0x0002")
        int("AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION" to "0x0003")

        int("AL_VOCAL_MORPHER_PHONEMEA" to "0x0001")
        int("AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING" to "0x0002")
        int("AL_VOCAL_MORPHER_PHONEMEB" to "0x0003")
        int("AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING" to "0x0004")
        int("AL_VOCAL_MORPHER_WAVEFORM" to "0x0005")
        int("AL_VOCAL_MORPHER_RATE" to "0x0006")

        int("AL_PITCH_SHIFTER_COARSE_TUNE" to "0x0001")
        int("AL_PITCH_SHIFTER_FINE_TUNE" to "0x0002")

        int("AL_RING_MODULATOR_FREQUENCY" to "0x0001")
        int("AL_RING_MODULATOR_HIGHPASS_CUTOFF" to "0x0002")
        int("AL_RING_MODULATOR_WAVEFORM" to "0x0003")

        int("AL_AUTOWAH_ATTACK_TIME" to "0x0001")
        int("AL_AUTOWAH_RELEASE_TIME" to "0x0002")
        int("AL_AUTOWAH_RESONANCE" to "0x0003")
        int("AL_AUTOWAH_PEAK_GAIN" to "0x0004")

        int("AL_COMPRESSOR_ONOFF" to "0x0001")

        int("AL_EQUALIZER_LOW_GAIN" to "0x0001")
        int("AL_EQUALIZER_LOW_CUTOFF" to "0x0002")
        int("AL_EQUALIZER_MID1_GAIN" to "0x0003")
        int("AL_EQUALIZER_MID1_CENTER" to "0x0004")
        int("AL_EQUALIZER_MID1_WIDTH" to "0x0005")
        int("AL_EQUALIZER_MID2_GAIN" to "0x0006")
        int("AL_EQUALIZER_MID2_CENTER" to "0x0007")
        int("AL_EQUALIZER_MID2_WIDTH" to "0x0008")
        int("AL_EQUALIZER_HIGH_GAIN" to "0x0009")
        int("AL_EQUALIZER_HIGH_CUTOFF" to "0x000A")

        int("AL_EFFECT_FIRST_PARAMETER" to "0x0000")
        int("AL_EFFECT_LAST_PARAMETER" to "0x8000")
        int("AL_EFFECT_TYPE" to "0x8001")

        int("AL_EFFECT_NULL" to "0x0000")
        int("AL_EFFECT_REVERB" to "0x0001")
        int("AL_EFFECT_CHORUS" to "0x0002")
        int("AL_EFFECT_DISTORTION" to "0x0003")
        int("AL_EFFECT_ECHO" to "0x0004")
        int("AL_EFFECT_FLANGER" to "0x0005")
        int("AL_EFFECT_FREQUENCY_SHIFTER" to "0x0006")
        int("AL_EFFECT_VOCAL_MORPHER" to "0x0007")
        int("AL_EFFECT_PITCH_SHIFTER" to "0x0008")
        int("AL_EFFECT_RING_MODULATOR" to "0x0009")
        int("AL_EFFECT_AUTOWAH" to "0x000A")
        int("AL_EFFECT_COMPRESSOR" to "0x000B")
        int("AL_EFFECT_EQUALIZER" to "0x000C")
        int("AL_EFFECT_EAXREVERB" to "0x8000")

        int("AL_EFFECTSLOT_EFFECT" to "0x0001")
        int("AL_EFFECTSLOT_GAIN" to "0x0002")
        int("AL_EFFECTSLOT_AUXILIARY_SEND_AUTO" to "0x0003")

        int("AL_EFFECTSLOT_NULL" to "0x0000")

        int("AL_LOWPASS_GAIN" to "0x0001")
        int("AL_LOWPASS_GAINHF" to "0x0002")

        int("AL_HIGHPASS_GAIN" to "0x0001")
        int("AL_HIGHPASS_GAINLF" to "0x0002")

        int("AL_BANDPASS_GAIN" to "0x0001")
        int("AL_BANDPASS_GAINLF" to "0x0002")
        int("AL_BANDPASS_GAINHF" to "0x0003")

        int("AL_FILTER_FIRST_PARAMETER" to "0x0000")
        int("AL_FILTER_LAST_PARAMETER" to "0x8000")
        int("AL_FILTER_TYPE" to "0x8001")

        int("AL_FILTER_NULL" to "0x0000")
        int("AL_FILTER_LOWPASS" to "0x0001")
        int("AL_FILTER_HIGHPASS" to "0x0002")
        int("AL_FILTER_BANDPASS" to "0x0003")

        "alGenEffects"(void, ALsizei("n"), ALuint_ptr("effects"), entrypoint = "alGenEffects", optional = true)
        "alDeleteEffects"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("effects"),
            entrypoint = "alDeleteEffects",
            optional = true
        )
        "alIsEffect"(ALboolean, ALuint("effect"), entrypoint = "alIsEffect", optional = true)
        "alEffecti"(void, ALuint("effect"), ALenum("param"), ALint("iValue"), entrypoint = "alEffecti", optional = true)
        "alEffectiv"(
            void,
            ALuint("effect"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alEffectiv",
            optional = true
        )
        "alEffectf"(
            void,
            ALuint("effect"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alEffectf",
            optional = true
        )
        "alEffectfv"(
            void,
            ALuint("effect"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alEffectfv",
            optional = true
        )
        "alGetEffecti"(
            void,
            ALuint("effect"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetEffecti",
            optional = true
        )
        "alGetEffectiv"(
            void,
            ALuint("effect"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetEffectiv",
            optional = true
        )
        "alGetEffectf"(
            void,
            ALuint("effect"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetEffectf",
            optional = true
        )
        "alGetEffectfv"(
            void,
            ALuint("effect"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetEffectfv",
            optional = true
        )

        "alGenFilters"(void, ALsizei("n"), ALuint_ptr("filters"), entrypoint = "alGenFilters", optional = true)
        "alDeleteFilters"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("filters"),
            entrypoint = "alDeleteFilters",
            optional = true
        )
        "alIsFilter"(ALboolean, ALuint("filter"), entrypoint = "alIsFilter", optional = true)
        "alFilteri"(void, ALuint("filter"), ALenum("param"), ALint("iValue"), entrypoint = "alFilteri", optional = true)
        "alFilteriv"(
            void,
            ALuint("filter"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alFilteriv",
            optional = true
        )
        "alFilterf"(
            void,
            ALuint("filter"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alFilterf",
            optional = true
        )
        "alFilterfv"(
            void,
            ALuint("filter"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alFilterfv",
            optional = true
        )
        "alGetFilteri"(
            void,
            ALuint("filter"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetFilteri",
            optional = true
        )
        "alGetFilteriv"(
            void,
            ALuint("filter"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetFilteriv",
            optional = true
        )
        "alGetFilterf"(
            void,
            ALuint("filter"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetFilterf",
            optional = true
        )
        "alGetFilterfv"(
            void,
            ALuint("filter"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetFilterfv",
            optional = true
        )

        "alGenAuxiliaryEffectSlots"(
            void,
            ALsizei("n"),
            ALuint_ptr("effectslots"),
            entrypoint = "alGenAuxiliaryEffectSlots",
            optional = true
        )
        "alDeleteAuxiliaryEffectSlots"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("effectslots"),
            entrypoint = "alDeleteAuxiliaryEffectSlots",
            optional = true
        )
        "alIsAuxiliaryEffectSlot"(
            ALboolean,
            ALuint("effectslot"),
            entrypoint = "alIsAuxiliaryEffectSlot",
            optional = true
        )
        "alAuxiliaryEffectSloti"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALint("iValue"),
            entrypoint = "alAuxiliaryEffectSloti",
            optional = true
        )
        "alAuxiliaryEffectSlotiv"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alAuxiliaryEffectSlotiv",
            optional = true
        )
        "alAuxiliaryEffectSlotf"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alAuxiliaryEffectSlotf",
            optional = true
        )
        "alAuxiliaryEffectSlotfv"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alAuxiliaryEffectSlotfv",
            optional = true
        )
        "alGetAuxiliaryEffectSloti"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetAuxiliaryEffectSloti",
            optional = true
        )
        "alGetAuxiliaryEffectSlotiv"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetAuxiliaryEffectSlotiv",
            optional = true
        )
        "alGetAuxiliaryEffectSlotf"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetAuxiliaryEffectSlotf",
            optional = true
        )
        "alGetAuxiliaryEffectSlotfv"(
            void,
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetAuxiliaryEffectSlotfv",
            optional = true
        )

        float("AL_LOWPASS_MIN_GAIN" to "0.0f")
        float("AL_LOWPASS_MAX_GAIN" to "1.0f")
        float("AL_LOWPASS_DEFAULT_GAIN" to "1.0f")

        float("AL_LOWPASS_MIN_GAINHF" to "0.0f")
        float("AL_LOWPASS_MAX_GAINHF" to "1.0f")
        float("AL_LOWPASS_DEFAULT_GAINHF" to "1.0f")

        float("AL_HIGHPASS_MIN_GAIN" to "0.0f")
        float("AL_HIGHPASS_MAX_GAIN" to "1.0f")
        float("AL_HIGHPASS_DEFAULT_GAIN" to "1.0f")

        float("AL_HIGHPASS_MIN_GAINLF" to "0.0f")
        float("AL_HIGHPASS_MAX_GAINLF" to "1.0f")
        float("AL_HIGHPASS_DEFAULT_GAINLF" to "1.0f")

        float("AL_BANDPASS_MIN_GAIN" to "0.0f")
        float("AL_BANDPASS_MAX_GAIN" to "1.0f")
        float("AL_BANDPASS_DEFAULT_GAIN" to "1.0f")

        float("AL_BANDPASS_MIN_GAINHF" to "0.0f")
        float("AL_BANDPASS_MAX_GAINHF" to "1.0f")
        float("AL_BANDPASS_DEFAULT_GAINHF" to "1.0f")

        float("AL_BANDPASS_MIN_GAINLF" to "0.0f")
        float("AL_BANDPASS_MAX_GAINLF" to "1.0f")
        float("AL_BANDPASS_DEFAULT_GAINLF" to "1.0f")

        float("AL_REVERB_MIN_DENSITY" to "0.0f")
        float("AL_REVERB_MAX_DENSITY" to "1.0f")
        float("AL_REVERB_DEFAULT_DENSITY" to "1.0f")

        float("AL_REVERB_MIN_DIFFUSION" to "0.0f")
        float("AL_REVERB_MAX_DIFFUSION" to "1.0f")
        float("AL_REVERB_DEFAULT_DIFFUSION" to "1.0f")

        float("AL_REVERB_MIN_GAIN" to "0.0f")
        float("AL_REVERB_MAX_GAIN" to "1.0f")
        float("AL_REVERB_DEFAULT_GAIN" to "0.32f")

        float("AL_REVERB_MIN_GAINHF" to "0.0f")
        float("AL_REVERB_MAX_GAINHF" to "1.0f")
        float("AL_REVERB_DEFAULT_GAINHF" to "0.89f")

        float("AL_REVERB_MIN_DECAY_TIME" to "0.1f")
        float("AL_REVERB_MAX_DECAY_TIME" to "20.0f")
        float("AL_REVERB_DEFAULT_DECAY_TIME" to "1.49f")

        float("AL_REVERB_MIN_DECAY_HFRATIO" to "0.1f")
        float("AL_REVERB_MAX_DECAY_HFRATIO" to "2.0f")
        float("AL_REVERB_DEFAULT_DECAY_HFRATIO" to "0.83f")

        float("AL_REVERB_MIN_REFLECTIONS_GAIN" to "0.0f")
        float("AL_REVERB_MAX_REFLECTIONS_GAIN" to "3.16f")
        float("AL_REVERB_DEFAULT_REFLECTIONS_GAIN" to "0.05f")

        float("AL_REVERB_MIN_REFLECTIONS_DELAY" to "0.0f")
        float("AL_REVERB_MAX_REFLECTIONS_DELAY" to "0.3f")
        float("AL_REVERB_DEFAULT_REFLECTIONS_DELAY" to "0.007f")

        float("AL_REVERB_MIN_LATE_REVERB_GAIN" to "0.0f")
        float("AL_REVERB_MAX_LATE_REVERB_GAIN" to "10.0f")
        float("AL_REVERB_DEFAULT_LATE_REVERB_GAIN" to "1.26f")

        float("AL_REVERB_MIN_LATE_REVERB_DELAY" to "0.0f")
        float("AL_REVERB_MAX_LATE_REVERB_DELAY" to "0.1f")
        float("AL_REVERB_DEFAULT_LATE_REVERB_DELAY" to "0.011f")

        float("AL_REVERB_MIN_AIR_ABSORPTION_GAINHF" to "0.892f")
        float("AL_REVERB_MAX_AIR_ABSORPTION_GAINHF" to "1.0f")
        float("AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF" to "0.994f")

        float("AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR" to "0.0f")
        float("AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR" to "10.0f")
        float("AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR" to "0.0f")

        int("AL_REVERB_MIN_DECAY_HFLIMIT" to "AL.AL_FALSE")
        int("AL_REVERB_MAX_DECAY_HFLIMIT" to "AL.AL_TRUE")
        int("AL_REVERB_DEFAULT_DECAY_HFLIMIT" to "AL.AL_TRUE")

        float("AL_EAXREVERB_MIN_DENSITY" to "0.0f")
        float("AL_EAXREVERB_MAX_DENSITY" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_DENSITY" to "1.0f")

        float("AL_EAXREVERB_MIN_DIFFUSION" to "0.0f")
        float("AL_EAXREVERB_MAX_DIFFUSION" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_DIFFUSION" to "1.0f")

        float("AL_EAXREVERB_MIN_GAIN" to "0.0f")
        float("AL_EAXREVERB_MAX_GAIN" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_GAIN" to "0.32f")

        float("AL_EAXREVERB_MIN_GAINHF" to "0.0f")
        float("AL_EAXREVERB_MAX_GAINHF" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_GAINHF" to "0.89f")

        float("AL_EAXREVERB_MIN_GAINLF" to "0.0f")
        float("AL_EAXREVERB_MAX_GAINLF" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_GAINLF" to "1.0f")

        float("AL_EAXREVERB_MIN_DECAY_TIME" to "0.1f")
        float("AL_EAXREVERB_MAX_DECAY_TIME" to "20.0f")
        float("AL_EAXREVERB_DEFAULT_DECAY_TIME" to "1.49f")

        float("AL_EAXREVERB_MIN_DECAY_HFRATIO" to "0.1f")
        float("AL_EAXREVERB_MAX_DECAY_HFRATIO" to "2.0f")
        float("AL_EAXREVERB_DEFAULT_DECAY_HFRATIO" to "0.83f")

        float("AL_EAXREVERB_MIN_DECAY_LFRATIO" to "0.1f")
        float("AL_EAXREVERB_MAX_DECAY_LFRATIO" to "2.0f")
        float("AL_EAXREVERB_DEFAULT_DECAY_LFRATIO" to "1.0f")

        float("AL_EAXREVERB_MIN_REFLECTIONS_GAIN" to "0.0f")
        float("AL_EAXREVERB_MAX_REFLECTIONS_GAIN" to "3.16f")
        float("AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN" to "0.05f")

        float("AL_EAXREVERB_MIN_REFLECTIONS_DELAY" to "0.0f")
        float("AL_EAXREVERB_MAX_REFLECTIONS_DELAY" to "0.3f")
        float("AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY" to "0.007f")

        float("AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ" to "0.0f")

        float("AL_EAXREVERB_MIN_LATE_REVERB_GAIN" to "0.0f")
        float("AL_EAXREVERB_MAX_LATE_REVERB_GAIN" to "10.0f")
        float("AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN" to "1.26f")

        float("AL_EAXREVERB_MIN_LATE_REVERB_DELAY" to "0.0f")
        float("AL_EAXREVERB_MAX_LATE_REVERB_DELAY" to "0.1f")
        float("AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY" to "0.011f")

        float("AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ" to "0.0f")

        float("AL_EAXREVERB_MIN_ECHO_TIME" to "0.075f")
        float("AL_EAXREVERB_MAX_ECHO_TIME" to "0.25f")
        float("AL_EAXREVERB_DEFAULT_ECHO_TIME" to "0.25f")

        float("AL_EAXREVERB_MIN_ECHO_DEPTH" to "0.0f")
        float("AL_EAXREVERB_MAX_ECHO_DEPTH" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_ECHO_DEPTH" to "0.0f")

        float("AL_EAXREVERB_MIN_MODULATION_TIME" to "0.04f")
        float("AL_EAXREVERB_MAX_MODULATION_TIME" to "4.0f")
        float("AL_EAXREVERB_DEFAULT_MODULATION_TIME" to "0.25f")

        float("AL_EAXREVERB_MIN_MODULATION_DEPTH" to "0.0f")
        float("AL_EAXREVERB_MAX_MODULATION_DEPTH" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_MODULATION_DEPTH" to "0.0f")

        float("AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF" to "0.892f")
        float("AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF" to "1.0f")
        float("AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF" to "0.994f")

        float("AL_EAXREVERB_MIN_HFREFERENCE" to "1000.0f")
        float("AL_EAXREVERB_MAX_HFREFERENCE" to "20000.0f")
        float("AL_EAXREVERB_DEFAULT_HFREFERENCE" to "5000.0f")

        float("AL_EAXREVERB_MIN_LFREFERENCE" to "20.0f")
        float("AL_EAXREVERB_MAX_LFREFERENCE" to "1000.0f")
        float("AL_EAXREVERB_DEFAULT_LFREFERENCE" to "250.0f")

        float("AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR" to "0.0f")
        float("AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR" to "10.0f")
        float("AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR" to "0.0f")

        int("AL_EAXREVERB_MIN_DECAY_HFLIMIT" to "AL.AL_FALSE")
        int("AL_EAXREVERB_MAX_DECAY_HFLIMIT" to "AL.AL_TRUE")
        int("AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT" to "AL.AL_TRUE")

        int("AL_CHORUS_WAVEFORM_SINUSOID" to "0")
        int("AL_CHORUS_WAVEFORM_TRIANGLE" to "1")

        int("AL_CHORUS_MIN_WAVEFORM" to "0")
        int("AL_CHORUS_MAX_WAVEFORM" to "1")
        int("AL_CHORUS_DEFAULT_WAVEFORM" to "1")

        int("AL_CHORUS_MIN_PHASE" to "-180")
        int("AL_CHORUS_MAX_PHASE" to "180")
        int("AL_CHORUS_DEFAULT_PHASE" to "90")

        float("AL_CHORUS_MIN_RATE" to "0.0f")
        float("AL_CHORUS_MAX_RATE" to "10.0f")
        float("AL_CHORUS_DEFAULT_RATE" to "1.1f")

        float("AL_CHORUS_MIN_DEPTH" to "0.0f")
        float("AL_CHORUS_MAX_DEPTH" to "1.0f")
        float("AL_CHORUS_DEFAULT_DEPTH" to "0.1f")

        float("AL_CHORUS_MIN_FEEDBACK" to "-1.0f")
        float("AL_CHORUS_MAX_FEEDBACK" to "1.0f")
        float("AL_CHORUS_DEFAULT_FEEDBACK" to "0.25f")

        float("AL_CHORUS_MIN_DELAY" to "0.0f")
        float("AL_CHORUS_MAX_DELAY" to "0.016f")
        float("AL_CHORUS_DEFAULT_DELAY" to "0.016f")

        float("AL_DISTORTION_MIN_EDGE" to "0.0f")
        float("AL_DISTORTION_MAX_EDGE" to "1.0f")
        float("AL_DISTORTION_DEFAULT_EDGE" to "0.2f")

        float("AL_DISTORTION_MIN_GAIN" to "0.01f")
        float("AL_DISTORTION_MAX_GAIN" to "1.0f")
        float("AL_DISTORTION_DEFAULT_GAIN" to "0.05f")

        float("AL_DISTORTION_MIN_LOWPASS_CUTOFF" to "80.0f")
        float("AL_DISTORTION_MAX_LOWPASS_CUTOFF" to "24000.0f")
        float("AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF" to "8000.0f")

        float("AL_DISTORTION_MIN_EQCENTER" to "80.0f")
        float("AL_DISTORTION_MAX_EQCENTER" to "24000.0f")
        float("AL_DISTORTION_DEFAULT_EQCENTER" to "3600.0f")

        float("AL_DISTORTION_MIN_EQBANDWIDTH" to "80.0f")
        float("AL_DISTORTION_MAX_EQBANDWIDTH" to "24000.0f")
        float("AL_DISTORTION_DEFAULT_EQBANDWIDTH" to "3600.0f")

        float("AL_ECHO_MIN_DELAY" to "0.0f")
        float("AL_ECHO_MAX_DELAY" to "0.207f")
        float("AL_ECHO_DEFAULT_DELAY" to "0.1f")

        float("AL_ECHO_MIN_LRDELAY" to "0.0f")
        float("AL_ECHO_MAX_LRDELAY" to "0.404f")
        float("AL_ECHO_DEFAULT_LRDELAY" to "0.1f")

        float("AL_ECHO_MIN_DAMPING" to "0.0f")
        float("AL_ECHO_MAX_DAMPING" to "0.99f")
        float("AL_ECHO_DEFAULT_DAMPING" to "0.5f")

        float("AL_ECHO_MIN_FEEDBACK" to "0.0f")
        float("AL_ECHO_MAX_FEEDBACK" to "1.0f")
        float("AL_ECHO_DEFAULT_FEEDBACK" to "0.5f")

        float("AL_ECHO_MIN_SPREAD" to "-1.0f")
        float("AL_ECHO_MAX_SPREAD" to "1.0f")
        float("AL_ECHO_DEFAULT_SPREAD" to "-1.0f")

        int("AL_FLANGER_WAVEFORM_SINUSOID" to "0")
        int("AL_FLANGER_WAVEFORM_TRIANGLE" to "1")

        int("AL_FLANGER_MIN_WAVEFORM" to "0")
        int("AL_FLANGER_MAX_WAVEFORM" to "1")
        int("AL_FLANGER_DEFAULT_WAVEFORM" to "1")

        int("AL_FLANGER_MIN_PHASE" to "-180")
        int("AL_FLANGER_MAX_PHASE" to "180")
        int("AL_FLANGER_DEFAULT_PHASE" to "0")

        float("AL_FLANGER_MIN_RATE" to "0.0f")
        float("AL_FLANGER_MAX_RATE" to "10.0f")
        float("AL_FLANGER_DEFAULT_RATE" to "0.27f")

        float("AL_FLANGER_MIN_DEPTH" to "0.0f")
        float("AL_FLANGER_MAX_DEPTH" to "1.0f")
        float("AL_FLANGER_DEFAULT_DEPTH" to "1.0f")

        float("AL_FLANGER_MIN_FEEDBACK" to "-1.0f")
        float("AL_FLANGER_MAX_FEEDBACK" to "1.0f")
        float("AL_FLANGER_DEFAULT_FEEDBACK" to "-0.5f")

        float("AL_FLANGER_MIN_DELAY" to "0.0f")
        float("AL_FLANGER_MAX_DELAY" to "0.004f")
        float("AL_FLANGER_DEFAULT_DELAY" to "0.002f")

        float("AL_FREQUENCY_SHIFTER_MIN_FREQUENCY" to "0.0f")
        float("AL_FREQUENCY_SHIFTER_MAX_FREQUENCY" to "24000.0f")
        float("AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY" to "0.0f")

        int("AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION" to "0")
        int("AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION" to "2")
        int("AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION" to "0")

        int("AL_FREQUENCY_SHIFTER_DIRECTION_DOWN" to "0")
        int("AL_FREQUENCY_SHIFTER_DIRECTION_UP" to "1")
        int("AL_FREQUENCY_SHIFTER_DIRECTION_OFF" to "2")

        int("AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION" to "0")
        int("AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION" to "2")
        int("AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION" to "0")

        int("AL_VOCAL_MORPHER_MIN_PHONEMEA" to "0")
        int("AL_VOCAL_MORPHER_MAX_PHONEMEA" to "29")
        int("AL_VOCAL_MORPHER_DEFAULT_PHONEMEA" to "0")

        int("AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING" to "-24")
        int("AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING" to "24")
        int("AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING" to "0")

        int("AL_VOCAL_MORPHER_MIN_PHONEMEB" to "0")
        int("AL_VOCAL_MORPHER_MAX_PHONEMEB" to "29")
        int("AL_VOCAL_MORPHER_DEFAULT_PHONEMEB" to "10")

        int("AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING" to "-24")
        int("AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING" to "24")
        int("AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING" to "0")

        int("AL_VOCAL_MORPHER_PHONEME_A" to "0")
        int("AL_VOCAL_MORPHER_PHONEME_E" to "1")
        int("AL_VOCAL_MORPHER_PHONEME_I" to "2")
        int("AL_VOCAL_MORPHER_PHONEME_O" to "3")
        int("AL_VOCAL_MORPHER_PHONEME_U" to "4")
        int("AL_VOCAL_MORPHER_PHONEME_AA" to "5")
        int("AL_VOCAL_MORPHER_PHONEME_AE" to "6")
        int("AL_VOCAL_MORPHER_PHONEME_AH" to "7")
        int("AL_VOCAL_MORPHER_PHONEME_AO" to "8")
        int("AL_VOCAL_MORPHER_PHONEME_EH" to "9")
        int("AL_VOCAL_MORPHER_PHONEME_ER" to "10")
        int("AL_VOCAL_MORPHER_PHONEME_IH" to "11")
        int("AL_VOCAL_MORPHER_PHONEME_IY" to "12")
        int("AL_VOCAL_MORPHER_PHONEME_UH" to "13")
        int("AL_VOCAL_MORPHER_PHONEME_UW" to "14")
        int("AL_VOCAL_MORPHER_PHONEME_B" to "15")
        int("AL_VOCAL_MORPHER_PHONEME_D" to "16")
        int("AL_VOCAL_MORPHER_PHONEME_F" to "17")
        int("AL_VOCAL_MORPHER_PHONEME_G" to "18")
        int("AL_VOCAL_MORPHER_PHONEME_J" to "19")
        int("AL_VOCAL_MORPHER_PHONEME_K" to "20")
        int("AL_VOCAL_MORPHER_PHONEME_L" to "21")
        int("AL_VOCAL_MORPHER_PHONEME_M" to "22")
        int("AL_VOCAL_MORPHER_PHONEME_N" to "23")
        int("AL_VOCAL_MORPHER_PHONEME_P" to "24")
        int("AL_VOCAL_MORPHER_PHONEME_R" to "25")
        int("AL_VOCAL_MORPHER_PHONEME_S" to "26")
        int("AL_VOCAL_MORPHER_PHONEME_T" to "27")
        int("AL_VOCAL_MORPHER_PHONEME_V" to "28")
        int("AL_VOCAL_MORPHER_PHONEME_Z" to "29")

        int("AL_VOCAL_MORPHER_WAVEFORM_SINUSOID" to "0")
        int("AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE" to "1")
        int("AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH" to "2")

        int("AL_VOCAL_MORPHER_MIN_WAVEFORM" to "0")
        int("AL_VOCAL_MORPHER_MAX_WAVEFORM" to "2")
        int("AL_VOCAL_MORPHER_DEFAULT_WAVEFORM" to "0")

        float("AL_VOCAL_MORPHER_MIN_RATE" to "0.0f")
        float("AL_VOCAL_MORPHER_MAX_RATE" to "10.0f")
        float("AL_VOCAL_MORPHER_DEFAULT_RATE" to "1.41f")

        int("AL_PITCH_SHIFTER_MIN_COARSE_TUNE" to "-12")
        int("AL_PITCH_SHIFTER_MAX_COARSE_TUNE" to "12")
        int("AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE" to "12")

        int("AL_PITCH_SHIFTER_MIN_FINE_TUNE" to "-50")
        int("AL_PITCH_SHIFTER_MAX_FINE_TUNE" to "50")
        int("AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE" to "0")

        float("AL_RING_MODULATOR_MIN_FREQUENCY" to "0.0f")
        float("AL_RING_MODULATOR_MAX_FREQUENCY" to "8000.0f")
        float("AL_RING_MODULATOR_DEFAULT_FREQUENCY" to "440.0f")

        float("AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF" to "0.0f")
        float("AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF" to "24000.0f")
        float("AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF" to "800.0f")

        int("AL_RING_MODULATOR_SINUSOID" to "0")
        int("AL_RING_MODULATOR_SAWTOOTH" to "1")
        int("AL_RING_MODULATOR_SQUARE" to "2")

        int("AL_RING_MODULATOR_MIN_WAVEFORM" to "0")
        int("AL_RING_MODULATOR_MAX_WAVEFORM" to "2")
        int("AL_RING_MODULATOR_DEFAULT_WAVEFORM" to "0")

        float("AL_AUTOWAH_MIN_ATTACK_TIME" to "0.0001f")
        float("AL_AUTOWAH_MAX_ATTACK_TIME" to "1.0f")
        float("AL_AUTOWAH_DEFAULT_ATTACK_TIME" to "0.06f")

        float("AL_AUTOWAH_MIN_RELEASE_TIME" to "0.0001f")
        float("AL_AUTOWAH_MAX_RELEASE_TIME" to "1.0f")
        float("AL_AUTOWAH_DEFAULT_RELEASE_TIME" to "0.06f")

        float("AL_AUTOWAH_MIN_RESONANCE" to "2.0f")
        float("AL_AUTOWAH_MAX_RESONANCE" to "1000.0f")
        float("AL_AUTOWAH_DEFAULT_RESONANCE" to "1000.0f")

        float("AL_AUTOWAH_MIN_PEAK_GAIN" to "0.00003f")
        float("AL_AUTOWAH_MAX_PEAK_GAIN" to "31621.0f")
        float("AL_AUTOWAH_DEFAULT_PEAK_GAIN" to "11.22f")

        int("AL_COMPRESSOR_MIN_ONOFF" to "0")
        int("AL_COMPRESSOR_MAX_ONOFF" to "1")
        int("AL_COMPRESSOR_DEFAULT_ONOFF" to "1")

        float("AL_EQUALIZER_MIN_LOW_GAIN" to "0.126f")
        float("AL_EQUALIZER_MAX_LOW_GAIN" to "7.943f")
        float("AL_EQUALIZER_DEFAULT_LOW_GAIN" to "1.0f")

        float("AL_EQUALIZER_MIN_LOW_CUTOFF" to "50.0f")
        float("AL_EQUALIZER_MAX_LOW_CUTOFF" to "800.0f")
        float("AL_EQUALIZER_DEFAULT_LOW_CUTOFF" to "200.0f")

        float("AL_EQUALIZER_MIN_MID1_GAIN" to "0.126f")
        float("AL_EQUALIZER_MAX_MID1_GAIN" to "7.943f")
        float("AL_EQUALIZER_DEFAULT_MID1_GAIN" to "1.0f")

        float("AL_EQUALIZER_MIN_MID1_CENTER" to "200.0f")
        float("AL_EQUALIZER_MAX_MID1_CENTER" to "3000.0f")
        float("AL_EQUALIZER_DEFAULT_MID1_CENTER" to "500.0f")

        float("AL_EQUALIZER_MIN_MID1_WIDTH" to "0.01f")
        float("AL_EQUALIZER_MAX_MID1_WIDTH" to "1.0f")
        float("AL_EQUALIZER_DEFAULT_MID1_WIDTH" to "1.0f")

        float("AL_EQUALIZER_MIN_MID2_GAIN" to "0.126f")
        float("AL_EQUALIZER_MAX_MID2_GAIN" to "7.943f")
        float("AL_EQUALIZER_DEFAULT_MID2_GAIN" to "1.0f")

        float("AL_EQUALIZER_MIN_MID2_CENTER" to "1000.0f")
        float("AL_EQUALIZER_MAX_MID2_CENTER" to "8000.0f")
        float("AL_EQUALIZER_DEFAULT_MID2_CENTER" to "3000.0f")

        float("AL_EQUALIZER_MIN_MID2_WIDTH" to "0.01f")
        float("AL_EQUALIZER_MAX_MID2_WIDTH" to "1.0f")
        float("AL_EQUALIZER_DEFAULT_MID2_WIDTH" to "1.0f")

        float("AL_EQUALIZER_MIN_HIGH_GAIN" to "0.126f")
        float("AL_EQUALIZER_MAX_HIGH_GAIN" to "7.943f")
        float("AL_EQUALIZER_DEFAULT_HIGH_GAIN" to "1.0f")

        float("AL_EQUALIZER_MIN_HIGH_CUTOFF" to "4000.0f")
        float("AL_EQUALIZER_MAX_HIGH_CUTOFF" to "16000.0f")
        float("AL_EQUALIZER_DEFAULT_HIGH_CUTOFF" to "6000.0f")

        float("AL_MIN_AIR_ABSORPTION_FACTOR" to "0.0f")
        float("AL_MAX_AIR_ABSORPTION_FACTOR" to "10.0f")
        float("AL_DEFAULT_AIR_ABSORPTION_FACTOR" to "0.0f")

        float("AL_MIN_ROOM_ROLLOFF_FACTOR" to "0.0f")
        float("AL_MAX_ROOM_ROLLOFF_FACTOR" to "10.0f")
        float("AL_DEFAULT_ROOM_ROLLOFF_FACTOR" to "0.0f")

        float("AL_MIN_CONE_OUTER_GAINHF" to "0.0f")
        float("AL_MAX_CONE_OUTER_GAINHF" to "1.0f")
        float("AL_DEFAULT_CONE_OUTER_GAINHF" to "1.0f")

        int("AL_MIN_DIRECT_FILTER_GAINHF_AUTO" to "AL.AL_FALSE")
        int("AL_MAX_DIRECT_FILTER_GAINHF_AUTO" to "AL.AL_TRUE")
        int("AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO" to "AL.AL_TRUE")

        int("AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO" to "AL.AL_FALSE")
        int("AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO" to "AL.AL_TRUE")
        int("AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO" to "AL.AL_TRUE")

        int("AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO" to "AL.AL_FALSE")
        int("AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO" to "AL.AL_TRUE")
        int("AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO" to "AL.AL_TRUE")

        float("AL_MIN_METERS_PER_UNIT" to "Float.MIN_VALUE")
        float("AL_MAX_METERS_PER_UNIT" to "Float.MAX_VALUE")
        float("AL_DEFAULT_METERS_PER_UNIT" to "1.0f")
    }
}
