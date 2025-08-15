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

package overrungl.openal;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;
import static overrungl.openal.AL.AL_FALSE;
import static overrungl.openal.AL.AL_TRUE;

/**
 * OpenAL extensions
 *
 * @author squid233
 * @since 0.1.0
 */
public final class ALExt {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_FORMAT_IMA_ADPCM_MONO16_EXT = 0x10000;
    public static final int AL_FORMAT_IMA_ADPCM_STEREO16_EXT = 0x10001;
    public static final int AL_FORMAT_WAVE_EXT = 0x10002;
    public static final int AL_FORMAT_VORBIS_EXT = 0x10003;
    public static final int AL_FORMAT_QUAD8_LOKI = 0x10004;
    public static final int AL_FORMAT_QUAD16_LOKI = 0x10005;
    public static final int AL_FORMAT_MONO_FLOAT32 = 0x10010;
    public static final int AL_FORMAT_STEREO_FLOAT32 = 0x10011;
    public static final int AL_FORMAT_MONO_DOUBLE_EXT = 0x10012;
    public static final int AL_FORMAT_STEREO_DOUBLE_EXT = 0x10013;
    public static final int AL_FORMAT_MONO_MULAW_EXT = 0x10014;
    public static final int AL_FORMAT_STEREO_MULAW_EXT = 0x10015;
    public static final int AL_FORMAT_MONO_ALAW_EXT = 0x10016;
    public static final int AL_FORMAT_STEREO_ALAW_EXT = 0x10017;
    public static final int ALC_CHAN_MAIN_LOKI = 0x500001;
    public static final int ALC_CHAN_PCM_LOKI = 0x500002;
    public static final int ALC_CHAN_CD_LOKI = 0x500003;
    public static final int AL_FORMAT_QUAD8 = 0x1204;
    public static final int AL_FORMAT_QUAD16 = 0x1205;
    public static final int AL_FORMAT_QUAD32 = 0x1206;
    public static final int AL_FORMAT_REAR8 = 0x1207;
    public static final int AL_FORMAT_REAR16 = 0x1208;
    public static final int AL_FORMAT_REAR32 = 0x1209;
    public static final int AL_FORMAT_51CHN8 = 0x120A;
    public static final int AL_FORMAT_51CHN16 = 0x120B;
    public static final int AL_FORMAT_51CHN32 = 0x120C;
    public static final int AL_FORMAT_61CHN8 = 0x120D;
    public static final int AL_FORMAT_61CHN16 = 0x120E;
    public static final int AL_FORMAT_61CHN32 = 0x120F;
    public static final int AL_FORMAT_71CHN8 = 0x1210;
    public static final int AL_FORMAT_71CHN16 = 0x1211;
    public static final int AL_FORMAT_71CHN32 = 0x1212;
    public static final int AL_FORMAT_MONO_MULAW = 0x10014;
    public static final int AL_FORMAT_STEREO_MULAW = 0x10015;
    public static final int AL_FORMAT_QUAD_MULAW = 0x10021;
    public static final int AL_FORMAT_REAR_MULAW = 0x10022;
    public static final int AL_FORMAT_51CHN_MULAW = 0x10023;
    public static final int AL_FORMAT_61CHN_MULAW = 0x10024;
    public static final int AL_FORMAT_71CHN_MULAW = 0x10025;
    public static final int AL_FORMAT_MONO_IMA4 = 0x1300;
    public static final int AL_FORMAT_STEREO_IMA4 = 0x1301;
    public static final String ALC_EXT_EFX_NAME = "ALC_EXT_EFX";
    public static final int ALC_EFX_MAJOR_VERSION = 0x20001;
    public static final int ALC_EFX_MINOR_VERSION = 0x20002;
    public static final int ALC_MAX_AUXILIARY_SENDS = 0x20003;
    public static final int AL_METERS_PER_UNIT = 0x20004;
    public static final int AL_DIRECT_FILTER = 0x20005;
    public static final int AL_AUXILIARY_SEND_FILTER = 0x20006;
    public static final int AL_AIR_ABSORPTION_FACTOR = 0x20007;
    public static final int AL_ROOM_ROLLOFF_FACTOR = 0x20008;
    public static final int AL_CONE_OUTER_GAINHF = 0x20009;
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO = 0x2000A;
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0x2000B;
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x2000C;
    public static final int AL_REVERB_DENSITY = 0x0001;
    public static final int AL_REVERB_DIFFUSION = 0x0002;
    public static final int AL_REVERB_GAIN = 0x0003;
    public static final int AL_REVERB_GAINHF = 0x0004;
    public static final int AL_REVERB_DECAY_TIME = 0x0005;
    public static final int AL_REVERB_DECAY_HFRATIO = 0x0006;
    public static final int AL_REVERB_REFLECTIONS_GAIN = 0x0007;
    public static final int AL_REVERB_REFLECTIONS_DELAY = 0x0008;
    public static final int AL_REVERB_LATE_REVERB_GAIN = 0x0009;
    public static final int AL_REVERB_LATE_REVERB_DELAY = 0x000A;
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF = 0x000B;
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR = 0x000C;
    public static final int AL_REVERB_DECAY_HFLIMIT = 0x000D;
    public static final int AL_EAXREVERB_DENSITY = 0x0001;
    public static final int AL_EAXREVERB_DIFFUSION = 0x0002;
    public static final int AL_EAXREVERB_GAIN = 0x0003;
    public static final int AL_EAXREVERB_GAINHF = 0x0004;
    public static final int AL_EAXREVERB_GAINLF = 0x0005;
    public static final int AL_EAXREVERB_DECAY_TIME = 0x0006;
    public static final int AL_EAXREVERB_DECAY_HFRATIO = 0x0007;
    public static final int AL_EAXREVERB_DECAY_LFRATIO = 0x0008;
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN = 0x0009;
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY = 0x000A;
    public static final int AL_EAXREVERB_REFLECTIONS_PAN = 0x000B;
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN = 0x000C;
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY = 0x000D;
    public static final int AL_EAXREVERB_LATE_REVERB_PAN = 0x000E;
    public static final int AL_EAXREVERB_ECHO_TIME = 0x000F;
    public static final int AL_EAXREVERB_ECHO_DEPTH = 0x0010;
    public static final int AL_EAXREVERB_MODULATION_TIME = 0x0011;
    public static final int AL_EAXREVERB_MODULATION_DEPTH = 0x0012;
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 0x0013;
    public static final int AL_EAXREVERB_HFREFERENCE = 0x0014;
    public static final int AL_EAXREVERB_LFREFERENCE = 0x0015;
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR = 0x0016;
    public static final int AL_EAXREVERB_DECAY_HFLIMIT = 0x0017;
    public static final int AL_CHORUS_WAVEFORM = 0x0001;
    public static final int AL_CHORUS_PHASE = 0x0002;
    public static final int AL_CHORUS_RATE = 0x0003;
    public static final int AL_CHORUS_DEPTH = 0x0004;
    public static final int AL_CHORUS_FEEDBACK = 0x0005;
    public static final int AL_CHORUS_DELAY = 0x0006;
    public static final int AL_DISTORTION_EDGE = 0x0001;
    public static final int AL_DISTORTION_GAIN = 0x0002;
    public static final int AL_DISTORTION_LOWPASS_CUTOFF = 0x0003;
    public static final int AL_DISTORTION_EQCENTER = 0x0004;
    public static final int AL_DISTORTION_EQBANDWIDTH = 0x0005;
    public static final int AL_ECHO_DELAY = 0x0001;
    public static final int AL_ECHO_LRDELAY = 0x0002;
    public static final int AL_ECHO_DAMPING = 0x0003;
    public static final int AL_ECHO_FEEDBACK = 0x0004;
    public static final int AL_ECHO_SPREAD = 0x0005;
    public static final int AL_FLANGER_WAVEFORM = 0x0001;
    public static final int AL_FLANGER_PHASE = 0x0002;
    public static final int AL_FLANGER_RATE = 0x0003;
    public static final int AL_FLANGER_DEPTH = 0x0004;
    public static final int AL_FLANGER_FEEDBACK = 0x0005;
    public static final int AL_FLANGER_DELAY = 0x0006;
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY = 0x0001;
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION = 0x0002;
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 0x0003;
    public static final int AL_VOCAL_MORPHER_PHONEMEA = 0x0001;
    public static final int AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING = 0x0002;
    public static final int AL_VOCAL_MORPHER_PHONEMEB = 0x0003;
    public static final int AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING = 0x0004;
    public static final int AL_VOCAL_MORPHER_WAVEFORM = 0x0005;
    public static final int AL_VOCAL_MORPHER_RATE = 0x0006;
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE = 0x0001;
    public static final int AL_PITCH_SHIFTER_FINE_TUNE = 0x0002;
    public static final int AL_RING_MODULATOR_FREQUENCY = 0x0001;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = 0x0002;
    public static final int AL_RING_MODULATOR_WAVEFORM = 0x0003;
    public static final int AL_AUTOWAH_ATTACK_TIME = 0x0001;
    public static final int AL_AUTOWAH_RELEASE_TIME = 0x0002;
    public static final int AL_AUTOWAH_RESONANCE = 0x0003;
    public static final int AL_AUTOWAH_PEAK_GAIN = 0x0004;
    public static final int AL_COMPRESSOR_ONOFF = 0x0001;
    public static final int AL_EQUALIZER_LOW_GAIN = 0x0001;
    public static final int AL_EQUALIZER_LOW_CUTOFF = 0x0002;
    public static final int AL_EQUALIZER_MID1_GAIN = 0x0003;
    public static final int AL_EQUALIZER_MID1_CENTER = 0x0004;
    public static final int AL_EQUALIZER_MID1_WIDTH = 0x0005;
    public static final int AL_EQUALIZER_MID2_GAIN = 0x0006;
    public static final int AL_EQUALIZER_MID2_CENTER = 0x0007;
    public static final int AL_EQUALIZER_MID2_WIDTH = 0x0008;
    public static final int AL_EQUALIZER_HIGH_GAIN = 0x0009;
    public static final int AL_EQUALIZER_HIGH_CUTOFF = 0x000A;
    public static final int AL_EFFECT_FIRST_PARAMETER = 0x0000;
    public static final int AL_EFFECT_LAST_PARAMETER = 0x8000;
    public static final int AL_EFFECT_TYPE = 0x8001;
    public static final int AL_EFFECT_NULL = 0x0000;
    public static final int AL_EFFECT_REVERB = 0x0001;
    public static final int AL_EFFECT_CHORUS = 0x0002;
    public static final int AL_EFFECT_DISTORTION = 0x0003;
    public static final int AL_EFFECT_ECHO = 0x0004;
    public static final int AL_EFFECT_FLANGER = 0x0005;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = 0x0006;
    public static final int AL_EFFECT_VOCAL_MORPHER = 0x0007;
    public static final int AL_EFFECT_PITCH_SHIFTER = 0x0008;
    public static final int AL_EFFECT_RING_MODULATOR = 0x0009;
    public static final int AL_EFFECT_AUTOWAH = 0x000A;
    public static final int AL_EFFECT_COMPRESSOR = 0x000B;
    public static final int AL_EFFECT_EQUALIZER = 0x000C;
    public static final int AL_EFFECT_EAXREVERB = 0x8000;
    public static final int AL_EFFECTSLOT_EFFECT = 0x0001;
    public static final int AL_EFFECTSLOT_GAIN = 0x0002;
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 0x0003;
    public static final int AL_EFFECTSLOT_NULL = 0x0000;
    public static final int AL_LOWPASS_GAIN = 0x0001;
    public static final int AL_LOWPASS_GAINHF = 0x0002;
    public static final int AL_HIGHPASS_GAIN = 0x0001;
    public static final int AL_HIGHPASS_GAINLF = 0x0002;
    public static final int AL_BANDPASS_GAIN = 0x0001;
    public static final int AL_BANDPASS_GAINLF = 0x0002;
    public static final int AL_BANDPASS_GAINHF = 0x0003;
    public static final int AL_FILTER_FIRST_PARAMETER = 0x0000;
    public static final int AL_FILTER_LAST_PARAMETER = 0x8000;
    public static final int AL_FILTER_TYPE = 0x8001;
    public static final int AL_FILTER_NULL = 0x0000;
    public static final int AL_FILTER_LOWPASS = 0x0001;
    public static final int AL_FILTER_HIGHPASS = 0x0002;
    public static final int AL_FILTER_BANDPASS = 0x0003;
    public static final float AL_LOWPASS_MIN_GAIN = (0.0f);
    public static final float AL_LOWPASS_MAX_GAIN = (1.0f);
    public static final float AL_LOWPASS_DEFAULT_GAIN = (1.0f);
    public static final float AL_LOWPASS_MIN_GAINHF = (0.0f);
    public static final float AL_LOWPASS_MAX_GAINHF = (1.0f);
    public static final float AL_LOWPASS_DEFAULT_GAINHF = (1.0f);
    public static final float AL_HIGHPASS_MIN_GAIN = (0.0f);
    public static final float AL_HIGHPASS_MAX_GAIN = (1.0f);
    public static final float AL_HIGHPASS_DEFAULT_GAIN = (1.0f);
    public static final float AL_HIGHPASS_MIN_GAINLF = (0.0f);
    public static final float AL_HIGHPASS_MAX_GAINLF = (1.0f);
    public static final float AL_HIGHPASS_DEFAULT_GAINLF = (1.0f);
    public static final float AL_BANDPASS_MIN_GAIN = (0.0f);
    public static final float AL_BANDPASS_MAX_GAIN = (1.0f);
    public static final float AL_BANDPASS_DEFAULT_GAIN = (1.0f);
    public static final float AL_BANDPASS_MIN_GAINHF = (0.0f);
    public static final float AL_BANDPASS_MAX_GAINHF = (1.0f);
    public static final float AL_BANDPASS_DEFAULT_GAINHF = (1.0f);
    public static final float AL_BANDPASS_MIN_GAINLF = (0.0f);
    public static final float AL_BANDPASS_MAX_GAINLF = (1.0f);
    public static final float AL_BANDPASS_DEFAULT_GAINLF = (1.0f);
    public static final float AL_REVERB_MIN_DENSITY = (0.0f);
    public static final float AL_REVERB_MAX_DENSITY = (1.0f);
    public static final float AL_REVERB_DEFAULT_DENSITY = (1.0f);
    public static final float AL_REVERB_MIN_DIFFUSION = (0.0f);
    public static final float AL_REVERB_MAX_DIFFUSION = (1.0f);
    public static final float AL_REVERB_DEFAULT_DIFFUSION = (1.0f);
    public static final float AL_REVERB_MIN_GAIN = (0.0f);
    public static final float AL_REVERB_MAX_GAIN = (1.0f);
    public static final float AL_REVERB_DEFAULT_GAIN = (0.32f);
    public static final float AL_REVERB_MIN_GAINHF = (0.0f);
    public static final float AL_REVERB_MAX_GAINHF = (1.0f);
    public static final float AL_REVERB_DEFAULT_GAINHF = (0.89f);
    public static final float AL_REVERB_MIN_DECAY_TIME = (0.1f);
    public static final float AL_REVERB_MAX_DECAY_TIME = (20.0f);
    public static final float AL_REVERB_DEFAULT_DECAY_TIME = (1.49f);
    public static final float AL_REVERB_MIN_DECAY_HFRATIO = (0.1f);
    public static final float AL_REVERB_MAX_DECAY_HFRATIO = (2.0f);
    public static final float AL_REVERB_DEFAULT_DECAY_HFRATIO = (0.83f);
    public static final float AL_REVERB_MIN_REFLECTIONS_GAIN = (0.0f);
    public static final float AL_REVERB_MAX_REFLECTIONS_GAIN = (3.16f);
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_GAIN = (0.05f);
    public static final float AL_REVERB_MIN_REFLECTIONS_DELAY = (0.0f);
    public static final float AL_REVERB_MAX_REFLECTIONS_DELAY = (0.3f);
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_DELAY = (0.007f);
    public static final float AL_REVERB_MIN_LATE_REVERB_GAIN = (0.0f);
    public static final float AL_REVERB_MAX_LATE_REVERB_GAIN = (10.0f);
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_GAIN = (1.26f);
    public static final float AL_REVERB_MIN_LATE_REVERB_DELAY = (0.0f);
    public static final float AL_REVERB_MAX_LATE_REVERB_DELAY = (0.1f);
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_DELAY = (0.011f);
    public static final float AL_REVERB_MIN_AIR_ABSORPTION_GAINHF = (0.892f);
    public static final float AL_REVERB_MAX_AIR_ABSORPTION_GAINHF = (1.0f);
    public static final float AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = (0.994f);
    public static final float AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final float AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR = (10.0f);
    public static final float AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final int AL_REVERB_MIN_DECAY_HFLIMIT = AL_FALSE;
    public static final int AL_REVERB_MAX_DECAY_HFLIMIT = AL_TRUE;
    public static final int AL_REVERB_DEFAULT_DECAY_HFLIMIT = AL_TRUE;
    public static final float AL_EAXREVERB_MIN_DENSITY = (0.0f);
    public static final float AL_EAXREVERB_MAX_DENSITY = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_DENSITY = (1.0f);
    public static final float AL_EAXREVERB_MIN_DIFFUSION = (0.0f);
    public static final float AL_EAXREVERB_MAX_DIFFUSION = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_DIFFUSION = (1.0f);
    public static final float AL_EAXREVERB_MIN_GAIN = (0.0f);
    public static final float AL_EAXREVERB_MAX_GAIN = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_GAIN = (0.32f);
    public static final float AL_EAXREVERB_MIN_GAINHF = (0.0f);
    public static final float AL_EAXREVERB_MAX_GAINHF = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_GAINHF = (0.89f);
    public static final float AL_EAXREVERB_MIN_GAINLF = (0.0f);
    public static final float AL_EAXREVERB_MAX_GAINLF = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_GAINLF = (1.0f);
    public static final float AL_EAXREVERB_MIN_DECAY_TIME = (0.1f);
    public static final float AL_EAXREVERB_MAX_DECAY_TIME = (20.0f);
    public static final float AL_EAXREVERB_DEFAULT_DECAY_TIME = (1.49f);
    public static final float AL_EAXREVERB_MIN_DECAY_HFRATIO = (0.1f);
    public static final float AL_EAXREVERB_MAX_DECAY_HFRATIO = (2.0f);
    public static final float AL_EAXREVERB_DEFAULT_DECAY_HFRATIO = (0.83f);
    public static final float AL_EAXREVERB_MIN_DECAY_LFRATIO = (0.1f);
    public static final float AL_EAXREVERB_MAX_DECAY_LFRATIO = (2.0f);
    public static final float AL_EAXREVERB_DEFAULT_DECAY_LFRATIO = (1.0f);
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_GAIN = (0.0f);
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_GAIN = (3.16f);
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN = (0.05f);
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_DELAY = (0.0f);
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_DELAY = (0.3f);
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY = (0.007f);
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ = (0.0f);
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_GAIN = (0.0f);
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_GAIN = (10.0f);
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN = (1.26f);
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_DELAY = (0.0f);
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_DELAY = (0.1f);
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY = (0.011f);
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ = (0.0f);
    public static final float AL_EAXREVERB_MIN_ECHO_TIME = (0.075f);
    public static final float AL_EAXREVERB_MAX_ECHO_TIME = (0.25f);
    public static final float AL_EAXREVERB_DEFAULT_ECHO_TIME = (0.25f);
    public static final float AL_EAXREVERB_MIN_ECHO_DEPTH = (0.0f);
    public static final float AL_EAXREVERB_MAX_ECHO_DEPTH = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_ECHO_DEPTH = (0.0f);
    public static final float AL_EAXREVERB_MIN_MODULATION_TIME = (0.04f);
    public static final float AL_EAXREVERB_MAX_MODULATION_TIME = (4.0f);
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_TIME = (0.25f);
    public static final float AL_EAXREVERB_MIN_MODULATION_DEPTH = (0.0f);
    public static final float AL_EAXREVERB_MAX_MODULATION_DEPTH = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_DEPTH = (0.0f);
    public static final float AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF = (0.892f);
    public static final float AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF = (1.0f);
    public static final float AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = (0.994f);
    public static final float AL_EAXREVERB_MIN_HFREFERENCE = (1000.0f);
    public static final float AL_EAXREVERB_MAX_HFREFERENCE = (20000.0f);
    public static final float AL_EAXREVERB_DEFAULT_HFREFERENCE = (5000.0f);
    public static final float AL_EAXREVERB_MIN_LFREFERENCE = (20.0f);
    public static final float AL_EAXREVERB_MAX_LFREFERENCE = (1000.0f);
    public static final float AL_EAXREVERB_DEFAULT_LFREFERENCE = (250.0f);
    public static final float AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final float AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR = (10.0f);
    public static final float AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final int AL_EAXREVERB_MIN_DECAY_HFLIMIT = AL_FALSE;
    public static final int AL_EAXREVERB_MAX_DECAY_HFLIMIT = AL_TRUE;
    public static final int AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = AL_TRUE;
    public static final int AL_CHORUS_WAVEFORM_SINUSOID = (0);
    public static final int AL_CHORUS_WAVEFORM_TRIANGLE = (1);
    public static final int AL_CHORUS_MIN_WAVEFORM = (0);
    public static final int AL_CHORUS_MAX_WAVEFORM = (1);
    public static final int AL_CHORUS_DEFAULT_WAVEFORM = (1);
    public static final int AL_CHORUS_MIN_PHASE = (-180);
    public static final int AL_CHORUS_MAX_PHASE = (180);
    public static final int AL_CHORUS_DEFAULT_PHASE = (90);
    public static final float AL_CHORUS_MIN_RATE = (0.0f);
    public static final float AL_CHORUS_MAX_RATE = (10.0f);
    public static final float AL_CHORUS_DEFAULT_RATE = (1.1f);
    public static final float AL_CHORUS_MIN_DEPTH = (0.0f);
    public static final float AL_CHORUS_MAX_DEPTH = (1.0f);
    public static final float AL_CHORUS_DEFAULT_DEPTH = (0.1f);
    public static final float AL_CHORUS_MIN_FEEDBACK = (-1.0f);
    public static final float AL_CHORUS_MAX_FEEDBACK = (1.0f);
    public static final float AL_CHORUS_DEFAULT_FEEDBACK = (0.25f);
    public static final float AL_CHORUS_MIN_DELAY = (0.0f);
    public static final float AL_CHORUS_MAX_DELAY = (0.016f);
    public static final float AL_CHORUS_DEFAULT_DELAY = (0.016f);
    public static final float AL_DISTORTION_MIN_EDGE = (0.0f);
    public static final float AL_DISTORTION_MAX_EDGE = (1.0f);
    public static final float AL_DISTORTION_DEFAULT_EDGE = (0.2f);
    public static final float AL_DISTORTION_MIN_GAIN = (0.01f);
    public static final float AL_DISTORTION_MAX_GAIN = (1.0f);
    public static final float AL_DISTORTION_DEFAULT_GAIN = (0.05f);
    public static final float AL_DISTORTION_MIN_LOWPASS_CUTOFF = (80.0f);
    public static final float AL_DISTORTION_MAX_LOWPASS_CUTOFF = (24000.0f);
    public static final float AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = (8000.0f);
    public static final float AL_DISTORTION_MIN_EQCENTER = (80.0f);
    public static final float AL_DISTORTION_MAX_EQCENTER = (24000.0f);
    public static final float AL_DISTORTION_DEFAULT_EQCENTER = (3600.0f);
    public static final float AL_DISTORTION_MIN_EQBANDWIDTH = (80.0f);
    public static final float AL_DISTORTION_MAX_EQBANDWIDTH = (24000.0f);
    public static final float AL_DISTORTION_DEFAULT_EQBANDWIDTH = (3600.0f);
    public static final float AL_ECHO_MIN_DELAY = (0.0f);
    public static final float AL_ECHO_MAX_DELAY = (0.207f);
    public static final float AL_ECHO_DEFAULT_DELAY = (0.1f);
    public static final float AL_ECHO_MIN_LRDELAY = (0.0f);
    public static final float AL_ECHO_MAX_LRDELAY = (0.404f);
    public static final float AL_ECHO_DEFAULT_LRDELAY = (0.1f);
    public static final float AL_ECHO_MIN_DAMPING = (0.0f);
    public static final float AL_ECHO_MAX_DAMPING = (0.99f);
    public static final float AL_ECHO_DEFAULT_DAMPING = (0.5f);
    public static final float AL_ECHO_MIN_FEEDBACK = (0.0f);
    public static final float AL_ECHO_MAX_FEEDBACK = (1.0f);
    public static final float AL_ECHO_DEFAULT_FEEDBACK = (0.5f);
    public static final float AL_ECHO_MIN_SPREAD = (-1.0f);
    public static final float AL_ECHO_MAX_SPREAD = (1.0f);
    public static final float AL_ECHO_DEFAULT_SPREAD = (-1.0f);
    public static final int AL_FLANGER_WAVEFORM_SINUSOID = (0);
    public static final int AL_FLANGER_WAVEFORM_TRIANGLE = (1);
    public static final int AL_FLANGER_MIN_WAVEFORM = (0);
    public static final int AL_FLANGER_MAX_WAVEFORM = (1);
    public static final int AL_FLANGER_DEFAULT_WAVEFORM = (1);
    public static final int AL_FLANGER_MIN_PHASE = (-180);
    public static final int AL_FLANGER_MAX_PHASE = (180);
    public static final int AL_FLANGER_DEFAULT_PHASE = (0);
    public static final float AL_FLANGER_MIN_RATE = (0.0f);
    public static final float AL_FLANGER_MAX_RATE = (10.0f);
    public static final float AL_FLANGER_DEFAULT_RATE = (0.27f);
    public static final float AL_FLANGER_MIN_DEPTH = (0.0f);
    public static final float AL_FLANGER_MAX_DEPTH = (1.0f);
    public static final float AL_FLANGER_DEFAULT_DEPTH = (1.0f);
    public static final float AL_FLANGER_MIN_FEEDBACK = (-1.0f);
    public static final float AL_FLANGER_MAX_FEEDBACK = (1.0f);
    public static final float AL_FLANGER_DEFAULT_FEEDBACK = (-0.5f);
    public static final float AL_FLANGER_MIN_DELAY = (0.0f);
    public static final float AL_FLANGER_MAX_DELAY = (0.004f);
    public static final float AL_FLANGER_DEFAULT_DELAY = (0.002f);
    public static final float AL_FREQUENCY_SHIFTER_MIN_FREQUENCY = (0.0f);
    public static final float AL_FREQUENCY_SHIFTER_MAX_FREQUENCY = (24000.0f);
    public static final float AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = (0.0f);
    public static final int AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION = (0);
    public static final int AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION = (2);
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION = (0);
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_DOWN = (0);
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_UP = (1);
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_OFF = (2);
    public static final int AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION = (0);
    public static final int AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION = (2);
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = (0);
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA = (0);
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA = (29);
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA = (0);
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING = (-24);
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING = (24);
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = (0);
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB = (0);
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB = (29);
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB = (10);
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING = (-24);
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING = (24);
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = (0);
    public static final int AL_VOCAL_MORPHER_PHONEME_A = (0);
    public static final int AL_VOCAL_MORPHER_PHONEME_E = (1);
    public static final int AL_VOCAL_MORPHER_PHONEME_I = (2);
    public static final int AL_VOCAL_MORPHER_PHONEME_O = (3);
    public static final int AL_VOCAL_MORPHER_PHONEME_U = (4);
    public static final int AL_VOCAL_MORPHER_PHONEME_AA = (5);
    public static final int AL_VOCAL_MORPHER_PHONEME_AE = (6);
    public static final int AL_VOCAL_MORPHER_PHONEME_AH = (7);
    public static final int AL_VOCAL_MORPHER_PHONEME_AO = (8);
    public static final int AL_VOCAL_MORPHER_PHONEME_EH = (9);
    public static final int AL_VOCAL_MORPHER_PHONEME_ER = (10);
    public static final int AL_VOCAL_MORPHER_PHONEME_IH = (11);
    public static final int AL_VOCAL_MORPHER_PHONEME_IY = (12);
    public static final int AL_VOCAL_MORPHER_PHONEME_UH = (13);
    public static final int AL_VOCAL_MORPHER_PHONEME_UW = (14);
    public static final int AL_VOCAL_MORPHER_PHONEME_B = (15);
    public static final int AL_VOCAL_MORPHER_PHONEME_D = (16);
    public static final int AL_VOCAL_MORPHER_PHONEME_F = (17);
    public static final int AL_VOCAL_MORPHER_PHONEME_G = (18);
    public static final int AL_VOCAL_MORPHER_PHONEME_J = (19);
    public static final int AL_VOCAL_MORPHER_PHONEME_K = (20);
    public static final int AL_VOCAL_MORPHER_PHONEME_L = (21);
    public static final int AL_VOCAL_MORPHER_PHONEME_M = (22);
    public static final int AL_VOCAL_MORPHER_PHONEME_N = (23);
    public static final int AL_VOCAL_MORPHER_PHONEME_P = (24);
    public static final int AL_VOCAL_MORPHER_PHONEME_R = (25);
    public static final int AL_VOCAL_MORPHER_PHONEME_S = (26);
    public static final int AL_VOCAL_MORPHER_PHONEME_T = (27);
    public static final int AL_VOCAL_MORPHER_PHONEME_V = (28);
    public static final int AL_VOCAL_MORPHER_PHONEME_Z = (29);
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SINUSOID = (0);
    public static final int AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE = (1);
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH = (2);
    public static final int AL_VOCAL_MORPHER_MIN_WAVEFORM = (0);
    public static final int AL_VOCAL_MORPHER_MAX_WAVEFORM = (2);
    public static final int AL_VOCAL_MORPHER_DEFAULT_WAVEFORM = (0);
    public static final float AL_VOCAL_MORPHER_MIN_RATE = (0.0f);
    public static final float AL_VOCAL_MORPHER_MAX_RATE = (10.0f);
    public static final float AL_VOCAL_MORPHER_DEFAULT_RATE = (1.41f);
    public static final int AL_PITCH_SHIFTER_MIN_COARSE_TUNE = (-12);
    public static final int AL_PITCH_SHIFTER_MAX_COARSE_TUNE = (12);
    public static final int AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = (12);
    public static final int AL_PITCH_SHIFTER_MIN_FINE_TUNE = (-50);
    public static final int AL_PITCH_SHIFTER_MAX_FINE_TUNE = (50);
    public static final int AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE = (0);
    public static final float AL_RING_MODULATOR_MIN_FREQUENCY = (0.0f);
    public static final float AL_RING_MODULATOR_MAX_FREQUENCY = (8000.0f);
    public static final float AL_RING_MODULATOR_DEFAULT_FREQUENCY = (440.0f);
    public static final float AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF = (0.0f);
    public static final float AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF = (24000.0f);
    public static final float AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = (800.0f);
    public static final int AL_RING_MODULATOR_SINUSOID = (0);
    public static final int AL_RING_MODULATOR_SAWTOOTH = (1);
    public static final int AL_RING_MODULATOR_SQUARE = (2);
    public static final int AL_RING_MODULATOR_MIN_WAVEFORM = (0);
    public static final int AL_RING_MODULATOR_MAX_WAVEFORM = (2);
    public static final int AL_RING_MODULATOR_DEFAULT_WAVEFORM = (0);
    public static final float AL_AUTOWAH_MIN_ATTACK_TIME = (0.0001f);
    public static final float AL_AUTOWAH_MAX_ATTACK_TIME = (1.0f);
    public static final float AL_AUTOWAH_DEFAULT_ATTACK_TIME = (0.06f);
    public static final float AL_AUTOWAH_MIN_RELEASE_TIME = (0.0001f);
    public static final float AL_AUTOWAH_MAX_RELEASE_TIME = (1.0f);
    public static final float AL_AUTOWAH_DEFAULT_RELEASE_TIME = (0.06f);
    public static final float AL_AUTOWAH_MIN_RESONANCE = (2.0f);
    public static final float AL_AUTOWAH_MAX_RESONANCE = (1000.0f);
    public static final float AL_AUTOWAH_DEFAULT_RESONANCE = (1000.0f);
    public static final float AL_AUTOWAH_MIN_PEAK_GAIN = (0.00003f);
    public static final float AL_AUTOWAH_MAX_PEAK_GAIN = (31621.0f);
    public static final float AL_AUTOWAH_DEFAULT_PEAK_GAIN = (11.22f);
    public static final int AL_COMPRESSOR_MIN_ONOFF = (0);
    public static final int AL_COMPRESSOR_MAX_ONOFF = (1);
    public static final int AL_COMPRESSOR_DEFAULT_ONOFF = (1);
    public static final float AL_EQUALIZER_MIN_LOW_GAIN = (0.126f);
    public static final float AL_EQUALIZER_MAX_LOW_GAIN = (7.943f);
    public static final float AL_EQUALIZER_DEFAULT_LOW_GAIN = (1.0f);
    public static final float AL_EQUALIZER_MIN_LOW_CUTOFF = (50.0f);
    public static final float AL_EQUALIZER_MAX_LOW_CUTOFF = (800.0f);
    public static final float AL_EQUALIZER_DEFAULT_LOW_CUTOFF = (200.0f);
    public static final float AL_EQUALIZER_MIN_MID1_GAIN = (0.126f);
    public static final float AL_EQUALIZER_MAX_MID1_GAIN = (7.943f);
    public static final float AL_EQUALIZER_DEFAULT_MID1_GAIN = (1.0f);
    public static final float AL_EQUALIZER_MIN_MID1_CENTER = (200.0f);
    public static final float AL_EQUALIZER_MAX_MID1_CENTER = (3000.0f);
    public static final float AL_EQUALIZER_DEFAULT_MID1_CENTER = (500.0f);
    public static final float AL_EQUALIZER_MIN_MID1_WIDTH = (0.01f);
    public static final float AL_EQUALIZER_MAX_MID1_WIDTH = (1.0f);
    public static final float AL_EQUALIZER_DEFAULT_MID1_WIDTH = (1.0f);
    public static final float AL_EQUALIZER_MIN_MID2_GAIN = (0.126f);
    public static final float AL_EQUALIZER_MAX_MID2_GAIN = (7.943f);
    public static final float AL_EQUALIZER_DEFAULT_MID2_GAIN = (1.0f);
    public static final float AL_EQUALIZER_MIN_MID2_CENTER = (1000.0f);
    public static final float AL_EQUALIZER_MAX_MID2_CENTER = (8000.0f);
    public static final float AL_EQUALIZER_DEFAULT_MID2_CENTER = (3000.0f);
    public static final float AL_EQUALIZER_MIN_MID2_WIDTH = (0.01f);
    public static final float AL_EQUALIZER_MAX_MID2_WIDTH = (1.0f);
    public static final float AL_EQUALIZER_DEFAULT_MID2_WIDTH = (1.0f);
    public static final float AL_EQUALIZER_MIN_HIGH_GAIN = (0.126f);
    public static final float AL_EQUALIZER_MAX_HIGH_GAIN = (7.943f);
    public static final float AL_EQUALIZER_DEFAULT_HIGH_GAIN = (1.0f);
    public static final float AL_EQUALIZER_MIN_HIGH_CUTOFF = (4000.0f);
    public static final float AL_EQUALIZER_MAX_HIGH_CUTOFF = (16000.0f);
    public static final float AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = (6000.0f);
    public static final float AL_MIN_AIR_ABSORPTION_FACTOR = (0.0f);
    public static final float AL_MAX_AIR_ABSORPTION_FACTOR = (10.0f);
    public static final float AL_DEFAULT_AIR_ABSORPTION_FACTOR = (0.0f);
    public static final float AL_MIN_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final float AL_MAX_ROOM_ROLLOFF_FACTOR = (10.0f);
    public static final float AL_DEFAULT_ROOM_ROLLOFF_FACTOR = (0.0f);
    public static final float AL_MIN_CONE_OUTER_GAINHF = (0.0f);
    public static final float AL_MAX_CONE_OUTER_GAINHF = (1.0f);
    public static final float AL_DEFAULT_CONE_OUTER_GAINHF = (1.0f);
    public static final int AL_MIN_DIRECT_FILTER_GAINHF_AUTO = AL_FALSE;
    public static final int AL_MAX_DIRECT_FILTER_GAINHF_AUTO = AL_TRUE;
    public static final int AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO = AL_TRUE;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO = AL_FALSE;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO = AL_TRUE;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO = AL_TRUE;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO = AL_FALSE;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO = AL_TRUE;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = AL_TRUE;
    public static final float AL_MIN_METERS_PER_UNIT = Float.MIN_VALUE;
    public static final float AL_MAX_METERS_PER_UNIT = Float.MAX_VALUE;
    public static final float AL_DEFAULT_METERS_PER_UNIT = (1.0f);
    public static final int ALC_CONNECTED = 0x313;
    public static final int AL_SOURCE_DISTANCE_MODEL = 0x200;
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 0x1031;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;
    public static final int AL_LOOP_POINTS_SOFT = 0x2015;
    public static final String AL_EXT_FOLDBACK_NAME = "AL_EXT_FOLDBACK";
    public static final int AL_FOLDBACK_EVENT_BLOCK = 0x4112;
    public static final int AL_FOLDBACK_EVENT_START = 0x4111;
    public static final int AL_FOLDBACK_EVENT_STOP = 0x4113;
    public static final int AL_FOLDBACK_MODE_MONO = 0x4101;
    public static final int AL_FOLDBACK_MODE_STEREO = 0x4102;
    public static final int AL_DEDICATED_GAIN = 0x0001;
    public static final int AL_EFFECT_DEDICATED_DIALOGUE = 0x9001;
    public static final int AL_EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT = 0x9000;
    public static final int AL_MONO_SOFT = 0x1500;
    public static final int AL_STEREO_SOFT = 0x1501;
    public static final int AL_REAR_SOFT = 0x1502;
    public static final int AL_QUAD_SOFT = 0x1503;
    public static final int AL_5POINT1_SOFT = 0x1504;
    public static final int AL_6POINT1_SOFT = 0x1505;
    public static final int AL_7POINT1_SOFT = 0x1506;
    public static final int AL_BYTE_SOFT = 0x1400;
    public static final int AL_UNSIGNED_BYTE_SOFT = 0x1401;
    public static final int AL_SHORT_SOFT = 0x1402;
    public static final int AL_UNSIGNED_SHORT_SOFT = 0x1403;
    public static final int AL_INT_SOFT = 0x1404;
    public static final int AL_UNSIGNED_INT_SOFT = 0x1405;
    public static final int AL_FLOAT_SOFT = 0x1406;
    public static final int AL_DOUBLE_SOFT = 0x1407;
    public static final int AL_BYTE3_SOFT = 0x1408;
    public static final int AL_UNSIGNED_BYTE3_SOFT = 0x1409;
    public static final int AL_MONO8_SOFT = 0x1100;
    public static final int AL_MONO16_SOFT = 0x1101;
    public static final int AL_MONO32F_SOFT = 0x10010;
    public static final int AL_STEREO8_SOFT = 0x1102;
    public static final int AL_STEREO16_SOFT = 0x1103;
    public static final int AL_STEREO32F_SOFT = 0x10011;
    public static final int AL_QUAD8_SOFT = 0x1204;
    public static final int AL_QUAD16_SOFT = 0x1205;
    public static final int AL_QUAD32F_SOFT = 0x1206;
    public static final int AL_REAR8_SOFT = 0x1207;
    public static final int AL_REAR16_SOFT = 0x1208;
    public static final int AL_REAR32F_SOFT = 0x1209;
    public static final int AL_5POINT1_8_SOFT = 0x120A;
    public static final int AL_5POINT1_16_SOFT = 0x120B;
    public static final int AL_5POINT1_32F_SOFT = 0x120C;
    public static final int AL_6POINT1_8_SOFT = 0x120D;
    public static final int AL_6POINT1_16_SOFT = 0x120E;
    public static final int AL_6POINT1_32F_SOFT = 0x120F;
    public static final int AL_7POINT1_8_SOFT = 0x1210;
    public static final int AL_7POINT1_16_SOFT = 0x1211;
    public static final int AL_7POINT1_32F_SOFT = 0x1212;
    public static final int AL_INTERNAL_FORMAT_SOFT = 0x2008;
    public static final int AL_BYTE_LENGTH_SOFT = 0x2009;
    public static final int AL_SAMPLE_LENGTH_SOFT = 0x200A;
    public static final int AL_SEC_LENGTH_SOFT = 0x200B;
    public static final int AL_DIRECT_CHANNELS_SOFT = 0x1033;
    public static final int ALC_FORMAT_CHANNELS_SOFT = 0x1990;
    public static final int ALC_FORMAT_TYPE_SOFT = 0x1991;
    public static final int ALC_BYTE_SOFT = 0x1400;
    public static final int ALC_UNSIGNED_BYTE_SOFT = 0x1401;
    public static final int ALC_SHORT_SOFT = 0x1402;
    public static final int ALC_UNSIGNED_SHORT_SOFT = 0x1403;
    public static final int ALC_INT_SOFT = 0x1404;
    public static final int ALC_UNSIGNED_INT_SOFT = 0x1405;
    public static final int ALC_FLOAT_SOFT = 0x1406;
    public static final int ALC_MONO_SOFT = 0x1500;
    public static final int ALC_STEREO_SOFT = 0x1501;
    public static final int ALC_QUAD_SOFT = 0x1503;
    public static final int ALC_5POINT1_SOFT = 0x1504;
    public static final int ALC_6POINT1_SOFT = 0x1505;
    public static final int ALC_7POINT1_SOFT = 0x1506;
    public static final int AL_STEREO_ANGLES = 0x1030;
    public static final int AL_SOURCE_RADIUS = 0x1031;
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 0x1200;
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 0x1201;
    public static final int ALC_DEFAULT_FILTER_ORDER = 0x1100;
    public static final int AL_DEFERRED_UPDATES_SOFT = 0xC002;
    public static final int AL_UNPACK_BLOCK_ALIGNMENT_SOFT = 0x200C;
    public static final int AL_PACK_BLOCK_ALIGNMENT_SOFT = 0x200D;
    public static final int AL_FORMAT_MONO_MSADPCM_SOFT = 0x1302;
    public static final int AL_FORMAT_STEREO_MSADPCM_SOFT = 0x1303;
    public static final int AL_FORMAT_BFORMAT2D_8 = 0x20021;
    public static final int AL_FORMAT_BFORMAT2D_16 = 0x20022;
    public static final int AL_FORMAT_BFORMAT2D_FLOAT32 = 0x20023;
    public static final int AL_FORMAT_BFORMAT3D_8 = 0x20031;
    public static final int AL_FORMAT_BFORMAT3D_16 = 0x20032;
    public static final int AL_FORMAT_BFORMAT3D_FLOAT32 = 0x20033;
    public static final int AL_FORMAT_BFORMAT2D_MULAW = 0x10031;
    public static final int AL_FORMAT_BFORMAT3D_MULAW = 0x10032;
    public static final int ALC_HRTF_SOFT = 0x1992;
    public static final int ALC_DONT_CARE_SOFT = 0x0002;
    public static final int ALC_HRTF_STATUS_SOFT = 0x1993;
    public static final int ALC_HRTF_DISABLED_SOFT = 0x0000;
    public static final int ALC_HRTF_ENABLED_SOFT = 0x0001;
    public static final int ALC_HRTF_DENIED_SOFT = 0x0002;
    public static final int ALC_HRTF_REQUIRED_SOFT = 0x0003;
    public static final int ALC_HRTF_HEADPHONES_DETECTED_SOFT = 0x0004;
    public static final int ALC_HRTF_UNSUPPORTED_FORMAT_SOFT = 0x0005;
    public static final int ALC_NUM_HRTF_SPECIFIERS_SOFT = 0x1994;
    public static final int ALC_HRTF_SPECIFIER_SOFT = 0x1995;
    public static final int ALC_HRTF_ID_SOFT = 0x1996;
    public static final int AL_GAIN_LIMIT_SOFT = 0x200E;
    public static final int AL_NUM_RESAMPLERS_SOFT = 0x1210;
    public static final int AL_DEFAULT_RESAMPLER_SOFT = 0x1211;
    public static final int AL_SOURCE_RESAMPLER_SOFT = 0x1212;
    public static final int AL_RESAMPLER_NAME_SOFT = 0x1213;
    public static final int AL_SOURCE_SPATIALIZE_SOFT = 0x1214;
    public static final int AL_AUTO_SOFT = 0x0002;
    public static final int ALC_OUTPUT_LIMITER_SOFT = 0x199A;
    public static final int ALC_DEVICE_CLOCK_SOFT = 0x1600;
    public static final int ALC_DEVICE_LATENCY_SOFT = 0x1601;
    public static final int ALC_DEVICE_CLOCK_LATENCY_SOFT = 0x1602;
    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 0x1202;
    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 0x1203;
    public static final int AL_DROP_UNMATCHED_SOFT = 0x0001;
    public static final int AL_REMIX_UNMATCHED_SOFT = 0x0002;
    public static final int AL_AMBISONIC_LAYOUT_SOFT = 0x1997;
    public static final int AL_AMBISONIC_SCALING_SOFT = 0x1998;
    public static final int AL_FUMA_SOFT = 0x0000;
    public static final int AL_ACN_SOFT = 0x0001;
    public static final int AL_SN3D_SOFT = 0x0001;
    public static final int AL_N3D_SOFT = 0x0002;
    public static final int ALC_AMBISONIC_LAYOUT_SOFT = 0x1997;
    public static final int ALC_AMBISONIC_SCALING_SOFT = 0x1998;
    public static final int ALC_AMBISONIC_ORDER_SOFT = 0x1999;
    public static final int ALC_MAX_AMBISONIC_ORDER_SOFT = 0x199B;
    public static final int ALC_BFORMAT3D_SOFT = 0x1507;
    public static final int ALC_FUMA_SOFT = 0x0000;
    public static final int ALC_ACN_SOFT = 0x0001;
    public static final int ALC_SN3D_SOFT = 0x0001;
    public static final int ALC_N3D_SOFT = 0x0002;
    public static final int AL_EFFECTSLOT_TARGET_SOFT = 0x199C;
    public static final int AL_EVENT_CALLBACK_FUNCTION_SOFT = 0x19A2;
    public static final int AL_EVENT_CALLBACK_USER_PARAM_SOFT = 0x19A3;
    public static final int AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT = 0x19A4;
    public static final int AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 0x19A5;
    public static final int AL_EVENT_TYPE_DISCONNECTED_SOFT = 0x19A6;
    public static final int AL_BUFFER_CALLBACK_FUNCTION_SOFT = 0x19A0;
    public static final int AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 0x19A1;
    public static final int AL_FORMAT_UHJ2CHN8_SOFT = 0x19A2;
    public static final int AL_FORMAT_UHJ2CHN16_SOFT = 0x19A3;
    public static final int AL_FORMAT_UHJ2CHN_FLOAT32_SOFT = 0x19A4;
    public static final int AL_FORMAT_UHJ3CHN8_SOFT = 0x19A5;
    public static final int AL_FORMAT_UHJ3CHN16_SOFT = 0x19A6;
    public static final int AL_FORMAT_UHJ3CHN_FLOAT32_SOFT = 0x19A7;
    public static final int AL_FORMAT_UHJ4CHN8_SOFT = 0x19A8;
    public static final int AL_FORMAT_UHJ4CHN16_SOFT = 0x19A9;
    public static final int AL_FORMAT_UHJ4CHN_FLOAT32_SOFT = 0x19AA;
    public static final int AL_STEREO_MODE_SOFT = 0x19B0;
    public static final int AL_NORMAL_SOFT = 0x0000;
    public static final int AL_SUPER_STEREO_SOFT = 0x0001;
    public static final int AL_SUPER_STEREO_WIDTH_SOFT = 0x19B1;
    public static final int AL_FORMAT_UHJ2CHN_MULAW_SOFT = 0x19B3;
    public static final int AL_FORMAT_UHJ2CHN_ALAW_SOFT = 0x19B4;
    public static final int AL_FORMAT_UHJ2CHN_IMA4_SOFT = 0x19B5;
    public static final int AL_FORMAT_UHJ2CHN_MSADPCM_SOFT = 0x19B6;
    public static final int AL_FORMAT_UHJ3CHN_MULAW_SOFT = 0x19B7;
    public static final int AL_FORMAT_UHJ3CHN_ALAW_SOFT = 0x19B8;
    public static final int AL_FORMAT_UHJ4CHN_MULAW_SOFT = 0x19B9;
    public static final int AL_FORMAT_UHJ4CHN_ALAW_SOFT = 0x19BA;
    public static final int ALC_OUTPUT_MODE_SOFT = 0x19AC;
    public static final int ALC_ANY_SOFT = 0x19AD;
    public static final int ALC_STEREO_BASIC_SOFT = 0x19AE;
    public static final int ALC_STEREO_UHJ_SOFT = 0x19AF;
    public static final int ALC_STEREO_HRTF_SOFT = 0x19B2;
    public static final int ALC_SURROUND_5_1_SOFT = 0x1504;
    public static final int ALC_SURROUND_6_1_SOFT = 0x1505;
    public static final int ALC_SURROUND_7_1_SOFT = 0x1506;
    public static final int ALC_CONTEXT_FLAGS_EXT = 0x19CF;
    public static final int ALC_CONTEXT_DEBUG_BIT_EXT = 0x0001;
    public static final int AL_DONT_CARE_EXT = 0x0002;
    public static final int AL_DEBUG_OUTPUT_EXT = 0x19B2;
    public static final int AL_DEBUG_CALLBACK_FUNCTION_EXT = 0x19B3;
    public static final int AL_DEBUG_CALLBACK_USER_PARAM_EXT = 0x19B4;
    public static final int AL_DEBUG_SOURCE_API_EXT = 0x19B5;
    public static final int AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT = 0x19B6;
    public static final int AL_DEBUG_SOURCE_THIRD_PARTY_EXT = 0x19B7;
    public static final int AL_DEBUG_SOURCE_APPLICATION_EXT = 0x19B8;
    public static final int AL_DEBUG_SOURCE_OTHER_EXT = 0x19B9;
    public static final int AL_DEBUG_TYPE_ERROR_EXT = 0x19BA;
    public static final int AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT = 0x19BB;
    public static final int AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT = 0x19BC;
    public static final int AL_DEBUG_TYPE_PORTABILITY_EXT = 0x19BD;
    public static final int AL_DEBUG_TYPE_PERFORMANCE_EXT = 0x19BE;
    public static final int AL_DEBUG_TYPE_MARKER_EXT = 0x19BF;
    public static final int AL_DEBUG_TYPE_PUSH_GROUP_EXT = 0x19C0;
    public static final int AL_DEBUG_TYPE_POP_GROUP_EXT = 0x19C1;
    public static final int AL_DEBUG_TYPE_OTHER_EXT = 0x19C2;
    public static final int AL_DEBUG_SEVERITY_HIGH_EXT = 0x19C3;
    public static final int AL_DEBUG_SEVERITY_MEDIUM_EXT = 0x19C4;
    public static final int AL_DEBUG_SEVERITY_LOW_EXT = 0x19C5;
    public static final int AL_DEBUG_SEVERITY_NOTIFICATION_EXT = 0x19C6;
    public static final int AL_DEBUG_LOGGED_MESSAGES_EXT = 0x19C7;
    public static final int AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT = 0x19C8;
    public static final int AL_MAX_DEBUG_MESSAGE_LENGTH_EXT = 0x19C9;
    public static final int AL_MAX_DEBUG_LOGGED_MESSAGES_EXT = 0x19CA;
    public static final int AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT = 0x19CB;
    public static final int AL_MAX_LABEL_LENGTH_EXT = 0x19CC;
    public static final int AL_STACK_OVERFLOW_EXT = 0x19CD;
    public static final int AL_STACK_UNDERFLOW_EXT = 0x19CE;
    public static final int AL_CONTEXT_FLAGS_EXT = 0x19CF;
    public static final int AL_BUFFER_EXT = 0x1009;
    public static final int AL_SOURCE_EXT = 0x19D0;
    public static final int AL_FILTER_EXT = 0x19D1;
    public static final int AL_EFFECT_EXT = 0x19D2;
    public static final int AL_AUXILIARY_EFFECT_SLOT_EXT = 0x19D3;
    public static final int ALC_PLAYBACK_DEVICE_SOFT = 0x19D4;
    public static final int ALC_CAPTURE_DEVICE_SOFT = 0x19D5;
    public static final int ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 0x19D6;
    public static final int ALC_EVENT_TYPE_DEVICE_ADDED_SOFT = 0x19D7;
    public static final int ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT = 0x19D8;
    public static final int ALC_EVENT_SUPPORTED_SOFT = 0x19D9;
    public static final int ALC_EVENT_NOT_SUPPORTED_SOFT = 0x19DA;
    public static final int AL_UNPACK_AMBISONIC_ORDER_SOFT = 0x199D;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`alBufferDataStatic`][#alBufferDataStatic].
        public static final MethodHandle MH_alBufferDataStatic = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alGenEffects`][#alGenEffects].
        public static final MethodHandle MH_alGenEffects = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteEffects`][#alDeleteEffects].
        public static final MethodHandle MH_alDeleteEffects = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsEffect`][#alIsEffect].
        public static final MethodHandle MH_alIsEffect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of [`alEffecti`][#alEffecti].
        public static final MethodHandle MH_alEffecti = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alEffectiv`][#alEffectiv].
        public static final MethodHandle MH_alEffectiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alEffectf`][#alEffectf].
        public static final MethodHandle MH_alEffectf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alEffectfv`][#alEffectfv].
        public static final MethodHandle MH_alEffectfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffecti`][#alGetEffecti].
        public static final MethodHandle MH_alGetEffecti = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectiv`][#alGetEffectiv].
        public static final MethodHandle MH_alGetEffectiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectf`][#alGetEffectf].
        public static final MethodHandle MH_alGetEffectf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectfv`][#alGetEffectfv].
        public static final MethodHandle MH_alGetEffectfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenFilters`][#alGenFilters].
        public static final MethodHandle MH_alGenFilters = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteFilters`][#alDeleteFilters].
        public static final MethodHandle MH_alDeleteFilters = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsFilter`][#alIsFilter].
        public static final MethodHandle MH_alIsFilter = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of [`alFilteri`][#alFilteri].
        public static final MethodHandle MH_alFilteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alFilteriv`][#alFilteriv].
        public static final MethodHandle MH_alFilteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alFilterf`][#alFilterf].
        public static final MethodHandle MH_alFilterf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alFilterfv`][#alFilterfv].
        public static final MethodHandle MH_alFilterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilteri`][#alGetFilteri].
        public static final MethodHandle MH_alGetFilteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilteriv`][#alGetFilteriv].
        public static final MethodHandle MH_alGetFilteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilterf`][#alGetFilterf].
        public static final MethodHandle MH_alGetFilterf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilterfv`][#alGetFilterfv].
        public static final MethodHandle MH_alGetFilterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenAuxiliaryEffectSlots`][#alGenAuxiliaryEffectSlots].
        public static final MethodHandle MH_alGenAuxiliaryEffectSlots = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteAuxiliaryEffectSlots`][#alDeleteAuxiliaryEffectSlots].
        public static final MethodHandle MH_alDeleteAuxiliaryEffectSlots = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsAuxiliaryEffectSlot`][#alIsAuxiliaryEffectSlot].
        public static final MethodHandle MH_alIsAuxiliaryEffectSlot = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of [`alAuxiliaryEffectSloti`][#alAuxiliaryEffectSloti].
        public static final MethodHandle MH_alAuxiliaryEffectSloti = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alAuxiliaryEffectSlotiv`][#alAuxiliaryEffectSlotiv].
        public static final MethodHandle MH_alAuxiliaryEffectSlotiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alAuxiliaryEffectSlotf`][#alAuxiliaryEffectSlotf].
        public static final MethodHandle MH_alAuxiliaryEffectSlotf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alAuxiliaryEffectSlotfv`][#alAuxiliaryEffectSlotfv].
        public static final MethodHandle MH_alAuxiliaryEffectSlotfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSloti`][#alGetAuxiliaryEffectSloti].
        public static final MethodHandle MH_alGetAuxiliaryEffectSloti = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotiv`][#alGetAuxiliaryEffectSlotiv].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotf`][#alGetAuxiliaryEffectSlotf].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotfv`][#alGetAuxiliaryEffectSlotfv].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alcSetThreadContext`][#alcSetThreadContext].
        public static final MethodHandle MH_alcSetThreadContext = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of [`alcGetThreadContext`][#alcGetThreadContext].
        public static final MethodHandle MH_alcGetThreadContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`alBufferSubDataSOFT`][#alBufferSubDataSOFT].
        public static final MethodHandle MH_alBufferSubDataSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alRequestFoldbackStart`][#alRequestFoldbackStart].
        public static final MethodHandle MH_alRequestFoldbackStart = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alRequestFoldbackStop`][#alRequestFoldbackStop].
        public static final MethodHandle MH_alRequestFoldbackStop = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of [`alBufferSamplesSOFT`][#alBufferSamplesSOFT].
        public static final MethodHandle MH_alBufferSamplesSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alBufferSubSamplesSOFT`][#alBufferSubSamplesSOFT].
        public static final MethodHandle MH_alBufferSubSamplesSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferSamplesSOFT`][#alGetBufferSamplesSOFT].
        public static final MethodHandle MH_alGetBufferSamplesSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsBufferFormatSupportedSOFT`][#alIsBufferFormatSupportedSOFT].
        public static final MethodHandle MH_alIsBufferFormatSupportedSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of [`alcLoopbackOpenDeviceSOFT`][#alcLoopbackOpenDeviceSOFT].
        public static final MethodHandle MH_alcLoopbackOpenDeviceSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alcIsRenderFormatSupportedSOFT`][#alcIsRenderFormatSupportedSOFT].
        public static final MethodHandle MH_alcIsRenderFormatSupportedSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alcRenderSamplesSOFT`][#alcRenderSamplesSOFT].
        public static final MethodHandle MH_alcRenderSamplesSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourcedSOFT`][#alSourcedSOFT].
        public static final MethodHandle MH_alSourcedSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        /// The method handle of [`alSource3dSOFT`][#alSource3dSOFT].
        public static final MethodHandle MH_alSource3dSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of [`alSourcedvSOFT`][#alSourcedvSOFT].
        public static final MethodHandle MH_alSourcedvSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcedSOFT`][#alGetSourcedSOFT].
        public static final MethodHandle MH_alGetSourcedSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3dSOFT`][#alGetSource3dSOFT].
        public static final MethodHandle MH_alGetSource3dSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcedvSOFT`][#alGetSourcedvSOFT].
        public static final MethodHandle MH_alGetSourcedvSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcei64SOFT`][#alSourcei64SOFT].
        public static final MethodHandle MH_alSourcei64SOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSource3i64SOFT`][#alSource3i64SOFT].
        public static final MethodHandle MH_alSource3i64SOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSourcei64vSOFT`][#alSourcei64vSOFT].
        public static final MethodHandle MH_alSourcei64vSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcei64SOFT`][#alGetSourcei64SOFT].
        public static final MethodHandle MH_alGetSourcei64SOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3i64SOFT`][#alGetSource3i64SOFT].
        public static final MethodHandle MH_alGetSource3i64SOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcei64vSOFT`][#alGetSourcei64vSOFT].
        public static final MethodHandle MH_alGetSourcei64vSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeferUpdatesSOFT`][#alDeferUpdatesSOFT].
        public static final MethodHandle MH_alDeferUpdatesSOFT = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of [`alProcessUpdatesSOFT`][#alProcessUpdatesSOFT].
        public static final MethodHandle MH_alProcessUpdatesSOFT = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of [`alcDevicePauseSOFT`][#alcDevicePauseSOFT].
        public static final MethodHandle MH_alcDevicePauseSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alcDeviceResumeSOFT`][#alcDeviceResumeSOFT].
        public static final MethodHandle MH_alcDeviceResumeSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alcGetStringiSOFT`][#alcGetStringiSOFT].
        public static final MethodHandle MH_alcGetStringiSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alcResetDeviceSOFT`][#alcResetDeviceSOFT].
        public static final MethodHandle MH_alcResetDeviceSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetStringiSOFT`][#alGetStringiSOFT].
        public static final MethodHandle MH_alGetStringiSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alcGetInteger64vSOFT`][#alcGetInteger64vSOFT].
        public static final MethodHandle MH_alcGetInteger64vSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alEventControlSOFT`][#alEventControlSOFT].
        public static final MethodHandle MH_alEventControlSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        /// The method handle of [`alEventCallbackSOFT`][#alEventCallbackSOFT].
        public static final MethodHandle MH_alEventCallbackSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetPointerSOFT`][#alGetPointerSOFT].
        public static final MethodHandle MH_alGetPointerSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetPointervSOFT`][#alGetPointervSOFT].
        public static final MethodHandle MH_alGetPointervSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alcReopenDeviceSOFT`][#alcReopenDeviceSOFT].
        public static final MethodHandle MH_alcReopenDeviceSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alBufferCallbackSOFT`][#alBufferCallbackSOFT].
        public static final MethodHandle MH_alBufferCallbackSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferPtrSOFT`][#alGetBufferPtrSOFT].
        public static final MethodHandle MH_alGetBufferPtrSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBuffer3PtrSOFT`][#alGetBuffer3PtrSOFT].
        public static final MethodHandle MH_alGetBuffer3PtrSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferPtrvSOFT`][#alGetBufferPtrvSOFT].
        public static final MethodHandle MH_alGetBufferPtrvSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcePlayAtTimeSOFT`][#alSourcePlayAtTimeSOFT].
        public static final MethodHandle MH_alSourcePlayAtTimeSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSourcePlayAtTimevSOFT`][#alSourcePlayAtTimevSOFT].
        public static final MethodHandle MH_alSourcePlayAtTimevSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of [`alDebugMessageCallbackEXT`][#alDebugMessageCallbackEXT].
        public static final MethodHandle MH_alDebugMessageCallbackEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alDebugMessageInsertEXT`][#alDebugMessageInsertEXT].
        public static final MethodHandle MH_alDebugMessageInsertEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDebugMessageControlEXT`][#alDebugMessageControlEXT].
        public static final MethodHandle MH_alDebugMessageControlEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        /// The method handle of [`alPushDebugGroupEXT`][#alPushDebugGroupEXT].
        public static final MethodHandle MH_alPushDebugGroupEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alPopDebugGroupEXT`][#alPopDebugGroupEXT].
        public static final MethodHandle MH_alPopDebugGroupEXT = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of [`alGetDebugMessageLogEXT`][#alGetDebugMessageLogEXT].
        public static final MethodHandle MH_alGetDebugMessageLogEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alObjectLabelEXT`][#alObjectLabelEXT].
        public static final MethodHandle MH_alObjectLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetObjectLabelEXT`][#alGetObjectLabelEXT].
        public static final MethodHandle MH_alGetObjectLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetPointerEXT`][#alGetPointerEXT].
        public static final MethodHandle MH_alGetPointerEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetPointervEXT`][#alGetPointervEXT].
        public static final MethodHandle MH_alGetPointervEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alcEventIsSupportedSOFT`][#alcEventIsSupportedSOFT].
        public static final MethodHandle MH_alcEventIsSupportedSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alcEventControlSOFT`][#alcEventControlSOFT].
        public static final MethodHandle MH_alcEventControlSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        /// The method handle of [`alcEventCallbackSOFT`][#alcEventCallbackSOFT].
        public static final MethodHandle MH_alcEventCallbackSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alcGetProcAddress2`][#alcGetProcAddress2].
        public static final MethodHandle MH_alcGetProcAddress2 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alEnableDirect`][#alEnableDirect].
        public static final MethodHandle MH_alEnableDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alDisableDirect`][#alDisableDirect].
        public static final MethodHandle MH_alDisableDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alIsEnabledDirect`][#alIsEnabledDirect].
        public static final MethodHandle MH_alIsEnabledDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alDopplerFactorDirect`][#alDopplerFactorDirect].
        public static final MethodHandle MH_alDopplerFactorDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alSpeedOfSoundDirect`][#alSpeedOfSoundDirect].
        public static final MethodHandle MH_alSpeedOfSoundDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alDistanceModelDirect`][#alDistanceModelDirect].
        public static final MethodHandle MH_alDistanceModelDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetStringDirect`][#alGetStringDirect].
        public static final MethodHandle MH_alGetStringDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetBooleanvDirect`][#alGetBooleanvDirect].
        public static final MethodHandle MH_alGetBooleanvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetIntegervDirect`][#alGetIntegervDirect].
        public static final MethodHandle MH_alGetIntegervDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFloatvDirect`][#alGetFloatvDirect].
        public static final MethodHandle MH_alGetFloatvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetDoublevDirect`][#alGetDoublevDirect].
        public static final MethodHandle MH_alGetDoublevDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBooleanDirect`][#alGetBooleanDirect].
        public static final MethodHandle MH_alGetBooleanDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetIntegerDirect`][#alGetIntegerDirect].
        public static final MethodHandle MH_alGetIntegerDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetFloatDirect`][#alGetFloatDirect].
        public static final MethodHandle MH_alGetFloatDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetDoubleDirect`][#alGetDoubleDirect].
        public static final MethodHandle MH_alGetDoubleDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetErrorDirect`][#alGetErrorDirect].
        public static final MethodHandle MH_alGetErrorDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsExtensionPresentDirect`][#alIsExtensionPresentDirect].
        public static final MethodHandle MH_alIsExtensionPresentDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetProcAddressDirect`][#alGetProcAddressDirect].
        public static final MethodHandle MH_alGetProcAddressDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEnumValueDirect`][#alGetEnumValueDirect].
        public static final MethodHandle MH_alGetEnumValueDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alListenerfDirect`][#alListenerfDirect].
        public static final MethodHandle MH_alListenerfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alListener3fDirect`][#alListener3fDirect].
        public static final MethodHandle MH_alListener3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alListenerfvDirect`][#alListenerfvDirect].
        public static final MethodHandle MH_alListenerfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alListeneriDirect`][#alListeneriDirect].
        public static final MethodHandle MH_alListeneriDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alListener3iDirect`][#alListener3iDirect].
        public static final MethodHandle MH_alListener3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alListenerivDirect`][#alListenerivDirect].
        public static final MethodHandle MH_alListenerivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListenerfDirect`][#alGetListenerfDirect].
        public static final MethodHandle MH_alGetListenerfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListener3fDirect`][#alGetListener3fDirect].
        public static final MethodHandle MH_alGetListener3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListenerfvDirect`][#alGetListenerfvDirect].
        public static final MethodHandle MH_alGetListenerfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListeneriDirect`][#alGetListeneriDirect].
        public static final MethodHandle MH_alGetListeneriDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListener3iDirect`][#alGetListener3iDirect].
        public static final MethodHandle MH_alGetListener3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetListenerivDirect`][#alGetListenerivDirect].
        public static final MethodHandle MH_alGetListenerivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenSourcesDirect`][#alGenSourcesDirect].
        public static final MethodHandle MH_alGenSourcesDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteSourcesDirect`][#alDeleteSourcesDirect].
        public static final MethodHandle MH_alDeleteSourcesDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsSourceDirect`][#alIsSourceDirect].
        public static final MethodHandle MH_alIsSourceDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourcefDirect`][#alSourcefDirect].
        public static final MethodHandle MH_alSourcefDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alSource3fDirect`][#alSource3fDirect].
        public static final MethodHandle MH_alSource3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alSourcefvDirect`][#alSourcefvDirect].
        public static final MethodHandle MH_alSourcefvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourceiDirect`][#alSourceiDirect].
        public static final MethodHandle MH_alSourceiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alSource3iDirect`][#alSource3iDirect].
        public static final MethodHandle MH_alSource3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourceivDirect`][#alSourceivDirect].
        public static final MethodHandle MH_alSourceivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcefDirect`][#alGetSourcefDirect].
        public static final MethodHandle MH_alGetSourcefDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3fDirect`][#alGetSource3fDirect].
        public static final MethodHandle MH_alGetSource3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcefvDirect`][#alGetSourcefvDirect].
        public static final MethodHandle MH_alGetSourcefvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourceiDirect`][#alGetSourceiDirect].
        public static final MethodHandle MH_alGetSourceiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3iDirect`][#alGetSource3iDirect].
        public static final MethodHandle MH_alGetSource3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourceivDirect`][#alGetSourceivDirect].
        public static final MethodHandle MH_alGetSourceivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcePlayDirect`][#alSourcePlayDirect].
        public static final MethodHandle MH_alSourcePlayDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourceStopDirect`][#alSourceStopDirect].
        public static final MethodHandle MH_alSourceStopDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourceRewindDirect`][#alSourceRewindDirect].
        public static final MethodHandle MH_alSourceRewindDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourcePauseDirect`][#alSourcePauseDirect].
        public static final MethodHandle MH_alSourcePauseDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourcePlayvDirect`][#alSourcePlayvDirect].
        public static final MethodHandle MH_alSourcePlayvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourceStopvDirect`][#alSourceStopvDirect].
        public static final MethodHandle MH_alSourceStopvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourceRewindvDirect`][#alSourceRewindvDirect].
        public static final MethodHandle MH_alSourceRewindvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcePausevDirect`][#alSourcePausevDirect].
        public static final MethodHandle MH_alSourcePausevDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourceQueueBuffersDirect`][#alSourceQueueBuffersDirect].
        public static final MethodHandle MH_alSourceQueueBuffersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourceUnqueueBuffersDirect`][#alSourceUnqueueBuffersDirect].
        public static final MethodHandle MH_alSourceUnqueueBuffersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenBuffersDirect`][#alGenBuffersDirect].
        public static final MethodHandle MH_alGenBuffersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteBuffersDirect`][#alDeleteBuffersDirect].
        public static final MethodHandle MH_alDeleteBuffersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsBufferDirect`][#alIsBufferDirect].
        public static final MethodHandle MH_alIsBufferDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alBufferDataDirect`][#alBufferDataDirect].
        public static final MethodHandle MH_alBufferDataDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alBufferfDirect`][#alBufferfDirect].
        public static final MethodHandle MH_alBufferfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alBuffer3fDirect`][#alBuffer3fDirect].
        public static final MethodHandle MH_alBuffer3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alBufferfvDirect`][#alBufferfvDirect].
        public static final MethodHandle MH_alBufferfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alBufferiDirect`][#alBufferiDirect].
        public static final MethodHandle MH_alBufferiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alBuffer3iDirect`][#alBuffer3iDirect].
        public static final MethodHandle MH_alBuffer3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alBufferivDirect`][#alBufferivDirect].
        public static final MethodHandle MH_alBufferivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferfDirect`][#alGetBufferfDirect].
        public static final MethodHandle MH_alGetBufferfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBuffer3fDirect`][#alGetBuffer3fDirect].
        public static final MethodHandle MH_alGetBuffer3fDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferfvDirect`][#alGetBufferfvDirect].
        public static final MethodHandle MH_alGetBufferfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferiDirect`][#alGetBufferiDirect].
        public static final MethodHandle MH_alGetBufferiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBuffer3iDirect`][#alGetBuffer3iDirect].
        public static final MethodHandle MH_alGetBuffer3iDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferivDirect`][#alGetBufferivDirect].
        public static final MethodHandle MH_alGetBufferivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenEffectsDirect`][#alGenEffectsDirect].
        public static final MethodHandle MH_alGenEffectsDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteEffectsDirect`][#alDeleteEffectsDirect].
        public static final MethodHandle MH_alDeleteEffectsDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsEffectDirect`][#alIsEffectDirect].
        public static final MethodHandle MH_alIsEffectDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alEffectiDirect`][#alEffectiDirect].
        public static final MethodHandle MH_alEffectiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alEffectivDirect`][#alEffectivDirect].
        public static final MethodHandle MH_alEffectivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alEffectfDirect`][#alEffectfDirect].
        public static final MethodHandle MH_alEffectfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alEffectfvDirect`][#alEffectfvDirect].
        public static final MethodHandle MH_alEffectfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectiDirect`][#alGetEffectiDirect].
        public static final MethodHandle MH_alGetEffectiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectivDirect`][#alGetEffectivDirect].
        public static final MethodHandle MH_alGetEffectivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectfDirect`][#alGetEffectfDirect].
        public static final MethodHandle MH_alGetEffectfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetEffectfvDirect`][#alGetEffectfvDirect].
        public static final MethodHandle MH_alGetEffectfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenFiltersDirect`][#alGenFiltersDirect].
        public static final MethodHandle MH_alGenFiltersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteFiltersDirect`][#alDeleteFiltersDirect].
        public static final MethodHandle MH_alDeleteFiltersDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsFilterDirect`][#alIsFilterDirect].
        public static final MethodHandle MH_alIsFilterDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alFilteriDirect`][#alFilteriDirect].
        public static final MethodHandle MH_alFilteriDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alFilterivDirect`][#alFilterivDirect].
        public static final MethodHandle MH_alFilterivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alFilterfDirect`][#alFilterfDirect].
        public static final MethodHandle MH_alFilterfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alFilterfvDirect`][#alFilterfvDirect].
        public static final MethodHandle MH_alFilterfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilteriDirect`][#alGetFilteriDirect].
        public static final MethodHandle MH_alGetFilteriDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilterivDirect`][#alGetFilterivDirect].
        public static final MethodHandle MH_alGetFilterivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilterfDirect`][#alGetFilterfDirect].
        public static final MethodHandle MH_alGetFilterfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetFilterfvDirect`][#alGetFilterfvDirect].
        public static final MethodHandle MH_alGetFilterfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGenAuxiliaryEffectSlotsDirect`][#alGenAuxiliaryEffectSlotsDirect].
        public static final MethodHandle MH_alGenAuxiliaryEffectSlotsDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeleteAuxiliaryEffectSlotsDirect`][#alDeleteAuxiliaryEffectSlotsDirect].
        public static final MethodHandle MH_alDeleteAuxiliaryEffectSlotsDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alIsAuxiliaryEffectSlotDirect`][#alIsAuxiliaryEffectSlotDirect].
        public static final MethodHandle MH_alIsAuxiliaryEffectSlotDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alAuxiliaryEffectSlotiDirect`][#alAuxiliaryEffectSlotiDirect].
        public static final MethodHandle MH_alAuxiliaryEffectSlotiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alAuxiliaryEffectSlotivDirect`][#alAuxiliaryEffectSlotivDirect].
        public static final MethodHandle MH_alAuxiliaryEffectSlotivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alAuxiliaryEffectSlotfDirect`][#alAuxiliaryEffectSlotfDirect].
        public static final MethodHandle MH_alAuxiliaryEffectSlotfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of [`alAuxiliaryEffectSlotfvDirect`][#alAuxiliaryEffectSlotfvDirect].
        public static final MethodHandle MH_alAuxiliaryEffectSlotfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotiDirect`][#alGetAuxiliaryEffectSlotiDirect].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotiDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotivDirect`][#alGetAuxiliaryEffectSlotivDirect].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotivDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotfDirect`][#alGetAuxiliaryEffectSlotfDirect].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetAuxiliaryEffectSlotfvDirect`][#alGetAuxiliaryEffectSlotfvDirect].
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfvDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alBufferDataStaticDirect`][#alBufferDataStaticDirect].
        public static final MethodHandle MH_alBufferDataStaticDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alDebugMessageCallbackDirectEXT`][#alDebugMessageCallbackDirectEXT].
        public static final MethodHandle MH_alDebugMessageCallbackDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alDebugMessageInsertDirectEXT`][#alDebugMessageInsertDirectEXT].
        public static final MethodHandle MH_alDebugMessageInsertDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDebugMessageControlDirectEXT`][#alDebugMessageControlDirectEXT].
        public static final MethodHandle MH_alDebugMessageControlDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        /// The method handle of [`alPushDebugGroupDirectEXT`][#alPushDebugGroupDirectEXT].
        public static final MethodHandle MH_alPushDebugGroupDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alPopDebugGroupDirectEXT`][#alPopDebugGroupDirectEXT].
        public static final MethodHandle MH_alPopDebugGroupDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alGetDebugMessageLogDirectEXT`][#alGetDebugMessageLogDirectEXT].
        public static final MethodHandle MH_alGetDebugMessageLogDirectEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alObjectLabelDirectEXT`][#alObjectLabelDirectEXT].
        public static final MethodHandle MH_alObjectLabelDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetObjectLabelDirectEXT`][#alGetObjectLabelDirectEXT].
        public static final MethodHandle MH_alGetObjectLabelDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetPointerDirectEXT`][#alGetPointerDirectEXT].
        public static final MethodHandle MH_alGetPointerDirectEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetPointervDirectEXT`][#alGetPointervDirectEXT].
        public static final MethodHandle MH_alGetPointervDirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alRequestFoldbackStartDirect`][#alRequestFoldbackStartDirect].
        public static final MethodHandle MH_alRequestFoldbackStartDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alRequestFoldbackStopDirect`][#alRequestFoldbackStopDirect].
        public static final MethodHandle MH_alRequestFoldbackStopDirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alBufferSubDataDirectSOFT`][#alBufferSubDataDirectSOFT].
        public static final MethodHandle MH_alBufferSubDataDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alSourcedDirectSOFT`][#alSourcedDirectSOFT].
        public static final MethodHandle MH_alSourcedDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        /// The method handle of [`alSource3dDirectSOFT`][#alSource3dDirectSOFT].
        public static final MethodHandle MH_alSource3dDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of [`alSourcedvDirectSOFT`][#alSourcedvDirectSOFT].
        public static final MethodHandle MH_alSourcedvDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcedDirectSOFT`][#alGetSourcedDirectSOFT].
        public static final MethodHandle MH_alGetSourcedDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3dDirectSOFT`][#alGetSource3dDirectSOFT].
        public static final MethodHandle MH_alGetSource3dDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcedvDirectSOFT`][#alGetSourcedvDirectSOFT].
        public static final MethodHandle MH_alGetSourcedvDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcei64DirectSOFT`][#alSourcei64DirectSOFT].
        public static final MethodHandle MH_alSourcei64DirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSource3i64DirectSOFT`][#alSource3i64DirectSOFT].
        public static final MethodHandle MH_alSource3i64DirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSourcei64vDirectSOFT`][#alSourcei64vDirectSOFT].
        public static final MethodHandle MH_alSourcei64vDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcei64DirectSOFT`][#alGetSourcei64DirectSOFT].
        public static final MethodHandle MH_alGetSourcei64DirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSource3i64DirectSOFT`][#alGetSource3i64DirectSOFT].
        public static final MethodHandle MH_alGetSource3i64DirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetSourcei64vDirectSOFT`][#alGetSourcei64vDirectSOFT].
        public static final MethodHandle MH_alGetSourcei64vDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alDeferUpdatesDirectSOFT`][#alDeferUpdatesDirectSOFT].
        public static final MethodHandle MH_alDeferUpdatesDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alProcessUpdatesDirectSOFT`][#alProcessUpdatesDirectSOFT].
        public static final MethodHandle MH_alProcessUpdatesDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`alGetStringiDirectSOFT`][#alGetStringiDirectSOFT].
        public static final MethodHandle MH_alGetStringiDirectSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`alEventControlDirectSOFT`][#alEventControlDirectSOFT].
        public static final MethodHandle MH_alEventControlDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        /// The method handle of [`alEventCallbackDirectSOFT`][#alEventCallbackDirectSOFT].
        public static final MethodHandle MH_alEventCallbackDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetPointerDirectSOFT`][#alGetPointerDirectSOFT].
        public static final MethodHandle MH_alGetPointerDirectSOFT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`alGetPointervDirectSOFT`][#alGetPointervDirectSOFT].
        public static final MethodHandle MH_alGetPointervDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alBufferCallbackDirectSOFT`][#alBufferCallbackDirectSOFT].
        public static final MethodHandle MH_alBufferCallbackDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferPtrDirectSOFT`][#alGetBufferPtrDirectSOFT].
        public static final MethodHandle MH_alGetBufferPtrDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBuffer3PtrDirectSOFT`][#alGetBuffer3PtrDirectSOFT].
        public static final MethodHandle MH_alGetBuffer3PtrDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`alGetBufferPtrvDirectSOFT`][#alGetBufferPtrvDirectSOFT].
        public static final MethodHandle MH_alGetBufferPtrvDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`alSourcePlayAtTimeDirectSOFT`][#alSourcePlayAtTimeDirectSOFT].
        public static final MethodHandle MH_alSourcePlayAtTimeDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of [`alSourcePlayAtTimevDirectSOFT`][#alSourcePlayAtTimevDirectSOFT].
        public static final MethodHandle MH_alSourcePlayAtTimevDirectSOFT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        /// The method handle of [`EAXSetDirect`][#EAXSetDirect].
        public static final MethodHandle MH_EAXSetDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`EAXGetDirect`][#EAXGetDirect].
        public static final MethodHandle MH_EAXGetDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`EAXSetBufferModeDirect`][#EAXSetBufferModeDirect].
        public static final MethodHandle MH_EAXSetBufferModeDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`EAXGetBufferModeDirect`][#EAXGetBufferModeDirect].
        public static final MethodHandle MH_EAXGetBufferModeDirect = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of [`alBufferDataStatic`][#alBufferDataStatic].
        public final MemorySegment PFN_alBufferDataStatic;
        /// The function address of [`alGenEffects`][#alGenEffects].
        public final MemorySegment PFN_alGenEffects;
        /// The function address of [`alDeleteEffects`][#alDeleteEffects].
        public final MemorySegment PFN_alDeleteEffects;
        /// The function address of [`alIsEffect`][#alIsEffect].
        public final MemorySegment PFN_alIsEffect;
        /// The function address of [`alEffecti`][#alEffecti].
        public final MemorySegment PFN_alEffecti;
        /// The function address of [`alEffectiv`][#alEffectiv].
        public final MemorySegment PFN_alEffectiv;
        /// The function address of [`alEffectf`][#alEffectf].
        public final MemorySegment PFN_alEffectf;
        /// The function address of [`alEffectfv`][#alEffectfv].
        public final MemorySegment PFN_alEffectfv;
        /// The function address of [`alGetEffecti`][#alGetEffecti].
        public final MemorySegment PFN_alGetEffecti;
        /// The function address of [`alGetEffectiv`][#alGetEffectiv].
        public final MemorySegment PFN_alGetEffectiv;
        /// The function address of [`alGetEffectf`][#alGetEffectf].
        public final MemorySegment PFN_alGetEffectf;
        /// The function address of [`alGetEffectfv`][#alGetEffectfv].
        public final MemorySegment PFN_alGetEffectfv;
        /// The function address of [`alGenFilters`][#alGenFilters].
        public final MemorySegment PFN_alGenFilters;
        /// The function address of [`alDeleteFilters`][#alDeleteFilters].
        public final MemorySegment PFN_alDeleteFilters;
        /// The function address of [`alIsFilter`][#alIsFilter].
        public final MemorySegment PFN_alIsFilter;
        /// The function address of [`alFilteri`][#alFilteri].
        public final MemorySegment PFN_alFilteri;
        /// The function address of [`alFilteriv`][#alFilteriv].
        public final MemorySegment PFN_alFilteriv;
        /// The function address of [`alFilterf`][#alFilterf].
        public final MemorySegment PFN_alFilterf;
        /// The function address of [`alFilterfv`][#alFilterfv].
        public final MemorySegment PFN_alFilterfv;
        /// The function address of [`alGetFilteri`][#alGetFilteri].
        public final MemorySegment PFN_alGetFilteri;
        /// The function address of [`alGetFilteriv`][#alGetFilteriv].
        public final MemorySegment PFN_alGetFilteriv;
        /// The function address of [`alGetFilterf`][#alGetFilterf].
        public final MemorySegment PFN_alGetFilterf;
        /// The function address of [`alGetFilterfv`][#alGetFilterfv].
        public final MemorySegment PFN_alGetFilterfv;
        /// The function address of [`alGenAuxiliaryEffectSlots`][#alGenAuxiliaryEffectSlots].
        public final MemorySegment PFN_alGenAuxiliaryEffectSlots;
        /// The function address of [`alDeleteAuxiliaryEffectSlots`][#alDeleteAuxiliaryEffectSlots].
        public final MemorySegment PFN_alDeleteAuxiliaryEffectSlots;
        /// The function address of [`alIsAuxiliaryEffectSlot`][#alIsAuxiliaryEffectSlot].
        public final MemorySegment PFN_alIsAuxiliaryEffectSlot;
        /// The function address of [`alAuxiliaryEffectSloti`][#alAuxiliaryEffectSloti].
        public final MemorySegment PFN_alAuxiliaryEffectSloti;
        /// The function address of [`alAuxiliaryEffectSlotiv`][#alAuxiliaryEffectSlotiv].
        public final MemorySegment PFN_alAuxiliaryEffectSlotiv;
        /// The function address of [`alAuxiliaryEffectSlotf`][#alAuxiliaryEffectSlotf].
        public final MemorySegment PFN_alAuxiliaryEffectSlotf;
        /// The function address of [`alAuxiliaryEffectSlotfv`][#alAuxiliaryEffectSlotfv].
        public final MemorySegment PFN_alAuxiliaryEffectSlotfv;
        /// The function address of [`alGetAuxiliaryEffectSloti`][#alGetAuxiliaryEffectSloti].
        public final MemorySegment PFN_alGetAuxiliaryEffectSloti;
        /// The function address of [`alGetAuxiliaryEffectSlotiv`][#alGetAuxiliaryEffectSlotiv].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotiv;
        /// The function address of [`alGetAuxiliaryEffectSlotf`][#alGetAuxiliaryEffectSlotf].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotf;
        /// The function address of [`alGetAuxiliaryEffectSlotfv`][#alGetAuxiliaryEffectSlotfv].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotfv;
        /// The function address of [`alcSetThreadContext`][#alcSetThreadContext].
        public final MemorySegment PFN_alcSetThreadContext;
        /// The function address of [`alcGetThreadContext`][#alcGetThreadContext].
        public final MemorySegment PFN_alcGetThreadContext;
        /// The function address of [`alBufferSubDataSOFT`][#alBufferSubDataSOFT].
        public final MemorySegment PFN_alBufferSubDataSOFT;
        /// The function address of [`alRequestFoldbackStart`][#alRequestFoldbackStart].
        public final MemorySegment PFN_alRequestFoldbackStart;
        /// The function address of [`alRequestFoldbackStop`][#alRequestFoldbackStop].
        public final MemorySegment PFN_alRequestFoldbackStop;
        /// The function address of [`alBufferSamplesSOFT`][#alBufferSamplesSOFT].
        public final MemorySegment PFN_alBufferSamplesSOFT;
        /// The function address of [`alBufferSubSamplesSOFT`][#alBufferSubSamplesSOFT].
        public final MemorySegment PFN_alBufferSubSamplesSOFT;
        /// The function address of [`alGetBufferSamplesSOFT`][#alGetBufferSamplesSOFT].
        public final MemorySegment PFN_alGetBufferSamplesSOFT;
        /// The function address of [`alIsBufferFormatSupportedSOFT`][#alIsBufferFormatSupportedSOFT].
        public final MemorySegment PFN_alIsBufferFormatSupportedSOFT;
        /// The function address of [`alcLoopbackOpenDeviceSOFT`][#alcLoopbackOpenDeviceSOFT].
        public final MemorySegment PFN_alcLoopbackOpenDeviceSOFT;
        /// The function address of [`alcIsRenderFormatSupportedSOFT`][#alcIsRenderFormatSupportedSOFT].
        public final MemorySegment PFN_alcIsRenderFormatSupportedSOFT;
        /// The function address of [`alcRenderSamplesSOFT`][#alcRenderSamplesSOFT].
        public final MemorySegment PFN_alcRenderSamplesSOFT;
        /// The function address of [`alSourcedSOFT`][#alSourcedSOFT].
        public final MemorySegment PFN_alSourcedSOFT;
        /// The function address of [`alSource3dSOFT`][#alSource3dSOFT].
        public final MemorySegment PFN_alSource3dSOFT;
        /// The function address of [`alSourcedvSOFT`][#alSourcedvSOFT].
        public final MemorySegment PFN_alSourcedvSOFT;
        /// The function address of [`alGetSourcedSOFT`][#alGetSourcedSOFT].
        public final MemorySegment PFN_alGetSourcedSOFT;
        /// The function address of [`alGetSource3dSOFT`][#alGetSource3dSOFT].
        public final MemorySegment PFN_alGetSource3dSOFT;
        /// The function address of [`alGetSourcedvSOFT`][#alGetSourcedvSOFT].
        public final MemorySegment PFN_alGetSourcedvSOFT;
        /// The function address of [`alSourcei64SOFT`][#alSourcei64SOFT].
        public final MemorySegment PFN_alSourcei64SOFT;
        /// The function address of [`alSource3i64SOFT`][#alSource3i64SOFT].
        public final MemorySegment PFN_alSource3i64SOFT;
        /// The function address of [`alSourcei64vSOFT`][#alSourcei64vSOFT].
        public final MemorySegment PFN_alSourcei64vSOFT;
        /// The function address of [`alGetSourcei64SOFT`][#alGetSourcei64SOFT].
        public final MemorySegment PFN_alGetSourcei64SOFT;
        /// The function address of [`alGetSource3i64SOFT`][#alGetSource3i64SOFT].
        public final MemorySegment PFN_alGetSource3i64SOFT;
        /// The function address of [`alGetSourcei64vSOFT`][#alGetSourcei64vSOFT].
        public final MemorySegment PFN_alGetSourcei64vSOFT;
        /// The function address of [`alDeferUpdatesSOFT`][#alDeferUpdatesSOFT].
        public final MemorySegment PFN_alDeferUpdatesSOFT;
        /// The function address of [`alProcessUpdatesSOFT`][#alProcessUpdatesSOFT].
        public final MemorySegment PFN_alProcessUpdatesSOFT;
        /// The function address of [`alcDevicePauseSOFT`][#alcDevicePauseSOFT].
        public final MemorySegment PFN_alcDevicePauseSOFT;
        /// The function address of [`alcDeviceResumeSOFT`][#alcDeviceResumeSOFT].
        public final MemorySegment PFN_alcDeviceResumeSOFT;
        /// The function address of [`alcGetStringiSOFT`][#alcGetStringiSOFT].
        public final MemorySegment PFN_alcGetStringiSOFT;
        /// The function address of [`alcResetDeviceSOFT`][#alcResetDeviceSOFT].
        public final MemorySegment PFN_alcResetDeviceSOFT;
        /// The function address of [`alGetStringiSOFT`][#alGetStringiSOFT].
        public final MemorySegment PFN_alGetStringiSOFT;
        /// The function address of [`alcGetInteger64vSOFT`][#alcGetInteger64vSOFT].
        public final MemorySegment PFN_alcGetInteger64vSOFT;
        /// The function address of [`alEventControlSOFT`][#alEventControlSOFT].
        public final MemorySegment PFN_alEventControlSOFT;
        /// The function address of [`alEventCallbackSOFT`][#alEventCallbackSOFT].
        public final MemorySegment PFN_alEventCallbackSOFT;
        /// The function address of [`alGetPointerSOFT`][#alGetPointerSOFT].
        public final MemorySegment PFN_alGetPointerSOFT;
        /// The function address of [`alGetPointervSOFT`][#alGetPointervSOFT].
        public final MemorySegment PFN_alGetPointervSOFT;
        /// The function address of [`alcReopenDeviceSOFT`][#alcReopenDeviceSOFT].
        public final MemorySegment PFN_alcReopenDeviceSOFT;
        /// The function address of [`alBufferCallbackSOFT`][#alBufferCallbackSOFT].
        public final MemorySegment PFN_alBufferCallbackSOFT;
        /// The function address of [`alGetBufferPtrSOFT`][#alGetBufferPtrSOFT].
        public final MemorySegment PFN_alGetBufferPtrSOFT;
        /// The function address of [`alGetBuffer3PtrSOFT`][#alGetBuffer3PtrSOFT].
        public final MemorySegment PFN_alGetBuffer3PtrSOFT;
        /// The function address of [`alGetBufferPtrvSOFT`][#alGetBufferPtrvSOFT].
        public final MemorySegment PFN_alGetBufferPtrvSOFT;
        /// The function address of [`alSourcePlayAtTimeSOFT`][#alSourcePlayAtTimeSOFT].
        public final MemorySegment PFN_alSourcePlayAtTimeSOFT;
        /// The function address of [`alSourcePlayAtTimevSOFT`][#alSourcePlayAtTimevSOFT].
        public final MemorySegment PFN_alSourcePlayAtTimevSOFT;
        /// The function address of [`alDebugMessageCallbackEXT`][#alDebugMessageCallbackEXT].
        public final MemorySegment PFN_alDebugMessageCallbackEXT;
        /// The function address of [`alDebugMessageInsertEXT`][#alDebugMessageInsertEXT].
        public final MemorySegment PFN_alDebugMessageInsertEXT;
        /// The function address of [`alDebugMessageControlEXT`][#alDebugMessageControlEXT].
        public final MemorySegment PFN_alDebugMessageControlEXT;
        /// The function address of [`alPushDebugGroupEXT`][#alPushDebugGroupEXT].
        public final MemorySegment PFN_alPushDebugGroupEXT;
        /// The function address of [`alPopDebugGroupEXT`][#alPopDebugGroupEXT].
        public final MemorySegment PFN_alPopDebugGroupEXT;
        /// The function address of [`alGetDebugMessageLogEXT`][#alGetDebugMessageLogEXT].
        public final MemorySegment PFN_alGetDebugMessageLogEXT;
        /// The function address of [`alObjectLabelEXT`][#alObjectLabelEXT].
        public final MemorySegment PFN_alObjectLabelEXT;
        /// The function address of [`alGetObjectLabelEXT`][#alGetObjectLabelEXT].
        public final MemorySegment PFN_alGetObjectLabelEXT;
        /// The function address of [`alGetPointerEXT`][#alGetPointerEXT].
        public final MemorySegment PFN_alGetPointerEXT;
        /// The function address of [`alGetPointervEXT`][#alGetPointervEXT].
        public final MemorySegment PFN_alGetPointervEXT;
        /// The function address of [`alcEventIsSupportedSOFT`][#alcEventIsSupportedSOFT].
        public final MemorySegment PFN_alcEventIsSupportedSOFT;
        /// The function address of [`alcEventControlSOFT`][#alcEventControlSOFT].
        public final MemorySegment PFN_alcEventControlSOFT;
        /// The function address of [`alcEventCallbackSOFT`][#alcEventCallbackSOFT].
        public final MemorySegment PFN_alcEventCallbackSOFT;
        /// The function address of [`alcGetProcAddress2`][#alcGetProcAddress2].
        public final MemorySegment PFN_alcGetProcAddress2;
        /// The function address of [`alEnableDirect`][#alEnableDirect].
        public final MemorySegment PFN_alEnableDirect;
        /// The function address of [`alDisableDirect`][#alDisableDirect].
        public final MemorySegment PFN_alDisableDirect;
        /// The function address of [`alIsEnabledDirect`][#alIsEnabledDirect].
        public final MemorySegment PFN_alIsEnabledDirect;
        /// The function address of [`alDopplerFactorDirect`][#alDopplerFactorDirect].
        public final MemorySegment PFN_alDopplerFactorDirect;
        /// The function address of [`alSpeedOfSoundDirect`][#alSpeedOfSoundDirect].
        public final MemorySegment PFN_alSpeedOfSoundDirect;
        /// The function address of [`alDistanceModelDirect`][#alDistanceModelDirect].
        public final MemorySegment PFN_alDistanceModelDirect;
        /// The function address of [`alGetStringDirect`][#alGetStringDirect].
        public final MemorySegment PFN_alGetStringDirect;
        /// The function address of [`alGetBooleanvDirect`][#alGetBooleanvDirect].
        public final MemorySegment PFN_alGetBooleanvDirect;
        /// The function address of [`alGetIntegervDirect`][#alGetIntegervDirect].
        public final MemorySegment PFN_alGetIntegervDirect;
        /// The function address of [`alGetFloatvDirect`][#alGetFloatvDirect].
        public final MemorySegment PFN_alGetFloatvDirect;
        /// The function address of [`alGetDoublevDirect`][#alGetDoublevDirect].
        public final MemorySegment PFN_alGetDoublevDirect;
        /// The function address of [`alGetBooleanDirect`][#alGetBooleanDirect].
        public final MemorySegment PFN_alGetBooleanDirect;
        /// The function address of [`alGetIntegerDirect`][#alGetIntegerDirect].
        public final MemorySegment PFN_alGetIntegerDirect;
        /// The function address of [`alGetFloatDirect`][#alGetFloatDirect].
        public final MemorySegment PFN_alGetFloatDirect;
        /// The function address of [`alGetDoubleDirect`][#alGetDoubleDirect].
        public final MemorySegment PFN_alGetDoubleDirect;
        /// The function address of [`alGetErrorDirect`][#alGetErrorDirect].
        public final MemorySegment PFN_alGetErrorDirect;
        /// The function address of [`alIsExtensionPresentDirect`][#alIsExtensionPresentDirect].
        public final MemorySegment PFN_alIsExtensionPresentDirect;
        /// The function address of [`alGetProcAddressDirect`][#alGetProcAddressDirect].
        public final MemorySegment PFN_alGetProcAddressDirect;
        /// The function address of [`alGetEnumValueDirect`][#alGetEnumValueDirect].
        public final MemorySegment PFN_alGetEnumValueDirect;
        /// The function address of [`alListenerfDirect`][#alListenerfDirect].
        public final MemorySegment PFN_alListenerfDirect;
        /// The function address of [`alListener3fDirect`][#alListener3fDirect].
        public final MemorySegment PFN_alListener3fDirect;
        /// The function address of [`alListenerfvDirect`][#alListenerfvDirect].
        public final MemorySegment PFN_alListenerfvDirect;
        /// The function address of [`alListeneriDirect`][#alListeneriDirect].
        public final MemorySegment PFN_alListeneriDirect;
        /// The function address of [`alListener3iDirect`][#alListener3iDirect].
        public final MemorySegment PFN_alListener3iDirect;
        /// The function address of [`alListenerivDirect`][#alListenerivDirect].
        public final MemorySegment PFN_alListenerivDirect;
        /// The function address of [`alGetListenerfDirect`][#alGetListenerfDirect].
        public final MemorySegment PFN_alGetListenerfDirect;
        /// The function address of [`alGetListener3fDirect`][#alGetListener3fDirect].
        public final MemorySegment PFN_alGetListener3fDirect;
        /// The function address of [`alGetListenerfvDirect`][#alGetListenerfvDirect].
        public final MemorySegment PFN_alGetListenerfvDirect;
        /// The function address of [`alGetListeneriDirect`][#alGetListeneriDirect].
        public final MemorySegment PFN_alGetListeneriDirect;
        /// The function address of [`alGetListener3iDirect`][#alGetListener3iDirect].
        public final MemorySegment PFN_alGetListener3iDirect;
        /// The function address of [`alGetListenerivDirect`][#alGetListenerivDirect].
        public final MemorySegment PFN_alGetListenerivDirect;
        /// The function address of [`alGenSourcesDirect`][#alGenSourcesDirect].
        public final MemorySegment PFN_alGenSourcesDirect;
        /// The function address of [`alDeleteSourcesDirect`][#alDeleteSourcesDirect].
        public final MemorySegment PFN_alDeleteSourcesDirect;
        /// The function address of [`alIsSourceDirect`][#alIsSourceDirect].
        public final MemorySegment PFN_alIsSourceDirect;
        /// The function address of [`alSourcefDirect`][#alSourcefDirect].
        public final MemorySegment PFN_alSourcefDirect;
        /// The function address of [`alSource3fDirect`][#alSource3fDirect].
        public final MemorySegment PFN_alSource3fDirect;
        /// The function address of [`alSourcefvDirect`][#alSourcefvDirect].
        public final MemorySegment PFN_alSourcefvDirect;
        /// The function address of [`alSourceiDirect`][#alSourceiDirect].
        public final MemorySegment PFN_alSourceiDirect;
        /// The function address of [`alSource3iDirect`][#alSource3iDirect].
        public final MemorySegment PFN_alSource3iDirect;
        /// The function address of [`alSourceivDirect`][#alSourceivDirect].
        public final MemorySegment PFN_alSourceivDirect;
        /// The function address of [`alGetSourcefDirect`][#alGetSourcefDirect].
        public final MemorySegment PFN_alGetSourcefDirect;
        /// The function address of [`alGetSource3fDirect`][#alGetSource3fDirect].
        public final MemorySegment PFN_alGetSource3fDirect;
        /// The function address of [`alGetSourcefvDirect`][#alGetSourcefvDirect].
        public final MemorySegment PFN_alGetSourcefvDirect;
        /// The function address of [`alGetSourceiDirect`][#alGetSourceiDirect].
        public final MemorySegment PFN_alGetSourceiDirect;
        /// The function address of [`alGetSource3iDirect`][#alGetSource3iDirect].
        public final MemorySegment PFN_alGetSource3iDirect;
        /// The function address of [`alGetSourceivDirect`][#alGetSourceivDirect].
        public final MemorySegment PFN_alGetSourceivDirect;
        /// The function address of [`alSourcePlayDirect`][#alSourcePlayDirect].
        public final MemorySegment PFN_alSourcePlayDirect;
        /// The function address of [`alSourceStopDirect`][#alSourceStopDirect].
        public final MemorySegment PFN_alSourceStopDirect;
        /// The function address of [`alSourceRewindDirect`][#alSourceRewindDirect].
        public final MemorySegment PFN_alSourceRewindDirect;
        /// The function address of [`alSourcePauseDirect`][#alSourcePauseDirect].
        public final MemorySegment PFN_alSourcePauseDirect;
        /// The function address of [`alSourcePlayvDirect`][#alSourcePlayvDirect].
        public final MemorySegment PFN_alSourcePlayvDirect;
        /// The function address of [`alSourceStopvDirect`][#alSourceStopvDirect].
        public final MemorySegment PFN_alSourceStopvDirect;
        /// The function address of [`alSourceRewindvDirect`][#alSourceRewindvDirect].
        public final MemorySegment PFN_alSourceRewindvDirect;
        /// The function address of [`alSourcePausevDirect`][#alSourcePausevDirect].
        public final MemorySegment PFN_alSourcePausevDirect;
        /// The function address of [`alSourceQueueBuffersDirect`][#alSourceQueueBuffersDirect].
        public final MemorySegment PFN_alSourceQueueBuffersDirect;
        /// The function address of [`alSourceUnqueueBuffersDirect`][#alSourceUnqueueBuffersDirect].
        public final MemorySegment PFN_alSourceUnqueueBuffersDirect;
        /// The function address of [`alGenBuffersDirect`][#alGenBuffersDirect].
        public final MemorySegment PFN_alGenBuffersDirect;
        /// The function address of [`alDeleteBuffersDirect`][#alDeleteBuffersDirect].
        public final MemorySegment PFN_alDeleteBuffersDirect;
        /// The function address of [`alIsBufferDirect`][#alIsBufferDirect].
        public final MemorySegment PFN_alIsBufferDirect;
        /// The function address of [`alBufferDataDirect`][#alBufferDataDirect].
        public final MemorySegment PFN_alBufferDataDirect;
        /// The function address of [`alBufferfDirect`][#alBufferfDirect].
        public final MemorySegment PFN_alBufferfDirect;
        /// The function address of [`alBuffer3fDirect`][#alBuffer3fDirect].
        public final MemorySegment PFN_alBuffer3fDirect;
        /// The function address of [`alBufferfvDirect`][#alBufferfvDirect].
        public final MemorySegment PFN_alBufferfvDirect;
        /// The function address of [`alBufferiDirect`][#alBufferiDirect].
        public final MemorySegment PFN_alBufferiDirect;
        /// The function address of [`alBuffer3iDirect`][#alBuffer3iDirect].
        public final MemorySegment PFN_alBuffer3iDirect;
        /// The function address of [`alBufferivDirect`][#alBufferivDirect].
        public final MemorySegment PFN_alBufferivDirect;
        /// The function address of [`alGetBufferfDirect`][#alGetBufferfDirect].
        public final MemorySegment PFN_alGetBufferfDirect;
        /// The function address of [`alGetBuffer3fDirect`][#alGetBuffer3fDirect].
        public final MemorySegment PFN_alGetBuffer3fDirect;
        /// The function address of [`alGetBufferfvDirect`][#alGetBufferfvDirect].
        public final MemorySegment PFN_alGetBufferfvDirect;
        /// The function address of [`alGetBufferiDirect`][#alGetBufferiDirect].
        public final MemorySegment PFN_alGetBufferiDirect;
        /// The function address of [`alGetBuffer3iDirect`][#alGetBuffer3iDirect].
        public final MemorySegment PFN_alGetBuffer3iDirect;
        /// The function address of [`alGetBufferivDirect`][#alGetBufferivDirect].
        public final MemorySegment PFN_alGetBufferivDirect;
        /// The function address of [`alGenEffectsDirect`][#alGenEffectsDirect].
        public final MemorySegment PFN_alGenEffectsDirect;
        /// The function address of [`alDeleteEffectsDirect`][#alDeleteEffectsDirect].
        public final MemorySegment PFN_alDeleteEffectsDirect;
        /// The function address of [`alIsEffectDirect`][#alIsEffectDirect].
        public final MemorySegment PFN_alIsEffectDirect;
        /// The function address of [`alEffectiDirect`][#alEffectiDirect].
        public final MemorySegment PFN_alEffectiDirect;
        /// The function address of [`alEffectivDirect`][#alEffectivDirect].
        public final MemorySegment PFN_alEffectivDirect;
        /// The function address of [`alEffectfDirect`][#alEffectfDirect].
        public final MemorySegment PFN_alEffectfDirect;
        /// The function address of [`alEffectfvDirect`][#alEffectfvDirect].
        public final MemorySegment PFN_alEffectfvDirect;
        /// The function address of [`alGetEffectiDirect`][#alGetEffectiDirect].
        public final MemorySegment PFN_alGetEffectiDirect;
        /// The function address of [`alGetEffectivDirect`][#alGetEffectivDirect].
        public final MemorySegment PFN_alGetEffectivDirect;
        /// The function address of [`alGetEffectfDirect`][#alGetEffectfDirect].
        public final MemorySegment PFN_alGetEffectfDirect;
        /// The function address of [`alGetEffectfvDirect`][#alGetEffectfvDirect].
        public final MemorySegment PFN_alGetEffectfvDirect;
        /// The function address of [`alGenFiltersDirect`][#alGenFiltersDirect].
        public final MemorySegment PFN_alGenFiltersDirect;
        /// The function address of [`alDeleteFiltersDirect`][#alDeleteFiltersDirect].
        public final MemorySegment PFN_alDeleteFiltersDirect;
        /// The function address of [`alIsFilterDirect`][#alIsFilterDirect].
        public final MemorySegment PFN_alIsFilterDirect;
        /// The function address of [`alFilteriDirect`][#alFilteriDirect].
        public final MemorySegment PFN_alFilteriDirect;
        /// The function address of [`alFilterivDirect`][#alFilterivDirect].
        public final MemorySegment PFN_alFilterivDirect;
        /// The function address of [`alFilterfDirect`][#alFilterfDirect].
        public final MemorySegment PFN_alFilterfDirect;
        /// The function address of [`alFilterfvDirect`][#alFilterfvDirect].
        public final MemorySegment PFN_alFilterfvDirect;
        /// The function address of [`alGetFilteriDirect`][#alGetFilteriDirect].
        public final MemorySegment PFN_alGetFilteriDirect;
        /// The function address of [`alGetFilterivDirect`][#alGetFilterivDirect].
        public final MemorySegment PFN_alGetFilterivDirect;
        /// The function address of [`alGetFilterfDirect`][#alGetFilterfDirect].
        public final MemorySegment PFN_alGetFilterfDirect;
        /// The function address of [`alGetFilterfvDirect`][#alGetFilterfvDirect].
        public final MemorySegment PFN_alGetFilterfvDirect;
        /// The function address of [`alGenAuxiliaryEffectSlotsDirect`][#alGenAuxiliaryEffectSlotsDirect].
        public final MemorySegment PFN_alGenAuxiliaryEffectSlotsDirect;
        /// The function address of [`alDeleteAuxiliaryEffectSlotsDirect`][#alDeleteAuxiliaryEffectSlotsDirect].
        public final MemorySegment PFN_alDeleteAuxiliaryEffectSlotsDirect;
        /// The function address of [`alIsAuxiliaryEffectSlotDirect`][#alIsAuxiliaryEffectSlotDirect].
        public final MemorySegment PFN_alIsAuxiliaryEffectSlotDirect;
        /// The function address of [`alAuxiliaryEffectSlotiDirect`][#alAuxiliaryEffectSlotiDirect].
        public final MemorySegment PFN_alAuxiliaryEffectSlotiDirect;
        /// The function address of [`alAuxiliaryEffectSlotivDirect`][#alAuxiliaryEffectSlotivDirect].
        public final MemorySegment PFN_alAuxiliaryEffectSlotivDirect;
        /// The function address of [`alAuxiliaryEffectSlotfDirect`][#alAuxiliaryEffectSlotfDirect].
        public final MemorySegment PFN_alAuxiliaryEffectSlotfDirect;
        /// The function address of [`alAuxiliaryEffectSlotfvDirect`][#alAuxiliaryEffectSlotfvDirect].
        public final MemorySegment PFN_alAuxiliaryEffectSlotfvDirect;
        /// The function address of [`alGetAuxiliaryEffectSlotiDirect`][#alGetAuxiliaryEffectSlotiDirect].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotiDirect;
        /// The function address of [`alGetAuxiliaryEffectSlotivDirect`][#alGetAuxiliaryEffectSlotivDirect].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotivDirect;
        /// The function address of [`alGetAuxiliaryEffectSlotfDirect`][#alGetAuxiliaryEffectSlotfDirect].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotfDirect;
        /// The function address of [`alGetAuxiliaryEffectSlotfvDirect`][#alGetAuxiliaryEffectSlotfvDirect].
        public final MemorySegment PFN_alGetAuxiliaryEffectSlotfvDirect;
        /// The function address of [`alBufferDataStaticDirect`][#alBufferDataStaticDirect].
        public final MemorySegment PFN_alBufferDataStaticDirect;
        /// The function address of [`alDebugMessageCallbackDirectEXT`][#alDebugMessageCallbackDirectEXT].
        public final MemorySegment PFN_alDebugMessageCallbackDirectEXT;
        /// The function address of [`alDebugMessageInsertDirectEXT`][#alDebugMessageInsertDirectEXT].
        public final MemorySegment PFN_alDebugMessageInsertDirectEXT;
        /// The function address of [`alDebugMessageControlDirectEXT`][#alDebugMessageControlDirectEXT].
        public final MemorySegment PFN_alDebugMessageControlDirectEXT;
        /// The function address of [`alPushDebugGroupDirectEXT`][#alPushDebugGroupDirectEXT].
        public final MemorySegment PFN_alPushDebugGroupDirectEXT;
        /// The function address of [`alPopDebugGroupDirectEXT`][#alPopDebugGroupDirectEXT].
        public final MemorySegment PFN_alPopDebugGroupDirectEXT;
        /// The function address of [`alGetDebugMessageLogDirectEXT`][#alGetDebugMessageLogDirectEXT].
        public final MemorySegment PFN_alGetDebugMessageLogDirectEXT;
        /// The function address of [`alObjectLabelDirectEXT`][#alObjectLabelDirectEXT].
        public final MemorySegment PFN_alObjectLabelDirectEXT;
        /// The function address of [`alGetObjectLabelDirectEXT`][#alGetObjectLabelDirectEXT].
        public final MemorySegment PFN_alGetObjectLabelDirectEXT;
        /// The function address of [`alGetPointerDirectEXT`][#alGetPointerDirectEXT].
        public final MemorySegment PFN_alGetPointerDirectEXT;
        /// The function address of [`alGetPointervDirectEXT`][#alGetPointervDirectEXT].
        public final MemorySegment PFN_alGetPointervDirectEXT;
        /// The function address of [`alRequestFoldbackStartDirect`][#alRequestFoldbackStartDirect].
        public final MemorySegment PFN_alRequestFoldbackStartDirect;
        /// The function address of [`alRequestFoldbackStopDirect`][#alRequestFoldbackStopDirect].
        public final MemorySegment PFN_alRequestFoldbackStopDirect;
        /// The function address of [`alBufferSubDataDirectSOFT`][#alBufferSubDataDirectSOFT].
        public final MemorySegment PFN_alBufferSubDataDirectSOFT;
        /// The function address of [`alSourcedDirectSOFT`][#alSourcedDirectSOFT].
        public final MemorySegment PFN_alSourcedDirectSOFT;
        /// The function address of [`alSource3dDirectSOFT`][#alSource3dDirectSOFT].
        public final MemorySegment PFN_alSource3dDirectSOFT;
        /// The function address of [`alSourcedvDirectSOFT`][#alSourcedvDirectSOFT].
        public final MemorySegment PFN_alSourcedvDirectSOFT;
        /// The function address of [`alGetSourcedDirectSOFT`][#alGetSourcedDirectSOFT].
        public final MemorySegment PFN_alGetSourcedDirectSOFT;
        /// The function address of [`alGetSource3dDirectSOFT`][#alGetSource3dDirectSOFT].
        public final MemorySegment PFN_alGetSource3dDirectSOFT;
        /// The function address of [`alGetSourcedvDirectSOFT`][#alGetSourcedvDirectSOFT].
        public final MemorySegment PFN_alGetSourcedvDirectSOFT;
        /// The function address of [`alSourcei64DirectSOFT`][#alSourcei64DirectSOFT].
        public final MemorySegment PFN_alSourcei64DirectSOFT;
        /// The function address of [`alSource3i64DirectSOFT`][#alSource3i64DirectSOFT].
        public final MemorySegment PFN_alSource3i64DirectSOFT;
        /// The function address of [`alSourcei64vDirectSOFT`][#alSourcei64vDirectSOFT].
        public final MemorySegment PFN_alSourcei64vDirectSOFT;
        /// The function address of [`alGetSourcei64DirectSOFT`][#alGetSourcei64DirectSOFT].
        public final MemorySegment PFN_alGetSourcei64DirectSOFT;
        /// The function address of [`alGetSource3i64DirectSOFT`][#alGetSource3i64DirectSOFT].
        public final MemorySegment PFN_alGetSource3i64DirectSOFT;
        /// The function address of [`alGetSourcei64vDirectSOFT`][#alGetSourcei64vDirectSOFT].
        public final MemorySegment PFN_alGetSourcei64vDirectSOFT;
        /// The function address of [`alDeferUpdatesDirectSOFT`][#alDeferUpdatesDirectSOFT].
        public final MemorySegment PFN_alDeferUpdatesDirectSOFT;
        /// The function address of [`alProcessUpdatesDirectSOFT`][#alProcessUpdatesDirectSOFT].
        public final MemorySegment PFN_alProcessUpdatesDirectSOFT;
        /// The function address of [`alGetStringiDirectSOFT`][#alGetStringiDirectSOFT].
        public final MemorySegment PFN_alGetStringiDirectSOFT;
        /// The function address of [`alEventControlDirectSOFT`][#alEventControlDirectSOFT].
        public final MemorySegment PFN_alEventControlDirectSOFT;
        /// The function address of [`alEventCallbackDirectSOFT`][#alEventCallbackDirectSOFT].
        public final MemorySegment PFN_alEventCallbackDirectSOFT;
        /// The function address of [`alGetPointerDirectSOFT`][#alGetPointerDirectSOFT].
        public final MemorySegment PFN_alGetPointerDirectSOFT;
        /// The function address of [`alGetPointervDirectSOFT`][#alGetPointervDirectSOFT].
        public final MemorySegment PFN_alGetPointervDirectSOFT;
        /// The function address of [`alBufferCallbackDirectSOFT`][#alBufferCallbackDirectSOFT].
        public final MemorySegment PFN_alBufferCallbackDirectSOFT;
        /// The function address of [`alGetBufferPtrDirectSOFT`][#alGetBufferPtrDirectSOFT].
        public final MemorySegment PFN_alGetBufferPtrDirectSOFT;
        /// The function address of [`alGetBuffer3PtrDirectSOFT`][#alGetBuffer3PtrDirectSOFT].
        public final MemorySegment PFN_alGetBuffer3PtrDirectSOFT;
        /// The function address of [`alGetBufferPtrvDirectSOFT`][#alGetBufferPtrvDirectSOFT].
        public final MemorySegment PFN_alGetBufferPtrvDirectSOFT;
        /// The function address of [`alSourcePlayAtTimeDirectSOFT`][#alSourcePlayAtTimeDirectSOFT].
        public final MemorySegment PFN_alSourcePlayAtTimeDirectSOFT;
        /// The function address of [`alSourcePlayAtTimevDirectSOFT`][#alSourcePlayAtTimevDirectSOFT].
        public final MemorySegment PFN_alSourcePlayAtTimevDirectSOFT;
        /// The function address of [`EAXSetDirect`][#EAXSetDirect].
        public final MemorySegment PFN_EAXSetDirect;
        /// The function address of [`EAXGetDirect`][#EAXGetDirect].
        public final MemorySegment PFN_EAXGetDirect;
        /// The function address of [`EAXSetBufferModeDirect`][#EAXSetBufferModeDirect].
        public final MemorySegment PFN_EAXSetBufferModeDirect;
        /// The function address of [`EAXGetBufferModeDirect`][#EAXGetBufferModeDirect].
        public final MemorySegment PFN_EAXGetBufferModeDirect;

        private Handles() {
            var _lookup = OpenALLibrary.lookup();
            PFN_alBufferDataStatic = _lookup.findOrThrow("alBufferDataStatic");
            PFN_alGenEffects = _lookup.findOrThrow("alGenEffects");
            PFN_alDeleteEffects = _lookup.findOrThrow("alDeleteEffects");
            PFN_alIsEffect = _lookup.findOrThrow("alIsEffect");
            PFN_alEffecti = _lookup.findOrThrow("alEffecti");
            PFN_alEffectiv = _lookup.findOrThrow("alEffectiv");
            PFN_alEffectf = _lookup.findOrThrow("alEffectf");
            PFN_alEffectfv = _lookup.findOrThrow("alEffectfv");
            PFN_alGetEffecti = _lookup.findOrThrow("alGetEffecti");
            PFN_alGetEffectiv = _lookup.findOrThrow("alGetEffectiv");
            PFN_alGetEffectf = _lookup.findOrThrow("alGetEffectf");
            PFN_alGetEffectfv = _lookup.findOrThrow("alGetEffectfv");
            PFN_alGenFilters = _lookup.findOrThrow("alGenFilters");
            PFN_alDeleteFilters = _lookup.findOrThrow("alDeleteFilters");
            PFN_alIsFilter = _lookup.findOrThrow("alIsFilter");
            PFN_alFilteri = _lookup.findOrThrow("alFilteri");
            PFN_alFilteriv = _lookup.findOrThrow("alFilteriv");
            PFN_alFilterf = _lookup.findOrThrow("alFilterf");
            PFN_alFilterfv = _lookup.findOrThrow("alFilterfv");
            PFN_alGetFilteri = _lookup.findOrThrow("alGetFilteri");
            PFN_alGetFilteriv = _lookup.findOrThrow("alGetFilteriv");
            PFN_alGetFilterf = _lookup.findOrThrow("alGetFilterf");
            PFN_alGetFilterfv = _lookup.findOrThrow("alGetFilterfv");
            PFN_alGenAuxiliaryEffectSlots = _lookup.findOrThrow("alGenAuxiliaryEffectSlots");
            PFN_alDeleteAuxiliaryEffectSlots = _lookup.findOrThrow("alDeleteAuxiliaryEffectSlots");
            PFN_alIsAuxiliaryEffectSlot = _lookup.findOrThrow("alIsAuxiliaryEffectSlot");
            PFN_alAuxiliaryEffectSloti = _lookup.findOrThrow("alAuxiliaryEffectSloti");
            PFN_alAuxiliaryEffectSlotiv = _lookup.findOrThrow("alAuxiliaryEffectSlotiv");
            PFN_alAuxiliaryEffectSlotf = _lookup.findOrThrow("alAuxiliaryEffectSlotf");
            PFN_alAuxiliaryEffectSlotfv = _lookup.findOrThrow("alAuxiliaryEffectSlotfv");
            PFN_alGetAuxiliaryEffectSloti = _lookup.findOrThrow("alGetAuxiliaryEffectSloti");
            PFN_alGetAuxiliaryEffectSlotiv = _lookup.findOrThrow("alGetAuxiliaryEffectSlotiv");
            PFN_alGetAuxiliaryEffectSlotf = _lookup.findOrThrow("alGetAuxiliaryEffectSlotf");
            PFN_alGetAuxiliaryEffectSlotfv = _lookup.findOrThrow("alGetAuxiliaryEffectSlotfv");
            PFN_alcSetThreadContext = _lookup.findOrThrow("alcSetThreadContext");
            PFN_alcGetThreadContext = _lookup.findOrThrow("alcGetThreadContext");
            PFN_alBufferSubDataSOFT = _lookup.findOrThrow("alBufferSubDataSOFT");
            PFN_alRequestFoldbackStart = _lookup.findOrThrow("alRequestFoldbackStart");
            PFN_alRequestFoldbackStop = _lookup.findOrThrow("alRequestFoldbackStop");
            PFN_alBufferSamplesSOFT = _lookup.findOrThrow("alBufferSamplesSOFT");
            PFN_alBufferSubSamplesSOFT = _lookup.findOrThrow("alBufferSubSamplesSOFT");
            PFN_alGetBufferSamplesSOFT = _lookup.findOrThrow("alGetBufferSamplesSOFT");
            PFN_alIsBufferFormatSupportedSOFT = _lookup.findOrThrow("alIsBufferFormatSupportedSOFT");
            PFN_alcLoopbackOpenDeviceSOFT = _lookup.findOrThrow("alcLoopbackOpenDeviceSOFT");
            PFN_alcIsRenderFormatSupportedSOFT = _lookup.findOrThrow("alcIsRenderFormatSupportedSOFT");
            PFN_alcRenderSamplesSOFT = _lookup.findOrThrow("alcRenderSamplesSOFT");
            PFN_alSourcedSOFT = _lookup.findOrThrow("alSourcedSOFT");
            PFN_alSource3dSOFT = _lookup.findOrThrow("alSource3dSOFT");
            PFN_alSourcedvSOFT = _lookup.findOrThrow("alSourcedvSOFT");
            PFN_alGetSourcedSOFT = _lookup.findOrThrow("alGetSourcedSOFT");
            PFN_alGetSource3dSOFT = _lookup.findOrThrow("alGetSource3dSOFT");
            PFN_alGetSourcedvSOFT = _lookup.findOrThrow("alGetSourcedvSOFT");
            PFN_alSourcei64SOFT = _lookup.findOrThrow("alSourcei64SOFT");
            PFN_alSource3i64SOFT = _lookup.findOrThrow("alSource3i64SOFT");
            PFN_alSourcei64vSOFT = _lookup.findOrThrow("alSourcei64vSOFT");
            PFN_alGetSourcei64SOFT = _lookup.findOrThrow("alGetSourcei64SOFT");
            PFN_alGetSource3i64SOFT = _lookup.findOrThrow("alGetSource3i64SOFT");
            PFN_alGetSourcei64vSOFT = _lookup.findOrThrow("alGetSourcei64vSOFT");
            PFN_alDeferUpdatesSOFT = _lookup.findOrThrow("alDeferUpdatesSOFT");
            PFN_alProcessUpdatesSOFT = _lookup.findOrThrow("alProcessUpdatesSOFT");
            PFN_alcDevicePauseSOFT = _lookup.findOrThrow("alcDevicePauseSOFT");
            PFN_alcDeviceResumeSOFT = _lookup.findOrThrow("alcDeviceResumeSOFT");
            PFN_alcGetStringiSOFT = _lookup.findOrThrow("alcGetStringiSOFT");
            PFN_alcResetDeviceSOFT = _lookup.findOrThrow("alcResetDeviceSOFT");
            PFN_alGetStringiSOFT = _lookup.findOrThrow("alGetStringiSOFT");
            PFN_alcGetInteger64vSOFT = _lookup.findOrThrow("alcGetInteger64vSOFT");
            PFN_alEventControlSOFT = _lookup.findOrThrow("alEventControlSOFT");
            PFN_alEventCallbackSOFT = _lookup.findOrThrow("alEventCallbackSOFT");
            PFN_alGetPointerSOFT = _lookup.findOrThrow("alGetPointerSOFT");
            PFN_alGetPointervSOFT = _lookup.findOrThrow("alGetPointervSOFT");
            PFN_alcReopenDeviceSOFT = _lookup.findOrThrow("alcReopenDeviceSOFT");
            PFN_alBufferCallbackSOFT = _lookup.findOrThrow("alBufferCallbackSOFT");
            PFN_alGetBufferPtrSOFT = _lookup.findOrThrow("alGetBufferPtrSOFT");
            PFN_alGetBuffer3PtrSOFT = _lookup.findOrThrow("alGetBuffer3PtrSOFT");
            PFN_alGetBufferPtrvSOFT = _lookup.findOrThrow("alGetBufferPtrvSOFT");
            PFN_alSourcePlayAtTimeSOFT = _lookup.findOrThrow("alSourcePlayAtTimeSOFT");
            PFN_alSourcePlayAtTimevSOFT = _lookup.findOrThrow("alSourcePlayAtTimevSOFT");
            PFN_alDebugMessageCallbackEXT = _lookup.findOrThrow("alDebugMessageCallbackEXT");
            PFN_alDebugMessageInsertEXT = _lookup.findOrThrow("alDebugMessageInsertEXT");
            PFN_alDebugMessageControlEXT = _lookup.findOrThrow("alDebugMessageControlEXT");
            PFN_alPushDebugGroupEXT = _lookup.findOrThrow("alPushDebugGroupEXT");
            PFN_alPopDebugGroupEXT = _lookup.findOrThrow("alPopDebugGroupEXT");
            PFN_alGetDebugMessageLogEXT = _lookup.findOrThrow("alGetDebugMessageLogEXT");
            PFN_alObjectLabelEXT = _lookup.findOrThrow("alObjectLabelEXT");
            PFN_alGetObjectLabelEXT = _lookup.findOrThrow("alGetObjectLabelEXT");
            PFN_alGetPointerEXT = _lookup.findOrThrow("alGetPointerEXT");
            PFN_alGetPointervEXT = _lookup.findOrThrow("alGetPointervEXT");
            PFN_alcEventIsSupportedSOFT = _lookup.findOrThrow("alcEventIsSupportedSOFT");
            PFN_alcEventControlSOFT = _lookup.findOrThrow("alcEventControlSOFT");
            PFN_alcEventCallbackSOFT = _lookup.findOrThrow("alcEventCallbackSOFT");
            PFN_alcGetProcAddress2 = _lookup.findOrThrow("alcGetProcAddress2");
            PFN_alEnableDirect = _lookup.findOrThrow("alEnableDirect");
            PFN_alDisableDirect = _lookup.findOrThrow("alDisableDirect");
            PFN_alIsEnabledDirect = _lookup.findOrThrow("alIsEnabledDirect");
            PFN_alDopplerFactorDirect = _lookup.findOrThrow("alDopplerFactorDirect");
            PFN_alSpeedOfSoundDirect = _lookup.findOrThrow("alSpeedOfSoundDirect");
            PFN_alDistanceModelDirect = _lookup.findOrThrow("alDistanceModelDirect");
            PFN_alGetStringDirect = _lookup.findOrThrow("alGetStringDirect");
            PFN_alGetBooleanvDirect = _lookup.findOrThrow("alGetBooleanvDirect");
            PFN_alGetIntegervDirect = _lookup.findOrThrow("alGetIntegervDirect");
            PFN_alGetFloatvDirect = _lookup.findOrThrow("alGetFloatvDirect");
            PFN_alGetDoublevDirect = _lookup.findOrThrow("alGetDoublevDirect");
            PFN_alGetBooleanDirect = _lookup.findOrThrow("alGetBooleanDirect");
            PFN_alGetIntegerDirect = _lookup.findOrThrow("alGetIntegerDirect");
            PFN_alGetFloatDirect = _lookup.findOrThrow("alGetFloatDirect");
            PFN_alGetDoubleDirect = _lookup.findOrThrow("alGetDoubleDirect");
            PFN_alGetErrorDirect = _lookup.findOrThrow("alGetErrorDirect");
            PFN_alIsExtensionPresentDirect = _lookup.findOrThrow("alIsExtensionPresentDirect");
            PFN_alGetProcAddressDirect = _lookup.findOrThrow("alGetProcAddressDirect");
            PFN_alGetEnumValueDirect = _lookup.findOrThrow("alGetEnumValueDirect");
            PFN_alListenerfDirect = _lookup.findOrThrow("alListenerfDirect");
            PFN_alListener3fDirect = _lookup.findOrThrow("alListener3fDirect");
            PFN_alListenerfvDirect = _lookup.findOrThrow("alListenerfvDirect");
            PFN_alListeneriDirect = _lookup.findOrThrow("alListeneriDirect");
            PFN_alListener3iDirect = _lookup.findOrThrow("alListener3iDirect");
            PFN_alListenerivDirect = _lookup.findOrThrow("alListenerivDirect");
            PFN_alGetListenerfDirect = _lookup.findOrThrow("alGetListenerfDirect");
            PFN_alGetListener3fDirect = _lookup.findOrThrow("alGetListener3fDirect");
            PFN_alGetListenerfvDirect = _lookup.findOrThrow("alGetListenerfvDirect");
            PFN_alGetListeneriDirect = _lookup.findOrThrow("alGetListeneriDirect");
            PFN_alGetListener3iDirect = _lookup.findOrThrow("alGetListener3iDirect");
            PFN_alGetListenerivDirect = _lookup.findOrThrow("alGetListenerivDirect");
            PFN_alGenSourcesDirect = _lookup.findOrThrow("alGenSourcesDirect");
            PFN_alDeleteSourcesDirect = _lookup.findOrThrow("alDeleteSourcesDirect");
            PFN_alIsSourceDirect = _lookup.findOrThrow("alIsSourceDirect");
            PFN_alSourcefDirect = _lookup.findOrThrow("alSourcefDirect");
            PFN_alSource3fDirect = _lookup.findOrThrow("alSource3fDirect");
            PFN_alSourcefvDirect = _lookup.findOrThrow("alSourcefvDirect");
            PFN_alSourceiDirect = _lookup.findOrThrow("alSourceiDirect");
            PFN_alSource3iDirect = _lookup.findOrThrow("alSource3iDirect");
            PFN_alSourceivDirect = _lookup.findOrThrow("alSourceivDirect");
            PFN_alGetSourcefDirect = _lookup.findOrThrow("alGetSourcefDirect");
            PFN_alGetSource3fDirect = _lookup.findOrThrow("alGetSource3fDirect");
            PFN_alGetSourcefvDirect = _lookup.findOrThrow("alGetSourcefvDirect");
            PFN_alGetSourceiDirect = _lookup.findOrThrow("alGetSourceiDirect");
            PFN_alGetSource3iDirect = _lookup.findOrThrow("alGetSource3iDirect");
            PFN_alGetSourceivDirect = _lookup.findOrThrow("alGetSourceivDirect");
            PFN_alSourcePlayDirect = _lookup.findOrThrow("alSourcePlayDirect");
            PFN_alSourceStopDirect = _lookup.findOrThrow("alSourceStopDirect");
            PFN_alSourceRewindDirect = _lookup.findOrThrow("alSourceRewindDirect");
            PFN_alSourcePauseDirect = _lookup.findOrThrow("alSourcePauseDirect");
            PFN_alSourcePlayvDirect = _lookup.findOrThrow("alSourcePlayvDirect");
            PFN_alSourceStopvDirect = _lookup.findOrThrow("alSourceStopvDirect");
            PFN_alSourceRewindvDirect = _lookup.findOrThrow("alSourceRewindvDirect");
            PFN_alSourcePausevDirect = _lookup.findOrThrow("alSourcePausevDirect");
            PFN_alSourceQueueBuffersDirect = _lookup.findOrThrow("alSourceQueueBuffersDirect");
            PFN_alSourceUnqueueBuffersDirect = _lookup.findOrThrow("alSourceUnqueueBuffersDirect");
            PFN_alGenBuffersDirect = _lookup.findOrThrow("alGenBuffersDirect");
            PFN_alDeleteBuffersDirect = _lookup.findOrThrow("alDeleteBuffersDirect");
            PFN_alIsBufferDirect = _lookup.findOrThrow("alIsBufferDirect");
            PFN_alBufferDataDirect = _lookup.findOrThrow("alBufferDataDirect");
            PFN_alBufferfDirect = _lookup.findOrThrow("alBufferfDirect");
            PFN_alBuffer3fDirect = _lookup.findOrThrow("alBuffer3fDirect");
            PFN_alBufferfvDirect = _lookup.findOrThrow("alBufferfvDirect");
            PFN_alBufferiDirect = _lookup.findOrThrow("alBufferiDirect");
            PFN_alBuffer3iDirect = _lookup.findOrThrow("alBuffer3iDirect");
            PFN_alBufferivDirect = _lookup.findOrThrow("alBufferivDirect");
            PFN_alGetBufferfDirect = _lookup.findOrThrow("alGetBufferfDirect");
            PFN_alGetBuffer3fDirect = _lookup.findOrThrow("alGetBuffer3fDirect");
            PFN_alGetBufferfvDirect = _lookup.findOrThrow("alGetBufferfvDirect");
            PFN_alGetBufferiDirect = _lookup.findOrThrow("alGetBufferiDirect");
            PFN_alGetBuffer3iDirect = _lookup.findOrThrow("alGetBuffer3iDirect");
            PFN_alGetBufferivDirect = _lookup.findOrThrow("alGetBufferivDirect");
            PFN_alGenEffectsDirect = _lookup.findOrThrow("alGenEffectsDirect");
            PFN_alDeleteEffectsDirect = _lookup.findOrThrow("alDeleteEffectsDirect");
            PFN_alIsEffectDirect = _lookup.findOrThrow("alIsEffectDirect");
            PFN_alEffectiDirect = _lookup.findOrThrow("alEffectiDirect");
            PFN_alEffectivDirect = _lookup.findOrThrow("alEffectivDirect");
            PFN_alEffectfDirect = _lookup.findOrThrow("alEffectfDirect");
            PFN_alEffectfvDirect = _lookup.findOrThrow("alEffectfvDirect");
            PFN_alGetEffectiDirect = _lookup.findOrThrow("alGetEffectiDirect");
            PFN_alGetEffectivDirect = _lookup.findOrThrow("alGetEffectivDirect");
            PFN_alGetEffectfDirect = _lookup.findOrThrow("alGetEffectfDirect");
            PFN_alGetEffectfvDirect = _lookup.findOrThrow("alGetEffectfvDirect");
            PFN_alGenFiltersDirect = _lookup.findOrThrow("alGenFiltersDirect");
            PFN_alDeleteFiltersDirect = _lookup.findOrThrow("alDeleteFiltersDirect");
            PFN_alIsFilterDirect = _lookup.findOrThrow("alIsFilterDirect");
            PFN_alFilteriDirect = _lookup.findOrThrow("alFilteriDirect");
            PFN_alFilterivDirect = _lookup.findOrThrow("alFilterivDirect");
            PFN_alFilterfDirect = _lookup.findOrThrow("alFilterfDirect");
            PFN_alFilterfvDirect = _lookup.findOrThrow("alFilterfvDirect");
            PFN_alGetFilteriDirect = _lookup.findOrThrow("alGetFilteriDirect");
            PFN_alGetFilterivDirect = _lookup.findOrThrow("alGetFilterivDirect");
            PFN_alGetFilterfDirect = _lookup.findOrThrow("alGetFilterfDirect");
            PFN_alGetFilterfvDirect = _lookup.findOrThrow("alGetFilterfvDirect");
            PFN_alGenAuxiliaryEffectSlotsDirect = _lookup.findOrThrow("alGenAuxiliaryEffectSlotsDirect");
            PFN_alDeleteAuxiliaryEffectSlotsDirect = _lookup.findOrThrow("alDeleteAuxiliaryEffectSlotsDirect");
            PFN_alIsAuxiliaryEffectSlotDirect = _lookup.findOrThrow("alIsAuxiliaryEffectSlotDirect");
            PFN_alAuxiliaryEffectSlotiDirect = _lookup.findOrThrow("alAuxiliaryEffectSlotiDirect");
            PFN_alAuxiliaryEffectSlotivDirect = _lookup.findOrThrow("alAuxiliaryEffectSlotivDirect");
            PFN_alAuxiliaryEffectSlotfDirect = _lookup.findOrThrow("alAuxiliaryEffectSlotfDirect");
            PFN_alAuxiliaryEffectSlotfvDirect = _lookup.findOrThrow("alAuxiliaryEffectSlotfvDirect");
            PFN_alGetAuxiliaryEffectSlotiDirect = _lookup.findOrThrow("alGetAuxiliaryEffectSlotiDirect");
            PFN_alGetAuxiliaryEffectSlotivDirect = _lookup.findOrThrow("alGetAuxiliaryEffectSlotivDirect");
            PFN_alGetAuxiliaryEffectSlotfDirect = _lookup.findOrThrow("alGetAuxiliaryEffectSlotfDirect");
            PFN_alGetAuxiliaryEffectSlotfvDirect = _lookup.findOrThrow("alGetAuxiliaryEffectSlotfvDirect");
            PFN_alBufferDataStaticDirect = _lookup.findOrThrow("alBufferDataStaticDirect");
            PFN_alDebugMessageCallbackDirectEXT = _lookup.findOrThrow("alDebugMessageCallbackDirectEXT");
            PFN_alDebugMessageInsertDirectEXT = _lookup.findOrThrow("alDebugMessageInsertDirectEXT");
            PFN_alDebugMessageControlDirectEXT = _lookup.findOrThrow("alDebugMessageControlDirectEXT");
            PFN_alPushDebugGroupDirectEXT = _lookup.findOrThrow("alPushDebugGroupDirectEXT");
            PFN_alPopDebugGroupDirectEXT = _lookup.findOrThrow("alPopDebugGroupDirectEXT");
            PFN_alGetDebugMessageLogDirectEXT = _lookup.findOrThrow("alGetDebugMessageLogDirectEXT");
            PFN_alObjectLabelDirectEXT = _lookup.findOrThrow("alObjectLabelDirectEXT");
            PFN_alGetObjectLabelDirectEXT = _lookup.findOrThrow("alGetObjectLabelDirectEXT");
            PFN_alGetPointerDirectEXT = _lookup.findOrThrow("alGetPointerDirectEXT");
            PFN_alGetPointervDirectEXT = _lookup.findOrThrow("alGetPointervDirectEXT");
            PFN_alRequestFoldbackStartDirect = _lookup.findOrThrow("alRequestFoldbackStartDirect");
            PFN_alRequestFoldbackStopDirect = _lookup.findOrThrow("alRequestFoldbackStopDirect");
            PFN_alBufferSubDataDirectSOFT = _lookup.findOrThrow("alBufferSubDataDirectSOFT");
            PFN_alSourcedDirectSOFT = _lookup.findOrThrow("alSourcedDirectSOFT");
            PFN_alSource3dDirectSOFT = _lookup.findOrThrow("alSource3dDirectSOFT");
            PFN_alSourcedvDirectSOFT = _lookup.findOrThrow("alSourcedvDirectSOFT");
            PFN_alGetSourcedDirectSOFT = _lookup.findOrThrow("alGetSourcedDirectSOFT");
            PFN_alGetSource3dDirectSOFT = _lookup.findOrThrow("alGetSource3dDirectSOFT");
            PFN_alGetSourcedvDirectSOFT = _lookup.findOrThrow("alGetSourcedvDirectSOFT");
            PFN_alSourcei64DirectSOFT = _lookup.findOrThrow("alSourcei64DirectSOFT");
            PFN_alSource3i64DirectSOFT = _lookup.findOrThrow("alSource3i64DirectSOFT");
            PFN_alSourcei64vDirectSOFT = _lookup.findOrThrow("alSourcei64vDirectSOFT");
            PFN_alGetSourcei64DirectSOFT = _lookup.findOrThrow("alGetSourcei64DirectSOFT");
            PFN_alGetSource3i64DirectSOFT = _lookup.findOrThrow("alGetSource3i64DirectSOFT");
            PFN_alGetSourcei64vDirectSOFT = _lookup.findOrThrow("alGetSourcei64vDirectSOFT");
            PFN_alDeferUpdatesDirectSOFT = _lookup.findOrThrow("alDeferUpdatesDirectSOFT");
            PFN_alProcessUpdatesDirectSOFT = _lookup.findOrThrow("alProcessUpdatesDirectSOFT");
            PFN_alGetStringiDirectSOFT = _lookup.findOrThrow("alGetStringiDirectSOFT");
            PFN_alEventControlDirectSOFT = _lookup.findOrThrow("alEventControlDirectSOFT");
            PFN_alEventCallbackDirectSOFT = _lookup.findOrThrow("alEventCallbackDirectSOFT");
            PFN_alGetPointerDirectSOFT = _lookup.findOrThrow("alGetPointerDirectSOFT");
            PFN_alGetPointervDirectSOFT = _lookup.findOrThrow("alGetPointervDirectSOFT");
            PFN_alBufferCallbackDirectSOFT = _lookup.findOrThrow("alBufferCallbackDirectSOFT");
            PFN_alGetBufferPtrDirectSOFT = _lookup.findOrThrow("alGetBufferPtrDirectSOFT");
            PFN_alGetBuffer3PtrDirectSOFT = _lookup.findOrThrow("alGetBuffer3PtrDirectSOFT");
            PFN_alGetBufferPtrvDirectSOFT = _lookup.findOrThrow("alGetBufferPtrvDirectSOFT");
            PFN_alSourcePlayAtTimeDirectSOFT = _lookup.findOrThrow("alSourcePlayAtTimeDirectSOFT");
            PFN_alSourcePlayAtTimevDirectSOFT = _lookup.findOrThrow("alSourcePlayAtTimevDirectSOFT");
            PFN_EAXSetDirect = _lookup.findOrThrow("EAXSetDirect");
            PFN_EAXGetDirect = _lookup.findOrThrow("EAXGetDirect");
            PFN_EAXSetBufferModeDirect = _lookup.findOrThrow("EAXSetBufferModeDirect");
            PFN_EAXGetBufferModeDirect = _lookup.findOrThrow("EAXGetBufferModeDirect");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `alBufferDataStatic`.
    /// ```
    /// void alBufferDataStatic((unsigned int) ALuint buffer, (int) ALenum format, ALvoid* data, (int) ALsizei size, (int) ALsizei freq);
    /// ```
    public static void alBufferDataStatic(int buffer, int format, @NonNull MemorySegment data, int size, int freq) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferDataStatic", buffer, format, data, size, freq); }
        Handles.MH_alBufferDataStatic.invokeExact(Handles.get().PFN_alBufferDataStatic, buffer, format, data, size, freq); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferDataStatic", e); }
    }

    /// Invokes `alGenEffects`.
    /// ```
    /// void alGenEffects((int) ALsizei n, ALuint* effects);
    /// ```
    public static void alGenEffects(int n, @NonNull MemorySegment effects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenEffects", n, effects); }
        Handles.MH_alGenEffects.invokeExact(Handles.get().PFN_alGenEffects, n, effects); }
        catch (Throwable e) { throw new RuntimeException("error in alGenEffects", e); }
    }

    /// Invokes `alDeleteEffects`.
    /// ```
    /// void alDeleteEffects((int) ALsizei n, const ALuint* effects);
    /// ```
    public static void alDeleteEffects(int n, @NonNull MemorySegment effects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteEffects", n, effects); }
        Handles.MH_alDeleteEffects.invokeExact(Handles.get().PFN_alDeleteEffects, n, effects); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteEffects", e); }
    }

    /// Invokes `alIsEffect`.
    /// ```
    /// ALboolean alIsEffect((unsigned int) ALuint effect);
    /// ```
    public static boolean alIsEffect(int effect) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsEffect", effect); }
        return (((byte) Handles.MH_alIsEffect.invokeExact(Handles.get().PFN_alIsEffect, effect)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsEffect", e); }
    }

    /// Invokes `alEffecti`.
    /// ```
    /// void alEffecti((unsigned int) ALuint effect, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alEffecti(int effect, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffecti", effect, param, iValue); }
        Handles.MH_alEffecti.invokeExact(Handles.get().PFN_alEffecti, effect, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alEffecti", e); }
    }

    /// Invokes `alEffectiv`.
    /// ```
    /// void alEffectiv((unsigned int) ALuint effect, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alEffectiv(int effect, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectiv", effect, param, piValues); }
        Handles.MH_alEffectiv.invokeExact(Handles.get().PFN_alEffectiv, effect, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectiv", e); }
    }

    /// Invokes `alEffectf`.
    /// ```
    /// void alEffectf((unsigned int) ALuint effect, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alEffectf(int effect, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectf", effect, param, flValue); }
        Handles.MH_alEffectf.invokeExact(Handles.get().PFN_alEffectf, effect, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectf", e); }
    }

    /// Invokes `alEffectfv`.
    /// ```
    /// void alEffectfv((unsigned int) ALuint effect, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alEffectfv(int effect, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectfv", effect, param, pflValues); }
        Handles.MH_alEffectfv.invokeExact(Handles.get().PFN_alEffectfv, effect, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectfv", e); }
    }

    /// Invokes `alGetEffecti`.
    /// ```
    /// void alGetEffecti((unsigned int) ALuint effect, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetEffecti(int effect, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffecti", effect, param, piValue); }
        Handles.MH_alGetEffecti.invokeExact(Handles.get().PFN_alGetEffecti, effect, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffecti", e); }
    }

    /// Invokes `alGetEffectiv`.
    /// ```
    /// void alGetEffectiv((unsigned int) ALuint effect, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetEffectiv(int effect, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectiv", effect, param, piValues); }
        Handles.MH_alGetEffectiv.invokeExact(Handles.get().PFN_alGetEffectiv, effect, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectiv", e); }
    }

    /// Invokes `alGetEffectf`.
    /// ```
    /// void alGetEffectf((unsigned int) ALuint effect, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetEffectf(int effect, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectf", effect, param, pflValue); }
        Handles.MH_alGetEffectf.invokeExact(Handles.get().PFN_alGetEffectf, effect, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectf", e); }
    }

    /// Invokes `alGetEffectfv`.
    /// ```
    /// void alGetEffectfv((unsigned int) ALuint effect, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetEffectfv(int effect, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectfv", effect, param, pflValues); }
        Handles.MH_alGetEffectfv.invokeExact(Handles.get().PFN_alGetEffectfv, effect, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectfv", e); }
    }

    /// Invokes `alGenFilters`.
    /// ```
    /// void alGenFilters((int) ALsizei n, ALuint* filters);
    /// ```
    public static void alGenFilters(int n, @NonNull MemorySegment filters) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenFilters", n, filters); }
        Handles.MH_alGenFilters.invokeExact(Handles.get().PFN_alGenFilters, n, filters); }
        catch (Throwable e) { throw new RuntimeException("error in alGenFilters", e); }
    }

    /// Invokes `alDeleteFilters`.
    /// ```
    /// void alDeleteFilters((int) ALsizei n, const ALuint* filters);
    /// ```
    public static void alDeleteFilters(int n, @NonNull MemorySegment filters) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteFilters", n, filters); }
        Handles.MH_alDeleteFilters.invokeExact(Handles.get().PFN_alDeleteFilters, n, filters); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteFilters", e); }
    }

    /// Invokes `alIsFilter`.
    /// ```
    /// ALboolean alIsFilter((unsigned int) ALuint filter);
    /// ```
    public static boolean alIsFilter(int filter) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsFilter", filter); }
        return (((byte) Handles.MH_alIsFilter.invokeExact(Handles.get().PFN_alIsFilter, filter)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsFilter", e); }
    }

    /// Invokes `alFilteri`.
    /// ```
    /// void alFilteri((unsigned int) ALuint filter, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alFilteri(int filter, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilteri", filter, param, iValue); }
        Handles.MH_alFilteri.invokeExact(Handles.get().PFN_alFilteri, filter, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alFilteri", e); }
    }

    /// Invokes `alFilteriv`.
    /// ```
    /// void alFilteriv((unsigned int) ALuint filter, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alFilteriv(int filter, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilteriv", filter, param, piValues); }
        Handles.MH_alFilteriv.invokeExact(Handles.get().PFN_alFilteriv, filter, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alFilteriv", e); }
    }

    /// Invokes `alFilterf`.
    /// ```
    /// void alFilterf((unsigned int) ALuint filter, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alFilterf(int filter, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilterf", filter, param, flValue); }
        Handles.MH_alFilterf.invokeExact(Handles.get().PFN_alFilterf, filter, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alFilterf", e); }
    }

    /// Invokes `alFilterfv`.
    /// ```
    /// void alFilterfv((unsigned int) ALuint filter, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alFilterfv(int filter, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilterfv", filter, param, pflValues); }
        Handles.MH_alFilterfv.invokeExact(Handles.get().PFN_alFilterfv, filter, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alFilterfv", e); }
    }

    /// Invokes `alGetFilteri`.
    /// ```
    /// void alGetFilteri((unsigned int) ALuint filter, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetFilteri(int filter, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilteri", filter, param, piValue); }
        Handles.MH_alGetFilteri.invokeExact(Handles.get().PFN_alGetFilteri, filter, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilteri", e); }
    }

    /// Invokes `alGetFilteriv`.
    /// ```
    /// void alGetFilteriv((unsigned int) ALuint filter, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetFilteriv(int filter, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilteriv", filter, param, piValues); }
        Handles.MH_alGetFilteriv.invokeExact(Handles.get().PFN_alGetFilteriv, filter, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilteriv", e); }
    }

    /// Invokes `alGetFilterf`.
    /// ```
    /// void alGetFilterf((unsigned int) ALuint filter, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetFilterf(int filter, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilterf", filter, param, pflValue); }
        Handles.MH_alGetFilterf.invokeExact(Handles.get().PFN_alGetFilterf, filter, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilterf", e); }
    }

    /// Invokes `alGetFilterfv`.
    /// ```
    /// void alGetFilterfv((unsigned int) ALuint filter, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetFilterfv(int filter, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilterfv", filter, param, pflValues); }
        Handles.MH_alGetFilterfv.invokeExact(Handles.get().PFN_alGetFilterfv, filter, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilterfv", e); }
    }

    /// Invokes `alGenAuxiliaryEffectSlots`.
    /// ```
    /// void alGenAuxiliaryEffectSlots((int) ALsizei n, ALuint* effectslots);
    /// ```
    public static void alGenAuxiliaryEffectSlots(int n, @NonNull MemorySegment effectslots) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenAuxiliaryEffectSlots", n, effectslots); }
        Handles.MH_alGenAuxiliaryEffectSlots.invokeExact(Handles.get().PFN_alGenAuxiliaryEffectSlots, n, effectslots); }
        catch (Throwable e) { throw new RuntimeException("error in alGenAuxiliaryEffectSlots", e); }
    }

    /// Invokes `alDeleteAuxiliaryEffectSlots`.
    /// ```
    /// void alDeleteAuxiliaryEffectSlots((int) ALsizei n, const ALuint* effectslots);
    /// ```
    public static void alDeleteAuxiliaryEffectSlots(int n, @NonNull MemorySegment effectslots) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteAuxiliaryEffectSlots", n, effectslots); }
        Handles.MH_alDeleteAuxiliaryEffectSlots.invokeExact(Handles.get().PFN_alDeleteAuxiliaryEffectSlots, n, effectslots); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteAuxiliaryEffectSlots", e); }
    }

    /// Invokes `alIsAuxiliaryEffectSlot`.
    /// ```
    /// ALboolean alIsAuxiliaryEffectSlot((unsigned int) ALuint effectslot);
    /// ```
    public static boolean alIsAuxiliaryEffectSlot(int effectslot) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsAuxiliaryEffectSlot", effectslot); }
        return (((byte) Handles.MH_alIsAuxiliaryEffectSlot.invokeExact(Handles.get().PFN_alIsAuxiliaryEffectSlot, effectslot)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsAuxiliaryEffectSlot", e); }
    }

    /// Invokes `alAuxiliaryEffectSloti`.
    /// ```
    /// void alAuxiliaryEffectSloti((unsigned int) ALuint effectslot, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alAuxiliaryEffectSloti(int effectslot, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSloti", effectslot, param, iValue); }
        Handles.MH_alAuxiliaryEffectSloti.invokeExact(Handles.get().PFN_alAuxiliaryEffectSloti, effectslot, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSloti", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotiv`.
    /// ```
    /// void alAuxiliaryEffectSlotiv((unsigned int) ALuint effectslot, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alAuxiliaryEffectSlotiv(int effectslot, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotiv", effectslot, param, piValues); }
        Handles.MH_alAuxiliaryEffectSlotiv.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotiv, effectslot, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotiv", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotf`.
    /// ```
    /// void alAuxiliaryEffectSlotf((unsigned int) ALuint effectslot, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alAuxiliaryEffectSlotf(int effectslot, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotf", effectslot, param, flValue); }
        Handles.MH_alAuxiliaryEffectSlotf.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotf, effectslot, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotf", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotfv`.
    /// ```
    /// void alAuxiliaryEffectSlotfv((unsigned int) ALuint effectslot, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alAuxiliaryEffectSlotfv(int effectslot, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotfv", effectslot, param, pflValues); }
        Handles.MH_alAuxiliaryEffectSlotfv.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotfv, effectslot, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfv", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSloti`.
    /// ```
    /// void alGetAuxiliaryEffectSloti((unsigned int) ALuint effectslot, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetAuxiliaryEffectSloti(int effectslot, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSloti", effectslot, param, piValue); }
        Handles.MH_alGetAuxiliaryEffectSloti.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSloti, effectslot, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSloti", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotiv`.
    /// ```
    /// void alGetAuxiliaryEffectSlotiv((unsigned int) ALuint effectslot, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetAuxiliaryEffectSlotiv(int effectslot, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotiv", effectslot, param, piValues); }
        Handles.MH_alGetAuxiliaryEffectSlotiv.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotiv, effectslot, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotiv", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotf`.
    /// ```
    /// void alGetAuxiliaryEffectSlotf((unsigned int) ALuint effectslot, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetAuxiliaryEffectSlotf(int effectslot, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotf", effectslot, param, pflValue); }
        Handles.MH_alGetAuxiliaryEffectSlotf.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotf, effectslot, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotf", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotfv`.
    /// ```
    /// void alGetAuxiliaryEffectSlotfv((unsigned int) ALuint effectslot, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetAuxiliaryEffectSlotfv(int effectslot, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotfv", effectslot, param, pflValues); }
        Handles.MH_alGetAuxiliaryEffectSlotfv.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotfv, effectslot, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfv", e); }
    }

    /// Invokes `alcSetThreadContext`.
    /// ```
    /// ALCboolean alcSetThreadContext(ALCcontext* context);
    /// ```
    public static boolean alcSetThreadContext(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcSetThreadContext", context); }
        return (((byte) Handles.MH_alcSetThreadContext.invokeExact(Handles.get().PFN_alcSetThreadContext, context)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcSetThreadContext", e); }
    }

    /// Invokes `alcGetThreadContext`.
    /// ```
    /// ALCcontext* alcGetThreadContext();
    /// ```
    public static @NonNull MemorySegment alcGetThreadContext() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetThreadContext"); }
        return (MemorySegment) Handles.MH_alcGetThreadContext.invokeExact(Handles.get().PFN_alcGetThreadContext); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetThreadContext", e); }
    }

    /// Invokes `alBufferSubDataSOFT`.
    /// ```
    /// void alBufferSubDataSOFT((unsigned int) ALuint buffer, (int) ALenum format, const ALvoid* data, (int) ALsizei offset, (int) ALsizei length);
    /// ```
    public static void alBufferSubDataSOFT(int buffer, int format, @NonNull MemorySegment data, int offset, int length) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferSubDataSOFT", buffer, format, data, offset, length); }
        Handles.MH_alBufferSubDataSOFT.invokeExact(Handles.get().PFN_alBufferSubDataSOFT, buffer, format, data, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferSubDataSOFT", e); }
    }

    /// Invokes `alRequestFoldbackStart`.
    /// ```
    /// void alRequestFoldbackStart((int) ALenum mode, (int) ALsizei count, (int) ALsizei length, ALfloat* mem, (void (*ALFoldbackCallback)((int) ALenum event, (int) ALsizei blockIndex)) LPALFOLDBACKCALLBACK callback);
    /// ```
    public static void alRequestFoldbackStart(int mode, int count, int length, @NonNull MemorySegment mem, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alRequestFoldbackStart", mode, count, length, mem, callback); }
        Handles.MH_alRequestFoldbackStart.invokeExact(Handles.get().PFN_alRequestFoldbackStart, mode, count, length, mem, callback); }
        catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStart", e); }
    }

    /// Invokes `alRequestFoldbackStop`.
    /// ```
    /// void alRequestFoldbackStop();
    /// ```
    public static void alRequestFoldbackStop() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alRequestFoldbackStop"); }
        Handles.MH_alRequestFoldbackStop.invokeExact(Handles.get().PFN_alRequestFoldbackStop); }
        catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStop", e); }
    }

    /// Invokes `alBufferSamplesSOFT`.
    /// ```
    /// void alBufferSamplesSOFT((unsigned int) ALuint buffer, (unsigned int) ALuint samplerate, (int) ALenum internalformat, (int) ALsizei samples, (int) ALenum channels, (int) ALenum type, const ALvoid* data);
    /// ```
    public static void alBufferSamplesSOFT(int buffer, int samplerate, int internalformat, int samples, int channels, int type, @NonNull MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferSamplesSOFT", buffer, samplerate, internalformat, samples, channels, type, data); }
        Handles.MH_alBufferSamplesSOFT.invokeExact(Handles.get().PFN_alBufferSamplesSOFT, buffer, samplerate, internalformat, samples, channels, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferSamplesSOFT", e); }
    }

    /// Invokes `alBufferSubSamplesSOFT`.
    /// ```
    /// void alBufferSubSamplesSOFT((unsigned int) ALuint buffer, (int) ALsizei offset, (int) ALsizei samples, (int) ALenum channels, (int) ALenum type, const ALvoid* data);
    /// ```
    public static void alBufferSubSamplesSOFT(int buffer, int offset, int samples, int channels, int type, @NonNull MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferSubSamplesSOFT", buffer, offset, samples, channels, type, data); }
        Handles.MH_alBufferSubSamplesSOFT.invokeExact(Handles.get().PFN_alBufferSubSamplesSOFT, buffer, offset, samples, channels, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferSubSamplesSOFT", e); }
    }

    /// Invokes `alGetBufferSamplesSOFT`.
    /// ```
    /// void alGetBufferSamplesSOFT((unsigned int) ALuint buffer, (int) ALsizei offset, (int) ALsizei samples, (int) ALenum channels, (int) ALenum type, ALvoid* data);
    /// ```
    public static void alGetBufferSamplesSOFT(int buffer, int offset, int samples, int channels, int type, @NonNull MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferSamplesSOFT", buffer, offset, samples, channels, type, data); }
        Handles.MH_alGetBufferSamplesSOFT.invokeExact(Handles.get().PFN_alGetBufferSamplesSOFT, buffer, offset, samples, channels, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferSamplesSOFT", e); }
    }

    /// Invokes `alIsBufferFormatSupportedSOFT`.
    /// ```
    /// ALboolean alIsBufferFormatSupportedSOFT((int) ALenum format);
    /// ```
    public static boolean alIsBufferFormatSupportedSOFT(int format) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsBufferFormatSupportedSOFT", format); }
        return (((byte) Handles.MH_alIsBufferFormatSupportedSOFT.invokeExact(Handles.get().PFN_alIsBufferFormatSupportedSOFT, format)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsBufferFormatSupportedSOFT", e); }
    }

    /// Invokes `alcLoopbackOpenDeviceSOFT`.
    /// ```
    /// ALCdevice* alcLoopbackOpenDeviceSOFT(const ALCchar* deviceName);
    /// ```
    public static @NonNull MemorySegment alcLoopbackOpenDeviceSOFT(@NonNull MemorySegment deviceName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcLoopbackOpenDeviceSOFT", deviceName); }
        return (MemorySegment) Handles.MH_alcLoopbackOpenDeviceSOFT.invokeExact(Handles.get().PFN_alcLoopbackOpenDeviceSOFT, deviceName); }
        catch (Throwable e) { throw new RuntimeException("error in alcLoopbackOpenDeviceSOFT", e); }
    }

    /// Invokes `alcIsRenderFormatSupportedSOFT`.
    /// ```
    /// ALCboolean alcIsRenderFormatSupportedSOFT(ALCdevice* device, (int) ALCsizei freq, (int) ALCenum channels, (int) ALCenum type);
    /// ```
    public static boolean alcIsRenderFormatSupportedSOFT(@NonNull MemorySegment device, int freq, int channels, int type) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcIsRenderFormatSupportedSOFT", device, freq, channels, type); }
        return (((byte) Handles.MH_alcIsRenderFormatSupportedSOFT.invokeExact(Handles.get().PFN_alcIsRenderFormatSupportedSOFT, device, freq, channels, type)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcIsRenderFormatSupportedSOFT", e); }
    }

    /// Invokes `alcRenderSamplesSOFT`.
    /// ```
    /// void alcRenderSamplesSOFT(ALCdevice* device, ALCvoid* buffer, (int) ALCsizei samples);
    /// ```
    public static void alcRenderSamplesSOFT(@NonNull MemorySegment device, @NonNull MemorySegment buffer, int samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcRenderSamplesSOFT", device, buffer, samples); }
        Handles.MH_alcRenderSamplesSOFT.invokeExact(Handles.get().PFN_alcRenderSamplesSOFT, device, buffer, samples); }
        catch (Throwable e) { throw new RuntimeException("error in alcRenderSamplesSOFT", e); }
    }

    /// Invokes `alSourcedSOFT`.
    /// ```
    /// void alSourcedSOFT((unsigned int) ALuint source, (int) ALenum param, (double) ALdouble value);
    /// ```
    public static void alSourcedSOFT(int source, int param, double value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcedSOFT", source, param, value); }
        Handles.MH_alSourcedSOFT.invokeExact(Handles.get().PFN_alSourcedSOFT, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcedSOFT", e); }
    }

    /// Invokes `alSource3dSOFT`.
    /// ```
    /// void alSource3dSOFT((unsigned int) ALuint source, (int) ALenum param, (double) ALdouble value1, (double) ALdouble value2, (double) ALdouble value3);
    /// ```
    public static void alSource3dSOFT(int source, int param, double value1, double value2, double value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3dSOFT", source, param, value1, value2, value3); }
        Handles.MH_alSource3dSOFT.invokeExact(Handles.get().PFN_alSource3dSOFT, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3dSOFT", e); }
    }

    /// Invokes `alSourcedvSOFT`.
    /// ```
    /// void alSourcedvSOFT((unsigned int) ALuint source, (int) ALenum param, const ALdouble* values);
    /// ```
    public static void alSourcedvSOFT(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcedvSOFT", source, param, values); }
        Handles.MH_alSourcedvSOFT.invokeExact(Handles.get().PFN_alSourcedvSOFT, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcedvSOFT", e); }
    }

    /// Invokes `alGetSourcedSOFT`.
    /// ```
    /// void alGetSourcedSOFT((unsigned int) ALuint source, (int) ALenum param, ALdouble* value);
    /// ```
    public static void alGetSourcedSOFT(int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcedSOFT", source, param, value); }
        Handles.MH_alGetSourcedSOFT.invokeExact(Handles.get().PFN_alGetSourcedSOFT, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcedSOFT", e); }
    }

    /// Invokes `alGetSource3dSOFT`.
    /// ```
    /// void alGetSource3dSOFT((unsigned int) ALuint source, (int) ALenum param, ALdouble* value1, ALdouble* value2, ALdouble* value3);
    /// ```
    public static void alGetSource3dSOFT(int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3dSOFT", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3dSOFT.invokeExact(Handles.get().PFN_alGetSource3dSOFT, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3dSOFT", e); }
    }

    /// Invokes `alGetSourcedvSOFT`.
    /// ```
    /// void alGetSourcedvSOFT((unsigned int) ALuint source, (int) ALenum param, ALdouble* values);
    /// ```
    public static void alGetSourcedvSOFT(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcedvSOFT", source, param, values); }
        Handles.MH_alGetSourcedvSOFT.invokeExact(Handles.get().PFN_alGetSourcedvSOFT, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvSOFT", e); }
    }

    /// Invokes `alSourcei64SOFT`.
    /// ```
    /// void alSourcei64SOFT((unsigned int) ALuint source, (int) ALenum param, ((int64_t) _alsoft_int64_t) ALint64SOFT value);
    /// ```
    public static void alSourcei64SOFT(int source, int param, long value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei64SOFT", source, param, value); }
        Handles.MH_alSourcei64SOFT.invokeExact(Handles.get().PFN_alSourcei64SOFT, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei64SOFT", e); }
    }

    /// Invokes `alSource3i64SOFT`.
    /// ```
    /// void alSource3i64SOFT((unsigned int) ALuint source, (int) ALenum param, ((int64_t) _alsoft_int64_t) ALint64SOFT value1, ((int64_t) _alsoft_int64_t) ALint64SOFT value2, ((int64_t) _alsoft_int64_t) ALint64SOFT value3);
    /// ```
    public static void alSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3i64SOFT", source, param, value1, value2, value3); }
        Handles.MH_alSource3i64SOFT.invokeExact(Handles.get().PFN_alSource3i64SOFT, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3i64SOFT", e); }
    }

    /// Invokes `alSourcei64vSOFT`.
    /// ```
    /// void alSourcei64vSOFT((unsigned int) ALuint source, (int) ALenum param, const ALint64SOFT* values);
    /// ```
    public static void alSourcei64vSOFT(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei64vSOFT", source, param, values); }
        Handles.MH_alSourcei64vSOFT.invokeExact(Handles.get().PFN_alSourcei64vSOFT, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei64vSOFT", e); }
    }

    /// Invokes `alGetSourcei64SOFT`.
    /// ```
    /// void alGetSourcei64SOFT((unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* value);
    /// ```
    public static void alGetSourcei64SOFT(int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei64SOFT", source, param, value); }
        Handles.MH_alGetSourcei64SOFT.invokeExact(Handles.get().PFN_alGetSourcei64SOFT, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64SOFT", e); }
    }

    /// Invokes `alGetSource3i64SOFT`.
    /// ```
    /// void alGetSource3i64SOFT((unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* value1, ALint64SOFT* value2, ALint64SOFT* value3);
    /// ```
    public static void alGetSource3i64SOFT(int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3i64SOFT", source, param, value1, value2, value3); }
        Handles.MH_alGetSource3i64SOFT.invokeExact(Handles.get().PFN_alGetSource3i64SOFT, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64SOFT", e); }
    }

    /// Invokes `alGetSourcei64vSOFT`.
    /// ```
    /// void alGetSourcei64vSOFT((unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* values);
    /// ```
    public static void alGetSourcei64vSOFT(int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei64vSOFT", source, param, values); }
        Handles.MH_alGetSourcei64vSOFT.invokeExact(Handles.get().PFN_alGetSourcei64vSOFT, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vSOFT", e); }
    }

    /// Invokes `alDeferUpdatesSOFT`.
    /// ```
    /// void alDeferUpdatesSOFT();
    /// ```
    public static void alDeferUpdatesSOFT() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeferUpdatesSOFT"); }
        Handles.MH_alDeferUpdatesSOFT.invokeExact(Handles.get().PFN_alDeferUpdatesSOFT); }
        catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesSOFT", e); }
    }

    /// Invokes `alProcessUpdatesSOFT`.
    /// ```
    /// void alProcessUpdatesSOFT();
    /// ```
    public static void alProcessUpdatesSOFT() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alProcessUpdatesSOFT"); }
        Handles.MH_alProcessUpdatesSOFT.invokeExact(Handles.get().PFN_alProcessUpdatesSOFT); }
        catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesSOFT", e); }
    }

    /// Invokes `alcDevicePauseSOFT`.
    /// ```
    /// void alcDevicePauseSOFT(ALCdevice* device);
    /// ```
    public static void alcDevicePauseSOFT(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcDevicePauseSOFT", device); }
        Handles.MH_alcDevicePauseSOFT.invokeExact(Handles.get().PFN_alcDevicePauseSOFT, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcDevicePauseSOFT", e); }
    }

    /// Invokes `alcDeviceResumeSOFT`.
    /// ```
    /// void alcDeviceResumeSOFT(ALCdevice* device);
    /// ```
    public static void alcDeviceResumeSOFT(@NonNull MemorySegment device) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcDeviceResumeSOFT", device); }
        Handles.MH_alcDeviceResumeSOFT.invokeExact(Handles.get().PFN_alcDeviceResumeSOFT, device); }
        catch (Throwable e) { throw new RuntimeException("error in alcDeviceResumeSOFT", e); }
    }

    /// Invokes `alcGetStringiSOFT`.
    /// ```
    /// const ALCchar* alcGetStringiSOFT(ALCdevice* device, (int) ALCenum paramName, (int) ALCsizei index);
    /// ```
    public static @NonNull MemorySegment alcGetStringiSOFT(@NonNull MemorySegment device, int paramName, int index) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetStringiSOFT", device, paramName, index); }
        return (MemorySegment) Handles.MH_alcGetStringiSOFT.invokeExact(Handles.get().PFN_alcGetStringiSOFT, device, paramName, index); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetStringiSOFT", e); }
    }

    /// Invokes `alcResetDeviceSOFT`.
    /// ```
    /// ALCboolean alcResetDeviceSOFT(ALCdevice* device, const ALCint* attribs);
    /// ```
    public static boolean alcResetDeviceSOFT(@NonNull MemorySegment device, @NonNull MemorySegment attribs) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcResetDeviceSOFT", device, attribs); }
        return (((byte) Handles.MH_alcResetDeviceSOFT.invokeExact(Handles.get().PFN_alcResetDeviceSOFT, device, attribs)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcResetDeviceSOFT", e); }
    }

    /// Invokes `alGetStringiSOFT`.
    /// ```
    /// const ALchar* alGetStringiSOFT((int) ALenum pname, (int) ALsizei index);
    /// ```
    public static @NonNull MemorySegment alGetStringiSOFT(int pname, int index) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetStringiSOFT", pname, index); }
        return (MemorySegment) Handles.MH_alGetStringiSOFT.invokeExact(Handles.get().PFN_alGetStringiSOFT, pname, index); }
        catch (Throwable e) { throw new RuntimeException("error in alGetStringiSOFT", e); }
    }

    /// Invokes `alcGetInteger64vSOFT`.
    /// ```
    /// void alcGetInteger64vSOFT(ALCdevice* device, (int) ALCenum pname, (int) ALsizei size, ALCint64SOFT* values);
    /// ```
    public static void alcGetInteger64vSOFT(@NonNull MemorySegment device, int pname, int size, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetInteger64vSOFT", device, pname, size, values); }
        Handles.MH_alcGetInteger64vSOFT.invokeExact(Handles.get().PFN_alcGetInteger64vSOFT, device, pname, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetInteger64vSOFT", e); }
    }

    /// Invokes `alEventControlSOFT`.
    /// ```
    /// void alEventControlSOFT((int) ALsizei count, const ALenum* types, ALboolean enable);
    /// ```
    public static void alEventControlSOFT(int count, @NonNull MemorySegment types, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEventControlSOFT", count, types, enable); }
        Handles.MH_alEventControlSOFT.invokeExact(Handles.get().PFN_alEventControlSOFT, count, types, ((enable) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in alEventControlSOFT", e); }
    }

    /// Invokes `alEventCallbackSOFT`.
    /// ```
    /// void alEventCallbackSOFT((void (*ALEventProcSOFT)((int) ALenum eventType, (unsigned int) ALuint object, (unsigned int) ALuint param, (int) ALsizei length, const ALchar* message, void* userParam)) ALEVENTPROCSOFT callback, void* userParam);
    /// ```
    public static void alEventCallbackSOFT(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEventCallbackSOFT", callback, userParam); }
        Handles.MH_alEventCallbackSOFT.invokeExact(Handles.get().PFN_alEventCallbackSOFT, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in alEventCallbackSOFT", e); }
    }

    /// Invokes `alGetPointerSOFT`.
    /// ```
    /// void* alGetPointerSOFT((int) ALenum pname);
    /// ```
    public static @NonNull MemorySegment alGetPointerSOFT(int pname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointerSOFT", pname); }
        return (MemorySegment) Handles.MH_alGetPointerSOFT.invokeExact(Handles.get().PFN_alGetPointerSOFT, pname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointerSOFT", e); }
    }

    /// Invokes `alGetPointervSOFT`.
    /// ```
    /// void alGetPointervSOFT((int) ALenum pname, void** values);
    /// ```
    public static void alGetPointervSOFT(int pname, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointervSOFT", pname, values); }
        Handles.MH_alGetPointervSOFT.invokeExact(Handles.get().PFN_alGetPointervSOFT, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointervSOFT", e); }
    }

    /// Invokes `alcReopenDeviceSOFT`.
    /// ```
    /// ALCboolean alcReopenDeviceSOFT(ALCdevice* device, const ALCchar* deviceName, const ALCint* attribs);
    /// ```
    public static boolean alcReopenDeviceSOFT(@NonNull MemorySegment device, @NonNull MemorySegment deviceName, @NonNull MemorySegment attribs) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcReopenDeviceSOFT", device, deviceName, attribs); }
        return (((byte) Handles.MH_alcReopenDeviceSOFT.invokeExact(Handles.get().PFN_alcReopenDeviceSOFT, device, deviceName, attribs)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcReopenDeviceSOFT", e); }
    }

    /// Invokes `alBufferCallbackSOFT`.
    /// ```
    /// void alBufferCallbackSOFT((unsigned int) ALuint buffer, (int) ALenum format, (int) ALsizei freq, ((int) ALsizei (*ALBufferCallbackTypeSOFT)(ALvoid* userptr, ALvoid* sampledata, (int) ALsizei numbytes)) ALBUFFERCALLBACKTYPESOFT callback, ALvoid* userptr);
    /// ```
    public static void alBufferCallbackSOFT(int buffer, int format, int freq, @NonNull MemorySegment callback, @NonNull MemorySegment userptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferCallbackSOFT", buffer, format, freq, callback, userptr); }
        Handles.MH_alBufferCallbackSOFT.invokeExact(Handles.get().PFN_alBufferCallbackSOFT, buffer, format, freq, callback, userptr); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackSOFT", e); }
    }

    /// Invokes `alGetBufferPtrSOFT`.
    /// ```
    /// void alGetBufferPtrSOFT((unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr);
    /// ```
    public static void alGetBufferPtrSOFT(int buffer, int param, @NonNull MemorySegment ptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferPtrSOFT", buffer, param, ptr); }
        Handles.MH_alGetBufferPtrSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrSOFT, buffer, param, ptr); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrSOFT", e); }
    }

    /// Invokes `alGetBuffer3PtrSOFT`.
    /// ```
    /// void alGetBuffer3PtrSOFT((unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr0, ALvoid** ptr1, ALvoid** ptr2);
    /// ```
    public static void alGetBuffer3PtrSOFT(int buffer, int param, @NonNull MemorySegment ptr0, @NonNull MemorySegment ptr1, @NonNull MemorySegment ptr2) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3PtrSOFT", buffer, param, ptr0, ptr1, ptr2); }
        Handles.MH_alGetBuffer3PtrSOFT.invokeExact(Handles.get().PFN_alGetBuffer3PtrSOFT, buffer, param, ptr0, ptr1, ptr2); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrSOFT", e); }
    }

    /// Invokes `alGetBufferPtrvSOFT`.
    /// ```
    /// void alGetBufferPtrvSOFT((unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr);
    /// ```
    public static void alGetBufferPtrvSOFT(int buffer, int param, @NonNull MemorySegment ptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferPtrvSOFT", buffer, param, ptr); }
        Handles.MH_alGetBufferPtrvSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrvSOFT, buffer, param, ptr); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvSOFT", e); }
    }

    /// Invokes `alSourcePlayAtTimeSOFT`.
    /// ```
    /// void alSourcePlayAtTimeSOFT((unsigned int) ALuint source, ((int64_t) _alsoft_int64_t) ALint64SOFT start_time);
    /// ```
    public static void alSourcePlayAtTimeSOFT(int source, long start_time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayAtTimeSOFT", source, start_time); }
        Handles.MH_alSourcePlayAtTimeSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimeSOFT, source, start_time); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeSOFT", e); }
    }

    /// Invokes `alSourcePlayAtTimevSOFT`.
    /// ```
    /// void alSourcePlayAtTimevSOFT((int) ALsizei n, const ALuint* sources, ((int64_t) _alsoft_int64_t) ALint64SOFT start_time);
    /// ```
    public static void alSourcePlayAtTimevSOFT(int n, @NonNull MemorySegment sources, long start_time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayAtTimevSOFT", n, sources, start_time); }
        Handles.MH_alSourcePlayAtTimevSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimevSOFT, n, sources, start_time); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevSOFT", e); }
    }

    /// Invokes `alDebugMessageCallbackEXT`.
    /// ```
    /// void alDebugMessageCallbackEXT((void (*ALDebugProcEXT)((int) ALenum source, (int) ALenum type, (unsigned int) ALuint id, (int) ALenum severity, (int) ALsizei length, const ALchar* message, void* userParam)) ALDEBUGPROCEXT callback, void* userParam);
    /// ```
    public static void alDebugMessageCallbackEXT(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageCallbackEXT", callback, userParam); }
        Handles.MH_alDebugMessageCallbackEXT.invokeExact(Handles.get().PFN_alDebugMessageCallbackEXT, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackEXT", e); }
    }

    /// Invokes `alDebugMessageInsertEXT`.
    /// ```
    /// void alDebugMessageInsertEXT((int) ALenum source, (int) ALenum type, (unsigned int) ALuint id, (int) ALenum severity, (int) ALsizei length, const ALchar* message);
    /// ```
    public static void alDebugMessageInsertEXT(int source, int type, int id, int severity, int length, @NonNull MemorySegment message) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageInsertEXT", source, type, id, severity, length, message); }
        Handles.MH_alDebugMessageInsertEXT.invokeExact(Handles.get().PFN_alDebugMessageInsertEXT, source, type, id, severity, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertEXT", e); }
    }

    /// Invokes `alDebugMessageControlEXT`.
    /// ```
    /// void alDebugMessageControlEXT((int) ALenum source, (int) ALenum type, (int) ALenum severity, (int) ALsizei count, const ALuint* ids, ALboolean enable);
    /// ```
    public static void alDebugMessageControlEXT(int source, int type, int severity, int count, @NonNull MemorySegment ids, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageControlEXT", source, type, severity, count, ids, enable); }
        Handles.MH_alDebugMessageControlEXT.invokeExact(Handles.get().PFN_alDebugMessageControlEXT, source, type, severity, count, ids, ((enable) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlEXT", e); }
    }

    /// Invokes `alPushDebugGroupEXT`.
    /// ```
    /// void alPushDebugGroupEXT((int) ALenum source, (unsigned int) ALuint id, (int) ALsizei length, const ALchar* message);
    /// ```
    public static void alPushDebugGroupEXT(int source, int id, int length, @NonNull MemorySegment message) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alPushDebugGroupEXT", source, id, length, message); }
        Handles.MH_alPushDebugGroupEXT.invokeExact(Handles.get().PFN_alPushDebugGroupEXT, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupEXT", e); }
    }

    /// Invokes `alPopDebugGroupEXT`.
    /// ```
    /// void alPopDebugGroupEXT();
    /// ```
    public static void alPopDebugGroupEXT() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alPopDebugGroupEXT"); }
        Handles.MH_alPopDebugGroupEXT.invokeExact(Handles.get().PFN_alPopDebugGroupEXT); }
        catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupEXT", e); }
    }

    /// Invokes `alGetDebugMessageLogEXT`.
    /// ```
    /// (unsigned int) ALuint alGetDebugMessageLogEXT((unsigned int) ALuint count, (int) ALsizei logBufSize, ALenum* sources, ALenum* types, ALuint* ids, ALenum* severities, ALsizei* lengths, ALchar* logBuf);
    /// ```
    public static int alGetDebugMessageLogEXT(int count, int logBufSize, @NonNull MemorySegment sources, @NonNull MemorySegment types, @NonNull MemorySegment ids, @NonNull MemorySegment severities, @NonNull MemorySegment lengths, @NonNull MemorySegment logBuf) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDebugMessageLogEXT", count, logBufSize, sources, types, ids, severities, lengths, logBuf); }
        return (int) Handles.MH_alGetDebugMessageLogEXT.invokeExact(Handles.get().PFN_alGetDebugMessageLogEXT, count, logBufSize, sources, types, ids, severities, lengths, logBuf); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogEXT", e); }
    }

    /// Invokes `alObjectLabelEXT`.
    /// ```
    /// void alObjectLabelEXT((int) ALenum identifier, (unsigned int) ALuint name, (int) ALsizei length, const ALchar* label);
    /// ```
    public static void alObjectLabelEXT(int identifier, int name, int length, @NonNull MemorySegment label) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alObjectLabelEXT", identifier, name, length, label); }
        Handles.MH_alObjectLabelEXT.invokeExact(Handles.get().PFN_alObjectLabelEXT, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in alObjectLabelEXT", e); }
    }

    /// Invokes `alGetObjectLabelEXT`.
    /// ```
    /// void alGetObjectLabelEXT((int) ALenum identifier, (unsigned int) ALuint name, (int) ALsizei bufSize, ALsizei* length, ALchar* label);
    /// ```
    public static void alGetObjectLabelEXT(int identifier, int name, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetObjectLabelEXT", identifier, name, bufSize, length, label); }
        Handles.MH_alGetObjectLabelEXT.invokeExact(Handles.get().PFN_alGetObjectLabelEXT, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelEXT", e); }
    }

    /// Invokes `alGetPointerEXT`.
    /// ```
    /// void* alGetPointerEXT((int) ALenum pname);
    /// ```
    public static @NonNull MemorySegment alGetPointerEXT(int pname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointerEXT", pname); }
        return (MemorySegment) Handles.MH_alGetPointerEXT.invokeExact(Handles.get().PFN_alGetPointerEXT, pname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointerEXT", e); }
    }

    /// Invokes `alGetPointervEXT`.
    /// ```
    /// void alGetPointervEXT((int) ALenum pname, void** values);
    /// ```
    public static void alGetPointervEXT(int pname, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointervEXT", pname, values); }
        Handles.MH_alGetPointervEXT.invokeExact(Handles.get().PFN_alGetPointervEXT, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointervEXT", e); }
    }

    /// Invokes `alcEventIsSupportedSOFT`.
    /// ```
    /// (int) ALCenum alcEventIsSupportedSOFT((int) ALCenum eventType, (int) ALCenum deviceType);
    /// ```
    public static int alcEventIsSupportedSOFT(int eventType, int deviceType) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcEventIsSupportedSOFT", eventType, deviceType); }
        return (int) Handles.MH_alcEventIsSupportedSOFT.invokeExact(Handles.get().PFN_alcEventIsSupportedSOFT, eventType, deviceType); }
        catch (Throwable e) { throw new RuntimeException("error in alcEventIsSupportedSOFT", e); }
    }

    /// Invokes `alcEventControlSOFT`.
    /// ```
    /// ALCboolean alcEventControlSOFT((int) ALCsizei count, const ALCenum* events, ALCboolean enable);
    /// ```
    public static boolean alcEventControlSOFT(int count, @NonNull MemorySegment events, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcEventControlSOFT", count, events, enable); }
        return (((byte) Handles.MH_alcEventControlSOFT.invokeExact(Handles.get().PFN_alcEventControlSOFT, count, events, ((enable) ? (byte)1 : (byte)0))) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alcEventControlSOFT", e); }
    }

    /// Invokes `alcEventCallbackSOFT`.
    /// ```
    /// void alcEventCallbackSOFT((void (*ALCEventProcTypeSOFT)((int) ALCenum eventType, (int) ALCenum deviceType, ALCdevice* device, (int) ALCsizei length, const ALCchar* message, void* userParam)) ALCEVENTPROCTYPESOFT callback, void* userParam);
    /// ```
    public static void alcEventCallbackSOFT(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcEventCallbackSOFT", callback, userParam); }
        Handles.MH_alcEventCallbackSOFT.invokeExact(Handles.get().PFN_alcEventCallbackSOFT, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in alcEventCallbackSOFT", e); }
    }

    /// Invokes `alcGetProcAddress2`.
    /// ```
    /// ALCvoid* alcGetProcAddress2(ALCdevice* device, const ALCchar* funcName);
    /// ```
    public static @NonNull MemorySegment alcGetProcAddress2(@NonNull MemorySegment device, @NonNull MemorySegment funcName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alcGetProcAddress2", device, funcName); }
        return (MemorySegment) Handles.MH_alcGetProcAddress2.invokeExact(Handles.get().PFN_alcGetProcAddress2, device, funcName); }
        catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress2", e); }
    }

    /// Invokes `alEnableDirect`.
    /// ```
    /// void alEnableDirect(ALCcontext* context, (int) ALenum capability);
    /// ```
    public static void alEnableDirect(@NonNull MemorySegment context, int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEnableDirect", context, capability); }
        Handles.MH_alEnableDirect.invokeExact(Handles.get().PFN_alEnableDirect, context, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alEnableDirect", e); }
    }

    /// Invokes `alDisableDirect`.
    /// ```
    /// void alDisableDirect(ALCcontext* context, (int) ALenum capability);
    /// ```
    public static void alDisableDirect(@NonNull MemorySegment context, int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDisableDirect", context, capability); }
        Handles.MH_alDisableDirect.invokeExact(Handles.get().PFN_alDisableDirect, context, capability); }
        catch (Throwable e) { throw new RuntimeException("error in alDisableDirect", e); }
    }

    /// Invokes `alIsEnabledDirect`.
    /// ```
    /// ALboolean alIsEnabledDirect(ALCcontext* context, (int) ALenum capability);
    /// ```
    public static boolean alIsEnabledDirect(@NonNull MemorySegment context, int capability) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsEnabledDirect", context, capability); }
        return (((byte) Handles.MH_alIsEnabledDirect.invokeExact(Handles.get().PFN_alIsEnabledDirect, context, capability)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsEnabledDirect", e); }
    }

    /// Invokes `alDopplerFactorDirect`.
    /// ```
    /// void alDopplerFactorDirect(ALCcontext* context, (float) ALfloat value);
    /// ```
    public static void alDopplerFactorDirect(@NonNull MemorySegment context, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDopplerFactorDirect", context, value); }
        Handles.MH_alDopplerFactorDirect.invokeExact(Handles.get().PFN_alDopplerFactorDirect, context, value); }
        catch (Throwable e) { throw new RuntimeException("error in alDopplerFactorDirect", e); }
    }

    /// Invokes `alSpeedOfSoundDirect`.
    /// ```
    /// void alSpeedOfSoundDirect(ALCcontext* context, (float) ALfloat value);
    /// ```
    public static void alSpeedOfSoundDirect(@NonNull MemorySegment context, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSpeedOfSoundDirect", context, value); }
        Handles.MH_alSpeedOfSoundDirect.invokeExact(Handles.get().PFN_alSpeedOfSoundDirect, context, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSoundDirect", e); }
    }

    /// Invokes `alDistanceModelDirect`.
    /// ```
    /// void alDistanceModelDirect(ALCcontext* context, (int) ALenum distanceModel);
    /// ```
    public static void alDistanceModelDirect(@NonNull MemorySegment context, int distanceModel) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDistanceModelDirect", context, distanceModel); }
        Handles.MH_alDistanceModelDirect.invokeExact(Handles.get().PFN_alDistanceModelDirect, context, distanceModel); }
        catch (Throwable e) { throw new RuntimeException("error in alDistanceModelDirect", e); }
    }

    /// Invokes `alGetStringDirect`.
    /// ```
    /// const ALchar* alGetStringDirect(ALCcontext* context, (int) ALenum param);
    /// ```
    public static @NonNull MemorySegment alGetStringDirect(@NonNull MemorySegment context, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetStringDirect", context, param); }
        return (MemorySegment) Handles.MH_alGetStringDirect.invokeExact(Handles.get().PFN_alGetStringDirect, context, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetStringDirect", e); }
    }

    /// Invokes `alGetBooleanvDirect`.
    /// ```
    /// void alGetBooleanvDirect(ALCcontext* context, (int) ALenum param, ALboolean* values);
    /// ```
    public static void alGetBooleanvDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBooleanvDirect", context, param, values); }
        Handles.MH_alGetBooleanvDirect.invokeExact(Handles.get().PFN_alGetBooleanvDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBooleanvDirect", e); }
    }

    /// Invokes `alGetIntegervDirect`.
    /// ```
    /// void alGetIntegervDirect(ALCcontext* context, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetIntegervDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetIntegervDirect", context, param, values); }
        Handles.MH_alGetIntegervDirect.invokeExact(Handles.get().PFN_alGetIntegervDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetIntegervDirect", e); }
    }

    /// Invokes `alGetFloatvDirect`.
    /// ```
    /// void alGetFloatvDirect(ALCcontext* context, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetFloatvDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloatvDirect", context, param, values); }
        Handles.MH_alGetFloatvDirect.invokeExact(Handles.get().PFN_alGetFloatvDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloatvDirect", e); }
    }

    /// Invokes `alGetDoublevDirect`.
    /// ```
    /// void alGetDoublevDirect(ALCcontext* context, (int) ALenum param, ALdouble* values);
    /// ```
    public static void alGetDoublevDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDoublevDirect", context, param, values); }
        Handles.MH_alGetDoublevDirect.invokeExact(Handles.get().PFN_alGetDoublevDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDoublevDirect", e); }
    }

    /// Invokes `alGetBooleanDirect`.
    /// ```
    /// ALboolean alGetBooleanDirect(ALCcontext* context, (int) ALenum param);
    /// ```
    public static boolean alGetBooleanDirect(@NonNull MemorySegment context, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBooleanDirect", context, param); }
        return (((byte) Handles.MH_alGetBooleanDirect.invokeExact(Handles.get().PFN_alGetBooleanDirect, context, param)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBooleanDirect", e); }
    }

    /// Invokes `alGetIntegerDirect`.
    /// ```
    /// (int) ALint alGetIntegerDirect(ALCcontext* context, (int) ALenum param);
    /// ```
    public static int alGetIntegerDirect(@NonNull MemorySegment context, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetIntegerDirect", context, param); }
        return (int) Handles.MH_alGetIntegerDirect.invokeExact(Handles.get().PFN_alGetIntegerDirect, context, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetIntegerDirect", e); }
    }

    /// Invokes `alGetFloatDirect`.
    /// ```
    /// (float) ALfloat alGetFloatDirect(ALCcontext* context, (int) ALenum param);
    /// ```
    public static float alGetFloatDirect(@NonNull MemorySegment context, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFloatDirect", context, param); }
        return (float) Handles.MH_alGetFloatDirect.invokeExact(Handles.get().PFN_alGetFloatDirect, context, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFloatDirect", e); }
    }

    /// Invokes `alGetDoubleDirect`.
    /// ```
    /// (double) ALdouble alGetDoubleDirect(ALCcontext* context, (int) ALenum param);
    /// ```
    public static double alGetDoubleDirect(@NonNull MemorySegment context, int param) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDoubleDirect", context, param); }
        return (double) Handles.MH_alGetDoubleDirect.invokeExact(Handles.get().PFN_alGetDoubleDirect, context, param); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDoubleDirect", e); }
    }

    /// Invokes `alGetErrorDirect`.
    /// ```
    /// (int) ALenum alGetErrorDirect(ALCcontext* context);
    /// ```
    public static int alGetErrorDirect(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetErrorDirect", context); }
        return (int) Handles.MH_alGetErrorDirect.invokeExact(Handles.get().PFN_alGetErrorDirect, context); }
        catch (Throwable e) { throw new RuntimeException("error in alGetErrorDirect", e); }
    }

    /// Invokes `alIsExtensionPresentDirect`.
    /// ```
    /// ALboolean alIsExtensionPresentDirect(ALCcontext* context, const ALchar* extname);
    /// ```
    public static boolean alIsExtensionPresentDirect(@NonNull MemorySegment context, @NonNull MemorySegment extname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsExtensionPresentDirect", context, extname); }
        return (((byte) Handles.MH_alIsExtensionPresentDirect.invokeExact(Handles.get().PFN_alIsExtensionPresentDirect, context, extname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresentDirect", e); }
    }

    /// Invokes `alGetProcAddressDirect`.
    /// ```
    /// void* alGetProcAddressDirect(ALCcontext* context, const ALchar* fname);
    /// ```
    public static @NonNull MemorySegment alGetProcAddressDirect(@NonNull MemorySegment context, @NonNull MemorySegment fname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetProcAddressDirect", context, fname); }
        return (MemorySegment) Handles.MH_alGetProcAddressDirect.invokeExact(Handles.get().PFN_alGetProcAddressDirect, context, fname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetProcAddressDirect", e); }
    }

    /// Invokes `alGetEnumValueDirect`.
    /// ```
    /// (int) ALenum alGetEnumValueDirect(ALCcontext* context, const ALchar* ename);
    /// ```
    public static int alGetEnumValueDirect(@NonNull MemorySegment context, @NonNull MemorySegment ename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEnumValueDirect", context, ename); }
        return (int) Handles.MH_alGetEnumValueDirect.invokeExact(Handles.get().PFN_alGetEnumValueDirect, context, ename); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEnumValueDirect", e); }
    }

    /// Invokes `alListenerfDirect`.
    /// ```
    /// void alListenerfDirect(ALCcontext* context, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alListenerfDirect(@NonNull MemorySegment context, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerfDirect", context, param, value); }
        Handles.MH_alListenerfDirect.invokeExact(Handles.get().PFN_alListenerfDirect, context, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerfDirect", e); }
    }

    /// Invokes `alListener3fDirect`.
    /// ```
    /// void alListener3fDirect(ALCcontext* context, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alListener3fDirect(@NonNull MemorySegment context, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3fDirect", context, param, value1, value2, value3); }
        Handles.MH_alListener3fDirect.invokeExact(Handles.get().PFN_alListener3fDirect, context, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3fDirect", e); }
    }

    /// Invokes `alListenerfvDirect`.
    /// ```
    /// void alListenerfvDirect(ALCcontext* context, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alListenerfvDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerfvDirect", context, param, values); }
        Handles.MH_alListenerfvDirect.invokeExact(Handles.get().PFN_alListenerfvDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerfvDirect", e); }
    }

    /// Invokes `alListeneriDirect`.
    /// ```
    /// void alListeneriDirect(ALCcontext* context, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alListeneriDirect(@NonNull MemorySegment context, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListeneriDirect", context, param, value); }
        Handles.MH_alListeneriDirect.invokeExact(Handles.get().PFN_alListeneriDirect, context, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alListeneriDirect", e); }
    }

    /// Invokes `alListener3iDirect`.
    /// ```
    /// void alListener3iDirect(ALCcontext* context, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alListener3iDirect(@NonNull MemorySegment context, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListener3iDirect", context, param, value1, value2, value3); }
        Handles.MH_alListener3iDirect.invokeExact(Handles.get().PFN_alListener3iDirect, context, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alListener3iDirect", e); }
    }

    /// Invokes `alListenerivDirect`.
    /// ```
    /// void alListenerivDirect(ALCcontext* context, (int) ALenum param, const ALint* values);
    /// ```
    public static void alListenerivDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alListenerivDirect", context, param, values); }
        Handles.MH_alListenerivDirect.invokeExact(Handles.get().PFN_alListenerivDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alListenerivDirect", e); }
    }

    /// Invokes `alGetListenerfDirect`.
    /// ```
    /// void alGetListenerfDirect(ALCcontext* context, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetListenerfDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerfDirect", context, param, value); }
        Handles.MH_alGetListenerfDirect.invokeExact(Handles.get().PFN_alGetListenerfDirect, context, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerfDirect", e); }
    }

    /// Invokes `alGetListener3fDirect`.
    /// ```
    /// void alGetListener3fDirect(ALCcontext* context, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetListener3fDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3fDirect", context, param, value1, value2, value3); }
        Handles.MH_alGetListener3fDirect.invokeExact(Handles.get().PFN_alGetListener3fDirect, context, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3fDirect", e); }
    }

    /// Invokes `alGetListenerfvDirect`.
    /// ```
    /// void alGetListenerfvDirect(ALCcontext* context, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetListenerfvDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerfvDirect", context, param, values); }
        Handles.MH_alGetListenerfvDirect.invokeExact(Handles.get().PFN_alGetListenerfvDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerfvDirect", e); }
    }

    /// Invokes `alGetListeneriDirect`.
    /// ```
    /// void alGetListeneriDirect(ALCcontext* context, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetListeneriDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListeneriDirect", context, param, value); }
        Handles.MH_alGetListeneriDirect.invokeExact(Handles.get().PFN_alGetListeneriDirect, context, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListeneriDirect", e); }
    }

    /// Invokes `alGetListener3iDirect`.
    /// ```
    /// void alGetListener3iDirect(ALCcontext* context, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetListener3iDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListener3iDirect", context, param, value1, value2, value3); }
        Handles.MH_alGetListener3iDirect.invokeExact(Handles.get().PFN_alGetListener3iDirect, context, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListener3iDirect", e); }
    }

    /// Invokes `alGetListenerivDirect`.
    /// ```
    /// void alGetListenerivDirect(ALCcontext* context, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetListenerivDirect(@NonNull MemorySegment context, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetListenerivDirect", context, param, values); }
        Handles.MH_alGetListenerivDirect.invokeExact(Handles.get().PFN_alGetListenerivDirect, context, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetListenerivDirect", e); }
    }

    /// Invokes `alGenSourcesDirect`.
    /// ```
    /// void alGenSourcesDirect(ALCcontext* context, (int) ALsizei n, ALuint* sources);
    /// ```
    public static void alGenSourcesDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenSourcesDirect", context, n, sources); }
        Handles.MH_alGenSourcesDirect.invokeExact(Handles.get().PFN_alGenSourcesDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alGenSourcesDirect", e); }
    }

    /// Invokes `alDeleteSourcesDirect`.
    /// ```
    /// void alDeleteSourcesDirect(ALCcontext* context, (int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alDeleteSourcesDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteSourcesDirect", context, n, sources); }
        Handles.MH_alDeleteSourcesDirect.invokeExact(Handles.get().PFN_alDeleteSourcesDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteSourcesDirect", e); }
    }

    /// Invokes `alIsSourceDirect`.
    /// ```
    /// ALboolean alIsSourceDirect(ALCcontext* context, (unsigned int) ALuint source);
    /// ```
    public static boolean alIsSourceDirect(@NonNull MemorySegment context, int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsSourceDirect", context, source); }
        return (((byte) Handles.MH_alIsSourceDirect.invokeExact(Handles.get().PFN_alIsSourceDirect, context, source)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsSourceDirect", e); }
    }

    /// Invokes `alSourcefDirect`.
    /// ```
    /// void alSourcefDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alSourcefDirect(@NonNull MemorySegment context, int source, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcefDirect", context, source, param, value); }
        Handles.MH_alSourcefDirect.invokeExact(Handles.get().PFN_alSourcefDirect, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcefDirect", e); }
    }

    /// Invokes `alSource3fDirect`.
    /// ```
    /// void alSource3fDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alSource3fDirect(@NonNull MemorySegment context, int source, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3fDirect", context, source, param, value1, value2, value3); }
        Handles.MH_alSource3fDirect.invokeExact(Handles.get().PFN_alSource3fDirect, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3fDirect", e); }
    }

    /// Invokes `alSourcefvDirect`.
    /// ```
    /// void alSourcefvDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alSourcefvDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcefvDirect", context, source, param, values); }
        Handles.MH_alSourcefvDirect.invokeExact(Handles.get().PFN_alSourcefvDirect, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcefvDirect", e); }
    }

    /// Invokes `alSourceiDirect`.
    /// ```
    /// void alSourceiDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alSourceiDirect(@NonNull MemorySegment context, int source, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceiDirect", context, source, param, value); }
        Handles.MH_alSourceiDirect.invokeExact(Handles.get().PFN_alSourceiDirect, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceiDirect", e); }
    }

    /// Invokes `alSource3iDirect`.
    /// ```
    /// void alSource3iDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alSource3iDirect(@NonNull MemorySegment context, int source, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3iDirect", context, source, param, value1, value2, value3); }
        Handles.MH_alSource3iDirect.invokeExact(Handles.get().PFN_alSource3iDirect, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3iDirect", e); }
    }

    /// Invokes `alSourceivDirect`.
    /// ```
    /// void alSourceivDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, const ALint* values);
    /// ```
    public static void alSourceivDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceivDirect", context, source, param, values); }
        Handles.MH_alSourceivDirect.invokeExact(Handles.get().PFN_alSourceivDirect, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceivDirect", e); }
    }

    /// Invokes `alGetSourcefDirect`.
    /// ```
    /// void alGetSourcefDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetSourcefDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcefDirect", context, source, param, value); }
        Handles.MH_alGetSourcefDirect.invokeExact(Handles.get().PFN_alGetSourcefDirect, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcefDirect", e); }
    }

    /// Invokes `alGetSource3fDirect`.
    /// ```
    /// void alGetSource3fDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetSource3fDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3fDirect", context, source, param, value1, value2, value3); }
        Handles.MH_alGetSource3fDirect.invokeExact(Handles.get().PFN_alGetSource3fDirect, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3fDirect", e); }
    }

    /// Invokes `alGetSourcefvDirect`.
    /// ```
    /// void alGetSourcefvDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetSourcefvDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcefvDirect", context, source, param, values); }
        Handles.MH_alGetSourcefvDirect.invokeExact(Handles.get().PFN_alGetSourcefvDirect, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcefvDirect", e); }
    }

    /// Invokes `alGetSourceiDirect`.
    /// ```
    /// void alGetSourceiDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetSourceiDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourceiDirect", context, source, param, value); }
        Handles.MH_alGetSourceiDirect.invokeExact(Handles.get().PFN_alGetSourceiDirect, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourceiDirect", e); }
    }

    /// Invokes `alGetSource3iDirect`.
    /// ```
    /// void alGetSource3iDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetSource3iDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3iDirect", context, source, param, value1, value2, value3); }
        Handles.MH_alGetSource3iDirect.invokeExact(Handles.get().PFN_alGetSource3iDirect, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3iDirect", e); }
    }

    /// Invokes `alGetSourceivDirect`.
    /// ```
    /// void alGetSourceivDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetSourceivDirect(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourceivDirect", context, source, param, values); }
        Handles.MH_alGetSourceivDirect.invokeExact(Handles.get().PFN_alGetSourceivDirect, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourceivDirect", e); }
    }

    /// Invokes `alSourcePlayDirect`.
    /// ```
    /// void alSourcePlayDirect(ALCcontext* context, (unsigned int) ALuint source);
    /// ```
    public static void alSourcePlayDirect(@NonNull MemorySegment context, int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayDirect", context, source); }
        Handles.MH_alSourcePlayDirect.invokeExact(Handles.get().PFN_alSourcePlayDirect, context, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayDirect", e); }
    }

    /// Invokes `alSourceStopDirect`.
    /// ```
    /// void alSourceStopDirect(ALCcontext* context, (unsigned int) ALuint source);
    /// ```
    public static void alSourceStopDirect(@NonNull MemorySegment context, int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStopDirect", context, source); }
        Handles.MH_alSourceStopDirect.invokeExact(Handles.get().PFN_alSourceStopDirect, context, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStopDirect", e); }
    }

    /// Invokes `alSourceRewindDirect`.
    /// ```
    /// void alSourceRewindDirect(ALCcontext* context, (unsigned int) ALuint source);
    /// ```
    public static void alSourceRewindDirect(@NonNull MemorySegment context, int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewindDirect", context, source); }
        Handles.MH_alSourceRewindDirect.invokeExact(Handles.get().PFN_alSourceRewindDirect, context, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewindDirect", e); }
    }

    /// Invokes `alSourcePauseDirect`.
    /// ```
    /// void alSourcePauseDirect(ALCcontext* context, (unsigned int) ALuint source);
    /// ```
    public static void alSourcePauseDirect(@NonNull MemorySegment context, int source) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePauseDirect", context, source); }
        Handles.MH_alSourcePauseDirect.invokeExact(Handles.get().PFN_alSourcePauseDirect, context, source); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePauseDirect", e); }
    }

    /// Invokes `alSourcePlayvDirect`.
    /// ```
    /// void alSourcePlayvDirect(ALCcontext* context, (int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePlayvDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayvDirect", context, n, sources); }
        Handles.MH_alSourcePlayvDirect.invokeExact(Handles.get().PFN_alSourcePlayvDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayvDirect", e); }
    }

    /// Invokes `alSourceStopvDirect`.
    /// ```
    /// void alSourceStopvDirect(ALCcontext* context, (int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceStopvDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceStopvDirect", context, n, sources); }
        Handles.MH_alSourceStopvDirect.invokeExact(Handles.get().PFN_alSourceStopvDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceStopvDirect", e); }
    }

    /// Invokes `alSourceRewindvDirect`.
    /// ```
    /// void alSourceRewindvDirect(ALCcontext* context, (int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourceRewindvDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceRewindvDirect", context, n, sources); }
        Handles.MH_alSourceRewindvDirect.invokeExact(Handles.get().PFN_alSourceRewindvDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceRewindvDirect", e); }
    }

    /// Invokes `alSourcePausevDirect`.
    /// ```
    /// void alSourcePausevDirect(ALCcontext* context, (int) ALsizei n, const ALuint* sources);
    /// ```
    public static void alSourcePausevDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePausevDirect", context, n, sources); }
        Handles.MH_alSourcePausevDirect.invokeExact(Handles.get().PFN_alSourcePausevDirect, context, n, sources); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePausevDirect", e); }
    }

    /// Invokes `alSourceQueueBuffersDirect`.
    /// ```
    /// void alSourceQueueBuffersDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALsizei nb, const ALuint* buffers);
    /// ```
    public static void alSourceQueueBuffersDirect(@NonNull MemorySegment context, int source, int nb, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceQueueBuffersDirect", context, source, nb, buffers); }
        Handles.MH_alSourceQueueBuffersDirect.invokeExact(Handles.get().PFN_alSourceQueueBuffersDirect, context, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffersDirect", e); }
    }

    /// Invokes `alSourceUnqueueBuffersDirect`.
    /// ```
    /// void alSourceUnqueueBuffersDirect(ALCcontext* context, (unsigned int) ALuint source, (int) ALsizei nb, ALuint* buffers);
    /// ```
    public static void alSourceUnqueueBuffersDirect(@NonNull MemorySegment context, int source, int nb, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourceUnqueueBuffersDirect", context, source, nb, buffers); }
        Handles.MH_alSourceUnqueueBuffersDirect.invokeExact(Handles.get().PFN_alSourceUnqueueBuffersDirect, context, source, nb, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffersDirect", e); }
    }

    /// Invokes `alGenBuffersDirect`.
    /// ```
    /// void alGenBuffersDirect(ALCcontext* context, (int) ALsizei n, ALuint* buffers);
    /// ```
    public static void alGenBuffersDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenBuffersDirect", context, n, buffers); }
        Handles.MH_alGenBuffersDirect.invokeExact(Handles.get().PFN_alGenBuffersDirect, context, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alGenBuffersDirect", e); }
    }

    /// Invokes `alDeleteBuffersDirect`.
    /// ```
    /// void alDeleteBuffersDirect(ALCcontext* context, (int) ALsizei n, const ALuint* buffers);
    /// ```
    public static void alDeleteBuffersDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment buffers) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteBuffersDirect", context, n, buffers); }
        Handles.MH_alDeleteBuffersDirect.invokeExact(Handles.get().PFN_alDeleteBuffersDirect, context, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffersDirect", e); }
    }

    /// Invokes `alIsBufferDirect`.
    /// ```
    /// ALboolean alIsBufferDirect(ALCcontext* context, (unsigned int) ALuint buffer);
    /// ```
    public static boolean alIsBufferDirect(@NonNull MemorySegment context, int buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsBufferDirect", context, buffer); }
        return (((byte) Handles.MH_alIsBufferDirect.invokeExact(Handles.get().PFN_alIsBufferDirect, context, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsBufferDirect", e); }
    }

    /// Invokes `alBufferDataDirect`.
    /// ```
    /// void alBufferDataDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum format, const ALvoid* data, (int) ALsizei size, (int) ALsizei samplerate);
    /// ```
    public static void alBufferDataDirect(@NonNull MemorySegment context, int buffer, int format, @NonNull MemorySegment data, int size, int samplerate) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferDataDirect", context, buffer, format, data, size, samplerate); }
        Handles.MH_alBufferDataDirect.invokeExact(Handles.get().PFN_alBufferDataDirect, context, buffer, format, data, size, samplerate); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferDataDirect", e); }
    }

    /// Invokes `alBufferfDirect`.
    /// ```
    /// void alBufferfDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value);
    /// ```
    public static void alBufferfDirect(@NonNull MemorySegment context, int buffer, int param, float value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferfDirect", context, buffer, param, value); }
        Handles.MH_alBufferfDirect.invokeExact(Handles.get().PFN_alBufferfDirect, context, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferfDirect", e); }
    }

    /// Invokes `alBuffer3fDirect`.
    /// ```
    /// void alBuffer3fDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, (float) ALfloat value1, (float) ALfloat value2, (float) ALfloat value3);
    /// ```
    public static void alBuffer3fDirect(@NonNull MemorySegment context, int buffer, int param, float value1, float value2, float value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3fDirect", context, buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3fDirect.invokeExact(Handles.get().PFN_alBuffer3fDirect, context, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3fDirect", e); }
    }

    /// Invokes `alBufferfvDirect`.
    /// ```
    /// void alBufferfvDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, const ALfloat* values);
    /// ```
    public static void alBufferfvDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferfvDirect", context, buffer, param, values); }
        Handles.MH_alBufferfvDirect.invokeExact(Handles.get().PFN_alBufferfvDirect, context, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferfvDirect", e); }
    }

    /// Invokes `alBufferiDirect`.
    /// ```
    /// void alBufferiDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value);
    /// ```
    public static void alBufferiDirect(@NonNull MemorySegment context, int buffer, int param, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferiDirect", context, buffer, param, value); }
        Handles.MH_alBufferiDirect.invokeExact(Handles.get().PFN_alBufferiDirect, context, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferiDirect", e); }
    }

    /// Invokes `alBuffer3iDirect`.
    /// ```
    /// void alBuffer3iDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, (int) ALint value1, (int) ALint value2, (int) ALint value3);
    /// ```
    public static void alBuffer3iDirect(@NonNull MemorySegment context, int buffer, int param, int value1, int value2, int value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBuffer3iDirect", context, buffer, param, value1, value2, value3); }
        Handles.MH_alBuffer3iDirect.invokeExact(Handles.get().PFN_alBuffer3iDirect, context, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alBuffer3iDirect", e); }
    }

    /// Invokes `alBufferivDirect`.
    /// ```
    /// void alBufferivDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, const ALint* values);
    /// ```
    public static void alBufferivDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferivDirect", context, buffer, param, values); }
        Handles.MH_alBufferivDirect.invokeExact(Handles.get().PFN_alBufferivDirect, context, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferivDirect", e); }
    }

    /// Invokes `alGetBufferfDirect`.
    /// ```
    /// void alGetBufferfDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value);
    /// ```
    public static void alGetBufferfDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferfDirect", context, buffer, param, value); }
        Handles.MH_alGetBufferfDirect.invokeExact(Handles.get().PFN_alGetBufferfDirect, context, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferfDirect", e); }
    }

    /// Invokes `alGetBuffer3fDirect`.
    /// ```
    /// void alGetBuffer3fDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetBuffer3fDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3fDirect", context, buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3fDirect.invokeExact(Handles.get().PFN_alGetBuffer3fDirect, context, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3fDirect", e); }
    }

    /// Invokes `alGetBufferfvDirect`.
    /// ```
    /// void alGetBufferfvDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALfloat* values);
    /// ```
    public static void alGetBufferfvDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferfvDirect", context, buffer, param, values); }
        Handles.MH_alGetBufferfvDirect.invokeExact(Handles.get().PFN_alGetBufferfvDirect, context, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferfvDirect", e); }
    }

    /// Invokes `alGetBufferiDirect`.
    /// ```
    /// void alGetBufferiDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALint* value);
    /// ```
    public static void alGetBufferiDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferiDirect", context, buffer, param, value); }
        Handles.MH_alGetBufferiDirect.invokeExact(Handles.get().PFN_alGetBufferiDirect, context, buffer, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferiDirect", e); }
    }

    /// Invokes `alGetBuffer3iDirect`.
    /// ```
    /// void alGetBuffer3iDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetBuffer3iDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3iDirect", context, buffer, param, value1, value2, value3); }
        Handles.MH_alGetBuffer3iDirect.invokeExact(Handles.get().PFN_alGetBuffer3iDirect, context, buffer, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3iDirect", e); }
    }

    /// Invokes `alGetBufferivDirect`.
    /// ```
    /// void alGetBufferivDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALint* values);
    /// ```
    public static void alGetBufferivDirect(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferivDirect", context, buffer, param, values); }
        Handles.MH_alGetBufferivDirect.invokeExact(Handles.get().PFN_alGetBufferivDirect, context, buffer, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferivDirect", e); }
    }

    /// Invokes `alGenEffectsDirect`.
    /// ```
    /// void alGenEffectsDirect(ALCcontext* context, (int) ALsizei n, ALuint* effects);
    /// ```
    public static void alGenEffectsDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment effects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenEffectsDirect", context, n, effects); }
        Handles.MH_alGenEffectsDirect.invokeExact(Handles.get().PFN_alGenEffectsDirect, context, n, effects); }
        catch (Throwable e) { throw new RuntimeException("error in alGenEffectsDirect", e); }
    }

    /// Invokes `alDeleteEffectsDirect`.
    /// ```
    /// void alDeleteEffectsDirect(ALCcontext* context, (int) ALsizei n, const ALuint* effects);
    /// ```
    public static void alDeleteEffectsDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment effects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteEffectsDirect", context, n, effects); }
        Handles.MH_alDeleteEffectsDirect.invokeExact(Handles.get().PFN_alDeleteEffectsDirect, context, n, effects); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteEffectsDirect", e); }
    }

    /// Invokes `alIsEffectDirect`.
    /// ```
    /// ALboolean alIsEffectDirect(ALCcontext* context, (unsigned int) ALuint effect);
    /// ```
    public static boolean alIsEffectDirect(@NonNull MemorySegment context, int effect) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsEffectDirect", context, effect); }
        return (((byte) Handles.MH_alIsEffectDirect.invokeExact(Handles.get().PFN_alIsEffectDirect, context, effect)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsEffectDirect", e); }
    }

    /// Invokes `alEffectiDirect`.
    /// ```
    /// void alEffectiDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alEffectiDirect(@NonNull MemorySegment context, int effect, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectiDirect", context, effect, param, iValue); }
        Handles.MH_alEffectiDirect.invokeExact(Handles.get().PFN_alEffectiDirect, context, effect, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectiDirect", e); }
    }

    /// Invokes `alEffectivDirect`.
    /// ```
    /// void alEffectivDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alEffectivDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectivDirect", context, effect, param, piValues); }
        Handles.MH_alEffectivDirect.invokeExact(Handles.get().PFN_alEffectivDirect, context, effect, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectivDirect", e); }
    }

    /// Invokes `alEffectfDirect`.
    /// ```
    /// void alEffectfDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alEffectfDirect(@NonNull MemorySegment context, int effect, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectfDirect", context, effect, param, flValue); }
        Handles.MH_alEffectfDirect.invokeExact(Handles.get().PFN_alEffectfDirect, context, effect, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectfDirect", e); }
    }

    /// Invokes `alEffectfvDirect`.
    /// ```
    /// void alEffectfvDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alEffectfvDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEffectfvDirect", context, effect, param, pflValues); }
        Handles.MH_alEffectfvDirect.invokeExact(Handles.get().PFN_alEffectfvDirect, context, effect, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alEffectfvDirect", e); }
    }

    /// Invokes `alGetEffectiDirect`.
    /// ```
    /// void alGetEffectiDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetEffectiDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectiDirect", context, effect, param, piValue); }
        Handles.MH_alGetEffectiDirect.invokeExact(Handles.get().PFN_alGetEffectiDirect, context, effect, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectiDirect", e); }
    }

    /// Invokes `alGetEffectivDirect`.
    /// ```
    /// void alGetEffectivDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetEffectivDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectivDirect", context, effect, param, piValues); }
        Handles.MH_alGetEffectivDirect.invokeExact(Handles.get().PFN_alGetEffectivDirect, context, effect, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectivDirect", e); }
    }

    /// Invokes `alGetEffectfDirect`.
    /// ```
    /// void alGetEffectfDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetEffectfDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectfDirect", context, effect, param, pflValue); }
        Handles.MH_alGetEffectfDirect.invokeExact(Handles.get().PFN_alGetEffectfDirect, context, effect, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectfDirect", e); }
    }

    /// Invokes `alGetEffectfvDirect`.
    /// ```
    /// void alGetEffectfvDirect(ALCcontext* context, (unsigned int) ALuint effect, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetEffectfvDirect(@NonNull MemorySegment context, int effect, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetEffectfvDirect", context, effect, param, pflValues); }
        Handles.MH_alGetEffectfvDirect.invokeExact(Handles.get().PFN_alGetEffectfvDirect, context, effect, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetEffectfvDirect", e); }
    }

    /// Invokes `alGenFiltersDirect`.
    /// ```
    /// void alGenFiltersDirect(ALCcontext* context, (int) ALsizei n, ALuint* filters);
    /// ```
    public static void alGenFiltersDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment filters) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenFiltersDirect", context, n, filters); }
        Handles.MH_alGenFiltersDirect.invokeExact(Handles.get().PFN_alGenFiltersDirect, context, n, filters); }
        catch (Throwable e) { throw new RuntimeException("error in alGenFiltersDirect", e); }
    }

    /// Invokes `alDeleteFiltersDirect`.
    /// ```
    /// void alDeleteFiltersDirect(ALCcontext* context, (int) ALsizei n, const ALuint* filters);
    /// ```
    public static void alDeleteFiltersDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment filters) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteFiltersDirect", context, n, filters); }
        Handles.MH_alDeleteFiltersDirect.invokeExact(Handles.get().PFN_alDeleteFiltersDirect, context, n, filters); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteFiltersDirect", e); }
    }

    /// Invokes `alIsFilterDirect`.
    /// ```
    /// ALboolean alIsFilterDirect(ALCcontext* context, (unsigned int) ALuint filter);
    /// ```
    public static boolean alIsFilterDirect(@NonNull MemorySegment context, int filter) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsFilterDirect", context, filter); }
        return (((byte) Handles.MH_alIsFilterDirect.invokeExact(Handles.get().PFN_alIsFilterDirect, context, filter)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsFilterDirect", e); }
    }

    /// Invokes `alFilteriDirect`.
    /// ```
    /// void alFilteriDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alFilteriDirect(@NonNull MemorySegment context, int filter, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilteriDirect", context, filter, param, iValue); }
        Handles.MH_alFilteriDirect.invokeExact(Handles.get().PFN_alFilteriDirect, context, filter, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alFilteriDirect", e); }
    }

    /// Invokes `alFilterivDirect`.
    /// ```
    /// void alFilterivDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alFilterivDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilterivDirect", context, filter, param, piValues); }
        Handles.MH_alFilterivDirect.invokeExact(Handles.get().PFN_alFilterivDirect, context, filter, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alFilterivDirect", e); }
    }

    /// Invokes `alFilterfDirect`.
    /// ```
    /// void alFilterfDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alFilterfDirect(@NonNull MemorySegment context, int filter, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilterfDirect", context, filter, param, flValue); }
        Handles.MH_alFilterfDirect.invokeExact(Handles.get().PFN_alFilterfDirect, context, filter, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alFilterfDirect", e); }
    }

    /// Invokes `alFilterfvDirect`.
    /// ```
    /// void alFilterfvDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alFilterfvDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alFilterfvDirect", context, filter, param, pflValues); }
        Handles.MH_alFilterfvDirect.invokeExact(Handles.get().PFN_alFilterfvDirect, context, filter, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alFilterfvDirect", e); }
    }

    /// Invokes `alGetFilteriDirect`.
    /// ```
    /// void alGetFilteriDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetFilteriDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilteriDirect", context, filter, param, piValue); }
        Handles.MH_alGetFilteriDirect.invokeExact(Handles.get().PFN_alGetFilteriDirect, context, filter, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilteriDirect", e); }
    }

    /// Invokes `alGetFilterivDirect`.
    /// ```
    /// void alGetFilterivDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetFilterivDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilterivDirect", context, filter, param, piValues); }
        Handles.MH_alGetFilterivDirect.invokeExact(Handles.get().PFN_alGetFilterivDirect, context, filter, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilterivDirect", e); }
    }

    /// Invokes `alGetFilterfDirect`.
    /// ```
    /// void alGetFilterfDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetFilterfDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilterfDirect", context, filter, param, pflValue); }
        Handles.MH_alGetFilterfDirect.invokeExact(Handles.get().PFN_alGetFilterfDirect, context, filter, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilterfDirect", e); }
    }

    /// Invokes `alGetFilterfvDirect`.
    /// ```
    /// void alGetFilterfvDirect(ALCcontext* context, (unsigned int) ALuint filter, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetFilterfvDirect(@NonNull MemorySegment context, int filter, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetFilterfvDirect", context, filter, param, pflValues); }
        Handles.MH_alGetFilterfvDirect.invokeExact(Handles.get().PFN_alGetFilterfvDirect, context, filter, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetFilterfvDirect", e); }
    }

    /// Invokes `alGenAuxiliaryEffectSlotsDirect`.
    /// ```
    /// void alGenAuxiliaryEffectSlotsDirect(ALCcontext* context, (int) ALsizei n, ALuint* effectslots);
    /// ```
    public static void alGenAuxiliaryEffectSlotsDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment effectslots) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGenAuxiliaryEffectSlotsDirect", context, n, effectslots); }
        Handles.MH_alGenAuxiliaryEffectSlotsDirect.invokeExact(Handles.get().PFN_alGenAuxiliaryEffectSlotsDirect, context, n, effectslots); }
        catch (Throwable e) { throw new RuntimeException("error in alGenAuxiliaryEffectSlotsDirect", e); }
    }

    /// Invokes `alDeleteAuxiliaryEffectSlotsDirect`.
    /// ```
    /// void alDeleteAuxiliaryEffectSlotsDirect(ALCcontext* context, (int) ALsizei n, const ALuint* effectslots);
    /// ```
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment effectslots) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeleteAuxiliaryEffectSlotsDirect", context, n, effectslots); }
        Handles.MH_alDeleteAuxiliaryEffectSlotsDirect.invokeExact(Handles.get().PFN_alDeleteAuxiliaryEffectSlotsDirect, context, n, effectslots); }
        catch (Throwable e) { throw new RuntimeException("error in alDeleteAuxiliaryEffectSlotsDirect", e); }
    }

    /// Invokes `alIsAuxiliaryEffectSlotDirect`.
    /// ```
    /// ALboolean alIsAuxiliaryEffectSlotDirect(ALCcontext* context, (unsigned int) ALuint effectslot);
    /// ```
    public static boolean alIsAuxiliaryEffectSlotDirect(@NonNull MemorySegment context, int effectslot) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alIsAuxiliaryEffectSlotDirect", context, effectslot); }
        return (((byte) Handles.MH_alIsAuxiliaryEffectSlotDirect.invokeExact(Handles.get().PFN_alIsAuxiliaryEffectSlotDirect, context, effectslot)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in alIsAuxiliaryEffectSlotDirect", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotiDirect`.
    /// ```
    /// void alAuxiliaryEffectSlotiDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, (int) ALint iValue);
    /// ```
    public static void alAuxiliaryEffectSlotiDirect(@NonNull MemorySegment context, int effectslot, int param, int iValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotiDirect", context, effectslot, param, iValue); }
        Handles.MH_alAuxiliaryEffectSlotiDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotiDirect, context, effectslot, param, iValue); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotiDirect", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotivDirect`.
    /// ```
    /// void alAuxiliaryEffectSlotivDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, const ALint* piValues);
    /// ```
    public static void alAuxiliaryEffectSlotivDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotivDirect", context, effectslot, param, piValues); }
        Handles.MH_alAuxiliaryEffectSlotivDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotivDirect, context, effectslot, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotivDirect", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotfDirect`.
    /// ```
    /// void alAuxiliaryEffectSlotfDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, (float) ALfloat flValue);
    /// ```
    public static void alAuxiliaryEffectSlotfDirect(@NonNull MemorySegment context, int effectslot, int param, float flValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotfDirect", context, effectslot, param, flValue); }
        Handles.MH_alAuxiliaryEffectSlotfDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotfDirect, context, effectslot, param, flValue); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfDirect", e); }
    }

    /// Invokes `alAuxiliaryEffectSlotfvDirect`.
    /// ```
    /// void alAuxiliaryEffectSlotfvDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, const ALfloat* pflValues);
    /// ```
    public static void alAuxiliaryEffectSlotfvDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alAuxiliaryEffectSlotfvDirect", context, effectslot, param, pflValues); }
        Handles.MH_alAuxiliaryEffectSlotfvDirect.invokeExact(Handles.get().PFN_alAuxiliaryEffectSlotfvDirect, context, effectslot, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfvDirect", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotiDirect`.
    /// ```
    /// void alGetAuxiliaryEffectSlotiDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, ALint* piValue);
    /// ```
    public static void alGetAuxiliaryEffectSlotiDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment piValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotiDirect", context, effectslot, param, piValue); }
        Handles.MH_alGetAuxiliaryEffectSlotiDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotiDirect, context, effectslot, param, piValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotiDirect", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotivDirect`.
    /// ```
    /// void alGetAuxiliaryEffectSlotivDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, ALint* piValues);
    /// ```
    public static void alGetAuxiliaryEffectSlotivDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment piValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotivDirect", context, effectslot, param, piValues); }
        Handles.MH_alGetAuxiliaryEffectSlotivDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotivDirect, context, effectslot, param, piValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotivDirect", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotfDirect`.
    /// ```
    /// void alGetAuxiliaryEffectSlotfDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, ALfloat* pflValue);
    /// ```
    public static void alGetAuxiliaryEffectSlotfDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment pflValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotfDirect", context, effectslot, param, pflValue); }
        Handles.MH_alGetAuxiliaryEffectSlotfDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotfDirect, context, effectslot, param, pflValue); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfDirect", e); }
    }

    /// Invokes `alGetAuxiliaryEffectSlotfvDirect`.
    /// ```
    /// void alGetAuxiliaryEffectSlotfvDirect(ALCcontext* context, (unsigned int) ALuint effectslot, (int) ALenum param, ALfloat* pflValues);
    /// ```
    public static void alGetAuxiliaryEffectSlotfvDirect(@NonNull MemorySegment context, int effectslot, int param, @NonNull MemorySegment pflValues) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetAuxiliaryEffectSlotfvDirect", context, effectslot, param, pflValues); }
        Handles.MH_alGetAuxiliaryEffectSlotfvDirect.invokeExact(Handles.get().PFN_alGetAuxiliaryEffectSlotfvDirect, context, effectslot, param, pflValues); }
        catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfvDirect", e); }
    }

    /// Invokes `alBufferDataStaticDirect`.
    /// ```
    /// void alBufferDataStaticDirect(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum format, ALvoid* data, (int) ALsizei size, (int) ALsizei freq);
    /// ```
    public static void alBufferDataStaticDirect(@NonNull MemorySegment context, int buffer, int format, @NonNull MemorySegment data, int size, int freq) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferDataStaticDirect", context, buffer, format, data, size, freq); }
        Handles.MH_alBufferDataStaticDirect.invokeExact(Handles.get().PFN_alBufferDataStaticDirect, context, buffer, format, data, size, freq); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferDataStaticDirect", e); }
    }

    /// Invokes `alDebugMessageCallbackDirectEXT`.
    /// ```
    /// void alDebugMessageCallbackDirectEXT(ALCcontext* context, (void (*ALDebugProcEXT)((int) ALenum source, (int) ALenum type, (unsigned int) ALuint id, (int) ALenum severity, (int) ALsizei length, const ALchar* message, void* userParam)) ALDEBUGPROCEXT callback, void* userParam);
    /// ```
    public static void alDebugMessageCallbackDirectEXT(@NonNull MemorySegment context, @NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageCallbackDirectEXT", context, callback, userParam); }
        Handles.MH_alDebugMessageCallbackDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageCallbackDirectEXT, context, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackDirectEXT", e); }
    }

    /// Invokes `alDebugMessageInsertDirectEXT`.
    /// ```
    /// void alDebugMessageInsertDirectEXT(ALCcontext* context, (int) ALenum source, (int) ALenum type, (unsigned int) ALuint id, (int) ALenum severity, (int) ALsizei length, const ALchar* message);
    /// ```
    public static void alDebugMessageInsertDirectEXT(@NonNull MemorySegment context, int source, int type, int id, int severity, int length, @NonNull MemorySegment message) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageInsertDirectEXT", context, source, type, id, severity, length, message); }
        Handles.MH_alDebugMessageInsertDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageInsertDirectEXT, context, source, type, id, severity, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertDirectEXT", e); }
    }

    /// Invokes `alDebugMessageControlDirectEXT`.
    /// ```
    /// void alDebugMessageControlDirectEXT(ALCcontext* context, (int) ALenum source, (int) ALenum type, (int) ALenum severity, (int) ALsizei count, const ALuint* ids, ALboolean enable);
    /// ```
    public static void alDebugMessageControlDirectEXT(@NonNull MemorySegment context, int source, int type, int severity, int count, @NonNull MemorySegment ids, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDebugMessageControlDirectEXT", context, source, type, severity, count, ids, enable); }
        Handles.MH_alDebugMessageControlDirectEXT.invokeExact(Handles.get().PFN_alDebugMessageControlDirectEXT, context, source, type, severity, count, ids, ((enable) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlDirectEXT", e); }
    }

    /// Invokes `alPushDebugGroupDirectEXT`.
    /// ```
    /// void alPushDebugGroupDirectEXT(ALCcontext* context, (int) ALenum source, (unsigned int) ALuint id, (int) ALsizei length, const ALchar* message);
    /// ```
    public static void alPushDebugGroupDirectEXT(@NonNull MemorySegment context, int source, int id, int length, @NonNull MemorySegment message) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alPushDebugGroupDirectEXT", context, source, id, length, message); }
        Handles.MH_alPushDebugGroupDirectEXT.invokeExact(Handles.get().PFN_alPushDebugGroupDirectEXT, context, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupDirectEXT", e); }
    }

    /// Invokes `alPopDebugGroupDirectEXT`.
    /// ```
    /// void alPopDebugGroupDirectEXT(ALCcontext* context);
    /// ```
    public static void alPopDebugGroupDirectEXT(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alPopDebugGroupDirectEXT", context); }
        Handles.MH_alPopDebugGroupDirectEXT.invokeExact(Handles.get().PFN_alPopDebugGroupDirectEXT, context); }
        catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupDirectEXT", e); }
    }

    /// Invokes `alGetDebugMessageLogDirectEXT`.
    /// ```
    /// (unsigned int) ALuint alGetDebugMessageLogDirectEXT(ALCcontext* context, (unsigned int) ALuint count, (int) ALsizei logBufSize, ALenum* sources, ALenum* types, ALuint* ids, ALenum* severities, ALsizei* lengths, ALchar* logBuf);
    /// ```
    public static int alGetDebugMessageLogDirectEXT(@NonNull MemorySegment context, int count, int logBufSize, @NonNull MemorySegment sources, @NonNull MemorySegment types, @NonNull MemorySegment ids, @NonNull MemorySegment severities, @NonNull MemorySegment lengths, @NonNull MemorySegment logBuf) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetDebugMessageLogDirectEXT", context, count, logBufSize, sources, types, ids, severities, lengths, logBuf); }
        return (int) Handles.MH_alGetDebugMessageLogDirectEXT.invokeExact(Handles.get().PFN_alGetDebugMessageLogDirectEXT, context, count, logBufSize, sources, types, ids, severities, lengths, logBuf); }
        catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogDirectEXT", e); }
    }

    /// Invokes `alObjectLabelDirectEXT`.
    /// ```
    /// void alObjectLabelDirectEXT(ALCcontext* context, (int) ALenum identifier, (unsigned int) ALuint name, (int) ALsizei length, const ALchar* label);
    /// ```
    public static void alObjectLabelDirectEXT(@NonNull MemorySegment context, int identifier, int name, int length, @NonNull MemorySegment label) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alObjectLabelDirectEXT", context, identifier, name, length, label); }
        Handles.MH_alObjectLabelDirectEXT.invokeExact(Handles.get().PFN_alObjectLabelDirectEXT, context, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in alObjectLabelDirectEXT", e); }
    }

    /// Invokes `alGetObjectLabelDirectEXT`.
    /// ```
    /// void alGetObjectLabelDirectEXT(ALCcontext* context, (int) ALenum identifier, (unsigned int) ALuint name, (int) ALsizei bufSize, ALsizei* length, ALchar* label);
    /// ```
    public static void alGetObjectLabelDirectEXT(@NonNull MemorySegment context, int identifier, int name, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetObjectLabelDirectEXT", context, identifier, name, bufSize, length, label); }
        Handles.MH_alGetObjectLabelDirectEXT.invokeExact(Handles.get().PFN_alGetObjectLabelDirectEXT, context, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelDirectEXT", e); }
    }

    /// Invokes `alGetPointerDirectEXT`.
    /// ```
    /// void* alGetPointerDirectEXT(ALCcontext* context, (int) ALenum pname);
    /// ```
    public static @NonNull MemorySegment alGetPointerDirectEXT(@NonNull MemorySegment context, int pname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointerDirectEXT", context, pname); }
        return (MemorySegment) Handles.MH_alGetPointerDirectEXT.invokeExact(Handles.get().PFN_alGetPointerDirectEXT, context, pname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectEXT", e); }
    }

    /// Invokes `alGetPointervDirectEXT`.
    /// ```
    /// void alGetPointervDirectEXT(ALCcontext* context, (int) ALenum pname, void** values);
    /// ```
    public static void alGetPointervDirectEXT(@NonNull MemorySegment context, int pname, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointervDirectEXT", context, pname, values); }
        Handles.MH_alGetPointervDirectEXT.invokeExact(Handles.get().PFN_alGetPointervDirectEXT, context, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectEXT", e); }
    }

    /// Invokes `alRequestFoldbackStartDirect`.
    /// ```
    /// void alRequestFoldbackStartDirect(ALCcontext* context, (int) ALenum mode, (int) ALsizei count, (int) ALsizei length, ALfloat* mem, (void (*ALFoldbackCallback)((int) ALenum event, (int) ALsizei blockIndex)) LPALFOLDBACKCALLBACK callback);
    /// ```
    public static void alRequestFoldbackStartDirect(@NonNull MemorySegment context, int mode, int count, int length, @NonNull MemorySegment mem, @NonNull MemorySegment callback) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alRequestFoldbackStartDirect", context, mode, count, length, mem, callback); }
        Handles.MH_alRequestFoldbackStartDirect.invokeExact(Handles.get().PFN_alRequestFoldbackStartDirect, context, mode, count, length, mem, callback); }
        catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStartDirect", e); }
    }

    /// Invokes `alRequestFoldbackStopDirect`.
    /// ```
    /// void alRequestFoldbackStopDirect(ALCcontext* context);
    /// ```
    public static void alRequestFoldbackStopDirect(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alRequestFoldbackStopDirect", context); }
        Handles.MH_alRequestFoldbackStopDirect.invokeExact(Handles.get().PFN_alRequestFoldbackStopDirect, context); }
        catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStopDirect", e); }
    }

    /// Invokes `alBufferSubDataDirectSOFT`.
    /// ```
    /// void alBufferSubDataDirectSOFT(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum format, const ALvoid* data, (int) ALsizei offset, (int) ALsizei length);
    /// ```
    public static void alBufferSubDataDirectSOFT(@NonNull MemorySegment context, int buffer, int format, @NonNull MemorySegment data, int offset, int length) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferSubDataDirectSOFT", context, buffer, format, data, offset, length); }
        Handles.MH_alBufferSubDataDirectSOFT.invokeExact(Handles.get().PFN_alBufferSubDataDirectSOFT, context, buffer, format, data, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferSubDataDirectSOFT", e); }
    }

    /// Invokes `alSourcedDirectSOFT`.
    /// ```
    /// void alSourcedDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (double) ALdouble value);
    /// ```
    public static void alSourcedDirectSOFT(@NonNull MemorySegment context, int source, int param, double value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcedDirectSOFT", context, source, param, value); }
        Handles.MH_alSourcedDirectSOFT.invokeExact(Handles.get().PFN_alSourcedDirectSOFT, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcedDirectSOFT", e); }
    }

    /// Invokes `alSource3dDirectSOFT`.
    /// ```
    /// void alSource3dDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, (double) ALdouble value1, (double) ALdouble value2, (double) ALdouble value3);
    /// ```
    public static void alSource3dDirectSOFT(@NonNull MemorySegment context, int source, int param, double value1, double value2, double value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3dDirectSOFT", context, source, param, value1, value2, value3); }
        Handles.MH_alSource3dDirectSOFT.invokeExact(Handles.get().PFN_alSource3dDirectSOFT, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3dDirectSOFT", e); }
    }

    /// Invokes `alSourcedvDirectSOFT`.
    /// ```
    /// void alSourcedvDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, const ALdouble* values);
    /// ```
    public static void alSourcedvDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcedvDirectSOFT", context, source, param, values); }
        Handles.MH_alSourcedvDirectSOFT.invokeExact(Handles.get().PFN_alSourcedvDirectSOFT, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcedvDirectSOFT", e); }
    }

    /// Invokes `alGetSourcedDirectSOFT`.
    /// ```
    /// void alGetSourcedDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALdouble* value);
    /// ```
    public static void alGetSourcedDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcedDirectSOFT", context, source, param, value); }
        Handles.MH_alGetSourcedDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcedDirectSOFT, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcedDirectSOFT", e); }
    }

    /// Invokes `alGetSource3dDirectSOFT`.
    /// ```
    /// void alGetSource3dDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALdouble* value1, ALdouble* value2, ALdouble* value3);
    /// ```
    public static void alGetSource3dDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3dDirectSOFT", context, source, param, value1, value2, value3); }
        Handles.MH_alGetSource3dDirectSOFT.invokeExact(Handles.get().PFN_alGetSource3dDirectSOFT, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3dDirectSOFT", e); }
    }

    /// Invokes `alGetSourcedvDirectSOFT`.
    /// ```
    /// void alGetSourcedvDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALdouble* values);
    /// ```
    public static void alGetSourcedvDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcedvDirectSOFT", context, source, param, values); }
        Handles.MH_alGetSourcedvDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcedvDirectSOFT, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvDirectSOFT", e); }
    }

    /// Invokes `alSourcei64DirectSOFT`.
    /// ```
    /// void alSourcei64DirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ((int64_t) _alsoft_int64_t) ALint64SOFT value);
    /// ```
    public static void alSourcei64DirectSOFT(@NonNull MemorySegment context, int source, int param, long value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei64DirectSOFT", context, source, param, value); }
        Handles.MH_alSourcei64DirectSOFT.invokeExact(Handles.get().PFN_alSourcei64DirectSOFT, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei64DirectSOFT", e); }
    }

    /// Invokes `alSource3i64DirectSOFT`.
    /// ```
    /// void alSource3i64DirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ((int64_t) _alsoft_int64_t) ALint64SOFT value1, ((int64_t) _alsoft_int64_t) ALint64SOFT value2, ((int64_t) _alsoft_int64_t) ALint64SOFT value3);
    /// ```
    public static void alSource3i64DirectSOFT(@NonNull MemorySegment context, int source, int param, long value1, long value2, long value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSource3i64DirectSOFT", context, source, param, value1, value2, value3); }
        Handles.MH_alSource3i64DirectSOFT.invokeExact(Handles.get().PFN_alSource3i64DirectSOFT, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alSource3i64DirectSOFT", e); }
    }

    /// Invokes `alSourcei64vDirectSOFT`.
    /// ```
    /// void alSourcei64vDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, const ALint64SOFT* values);
    /// ```
    public static void alSourcei64vDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcei64vDirectSOFT", context, source, param, values); }
        Handles.MH_alSourcei64vDirectSOFT.invokeExact(Handles.get().PFN_alSourcei64vDirectSOFT, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcei64vDirectSOFT", e); }
    }

    /// Invokes `alGetSourcei64DirectSOFT`.
    /// ```
    /// void alGetSourcei64DirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* value);
    /// ```
    public static void alGetSourcei64DirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei64DirectSOFT", context, source, param, value); }
        Handles.MH_alGetSourcei64DirectSOFT.invokeExact(Handles.get().PFN_alGetSourcei64DirectSOFT, context, source, param, value); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64DirectSOFT", e); }
    }

    /// Invokes `alGetSource3i64DirectSOFT`.
    /// ```
    /// void alGetSource3i64DirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* value1, ALint64SOFT* value2, ALint64SOFT* value3);
    /// ```
    public static void alGetSource3i64DirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment value1, @NonNull MemorySegment value2, @NonNull MemorySegment value3) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSource3i64DirectSOFT", context, source, param, value1, value2, value3); }
        Handles.MH_alGetSource3i64DirectSOFT.invokeExact(Handles.get().PFN_alGetSource3i64DirectSOFT, context, source, param, value1, value2, value3); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64DirectSOFT", e); }
    }

    /// Invokes `alGetSourcei64vDirectSOFT`.
    /// ```
    /// void alGetSourcei64vDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, (int) ALenum param, ALint64SOFT* values);
    /// ```
    public static void alGetSourcei64vDirectSOFT(@NonNull MemorySegment context, int source, int param, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetSourcei64vDirectSOFT", context, source, param, values); }
        Handles.MH_alGetSourcei64vDirectSOFT.invokeExact(Handles.get().PFN_alGetSourcei64vDirectSOFT, context, source, param, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vDirectSOFT", e); }
    }

    /// Invokes `alDeferUpdatesDirectSOFT`.
    /// ```
    /// void alDeferUpdatesDirectSOFT(ALCcontext* context);
    /// ```
    public static void alDeferUpdatesDirectSOFT(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alDeferUpdatesDirectSOFT", context); }
        Handles.MH_alDeferUpdatesDirectSOFT.invokeExact(Handles.get().PFN_alDeferUpdatesDirectSOFT, context); }
        catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesDirectSOFT", e); }
    }

    /// Invokes `alProcessUpdatesDirectSOFT`.
    /// ```
    /// void alProcessUpdatesDirectSOFT(ALCcontext* context);
    /// ```
    public static void alProcessUpdatesDirectSOFT(@NonNull MemorySegment context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alProcessUpdatesDirectSOFT", context); }
        Handles.MH_alProcessUpdatesDirectSOFT.invokeExact(Handles.get().PFN_alProcessUpdatesDirectSOFT, context); }
        catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesDirectSOFT", e); }
    }

    /// Invokes `alGetStringiDirectSOFT`.
    /// ```
    /// const ALchar* alGetStringiDirectSOFT(ALCcontext* context, (int) ALenum pname, (int) ALsizei index);
    /// ```
    public static @NonNull MemorySegment alGetStringiDirectSOFT(@NonNull MemorySegment context, int pname, int index) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetStringiDirectSOFT", context, pname, index); }
        return (MemorySegment) Handles.MH_alGetStringiDirectSOFT.invokeExact(Handles.get().PFN_alGetStringiDirectSOFT, context, pname, index); }
        catch (Throwable e) { throw new RuntimeException("error in alGetStringiDirectSOFT", e); }
    }

    /// Invokes `alEventControlDirectSOFT`.
    /// ```
    /// void alEventControlDirectSOFT(ALCcontext* context, (int) ALsizei count, const ALenum* types, ALboolean enable);
    /// ```
    public static void alEventControlDirectSOFT(@NonNull MemorySegment context, int count, @NonNull MemorySegment types, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEventControlDirectSOFT", context, count, types, enable); }
        Handles.MH_alEventControlDirectSOFT.invokeExact(Handles.get().PFN_alEventControlDirectSOFT, context, count, types, ((enable) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in alEventControlDirectSOFT", e); }
    }

    /// Invokes `alEventCallbackDirectSOFT`.
    /// ```
    /// void alEventCallbackDirectSOFT(ALCcontext* context, (void (*ALEventProcSOFT)((int) ALenum eventType, (unsigned int) ALuint object, (unsigned int) ALuint param, (int) ALsizei length, const ALchar* message, void* userParam)) ALEVENTPROCSOFT callback, void* userParam);
    /// ```
    public static void alEventCallbackDirectSOFT(@NonNull MemorySegment context, @NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alEventCallbackDirectSOFT", context, callback, userParam); }
        Handles.MH_alEventCallbackDirectSOFT.invokeExact(Handles.get().PFN_alEventCallbackDirectSOFT, context, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in alEventCallbackDirectSOFT", e); }
    }

    /// Invokes `alGetPointerDirectSOFT`.
    /// ```
    /// void* alGetPointerDirectSOFT(ALCcontext* context, (int) ALenum pname);
    /// ```
    public static @NonNull MemorySegment alGetPointerDirectSOFT(@NonNull MemorySegment context, int pname) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointerDirectSOFT", context, pname); }
        return (MemorySegment) Handles.MH_alGetPointerDirectSOFT.invokeExact(Handles.get().PFN_alGetPointerDirectSOFT, context, pname); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectSOFT", e); }
    }

    /// Invokes `alGetPointervDirectSOFT`.
    /// ```
    /// void alGetPointervDirectSOFT(ALCcontext* context, (int) ALenum pname, void** values);
    /// ```
    public static void alGetPointervDirectSOFT(@NonNull MemorySegment context, int pname, @NonNull MemorySegment values) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetPointervDirectSOFT", context, pname, values); }
        Handles.MH_alGetPointervDirectSOFT.invokeExact(Handles.get().PFN_alGetPointervDirectSOFT, context, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectSOFT", e); }
    }

    /// Invokes `alBufferCallbackDirectSOFT`.
    /// ```
    /// void alBufferCallbackDirectSOFT(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum format, (int) ALsizei freq, ((int) ALsizei (*ALBufferCallbackTypeSOFT)(ALvoid* userptr, ALvoid* sampledata, (int) ALsizei numbytes)) ALBUFFERCALLBACKTYPESOFT callback, ALvoid* userptr);
    /// ```
    public static void alBufferCallbackDirectSOFT(@NonNull MemorySegment context, int buffer, int format, int freq, @NonNull MemorySegment callback, @NonNull MemorySegment userptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alBufferCallbackDirectSOFT", context, buffer, format, freq, callback, userptr); }
        Handles.MH_alBufferCallbackDirectSOFT.invokeExact(Handles.get().PFN_alBufferCallbackDirectSOFT, context, buffer, format, freq, callback, userptr); }
        catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackDirectSOFT", e); }
    }

    /// Invokes `alGetBufferPtrDirectSOFT`.
    /// ```
    /// void alGetBufferPtrDirectSOFT(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr);
    /// ```
    public static void alGetBufferPtrDirectSOFT(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment ptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferPtrDirectSOFT", context, buffer, param, ptr); }
        Handles.MH_alGetBufferPtrDirectSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrDirectSOFT, context, buffer, param, ptr); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrDirectSOFT", e); }
    }

    /// Invokes `alGetBuffer3PtrDirectSOFT`.
    /// ```
    /// void alGetBuffer3PtrDirectSOFT(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr0, ALvoid** ptr1, ALvoid** ptr2);
    /// ```
    public static void alGetBuffer3PtrDirectSOFT(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment ptr0, @NonNull MemorySegment ptr1, @NonNull MemorySegment ptr2) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBuffer3PtrDirectSOFT", context, buffer, param, ptr0, ptr1, ptr2); }
        Handles.MH_alGetBuffer3PtrDirectSOFT.invokeExact(Handles.get().PFN_alGetBuffer3PtrDirectSOFT, context, buffer, param, ptr0, ptr1, ptr2); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrDirectSOFT", e); }
    }

    /// Invokes `alGetBufferPtrvDirectSOFT`.
    /// ```
    /// void alGetBufferPtrvDirectSOFT(ALCcontext* context, (unsigned int) ALuint buffer, (int) ALenum param, ALvoid** ptr);
    /// ```
    public static void alGetBufferPtrvDirectSOFT(@NonNull MemorySegment context, int buffer, int param, @NonNull MemorySegment ptr) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alGetBufferPtrvDirectSOFT", context, buffer, param, ptr); }
        Handles.MH_alGetBufferPtrvDirectSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrvDirectSOFT, context, buffer, param, ptr); }
        catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvDirectSOFT", e); }
    }

    /// Invokes `alSourcePlayAtTimeDirectSOFT`.
    /// ```
    /// void alSourcePlayAtTimeDirectSOFT(ALCcontext* context, (unsigned int) ALuint source, ((int64_t) _alsoft_int64_t) ALint64SOFT start_time);
    /// ```
    public static void alSourcePlayAtTimeDirectSOFT(@NonNull MemorySegment context, int source, long start_time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayAtTimeDirectSOFT", context, source, start_time); }
        Handles.MH_alSourcePlayAtTimeDirectSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimeDirectSOFT, context, source, start_time); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeDirectSOFT", e); }
    }

    /// Invokes `alSourcePlayAtTimevDirectSOFT`.
    /// ```
    /// void alSourcePlayAtTimevDirectSOFT(ALCcontext* context, (int) ALsizei n, const ALuint* sources, ((int64_t) _alsoft_int64_t) ALint64SOFT start_time);
    /// ```
    public static void alSourcePlayAtTimevDirectSOFT(@NonNull MemorySegment context, int n, @NonNull MemorySegment sources, long start_time) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("alSourcePlayAtTimevDirectSOFT", context, n, sources, start_time); }
        Handles.MH_alSourcePlayAtTimevDirectSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimevDirectSOFT, context, n, sources, start_time); }
        catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevDirectSOFT", e); }
    }

    /// Invokes `EAXSetDirect`.
    /// ```
    /// (int) ALenum EAXSetDirect(ALCcontext* context, const struct _GUID * property_set_id, (unsigned int) ALuint property_id, (unsigned int) ALuint source_id, ALvoid* value, (unsigned int) ALuint value_size);
    /// ```
    public static int EAXSetDirect(@NonNull MemorySegment context, @NonNull MemorySegment property_set_id, int property_id, int source_id, @NonNull MemorySegment value, int value_size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("EAXSetDirect", context, property_set_id, property_id, source_id, value, value_size); }
        return (int) Handles.MH_EAXSetDirect.invokeExact(Handles.get().PFN_EAXSetDirect, context, property_set_id, property_id, source_id, value, value_size); }
        catch (Throwable e) { throw new RuntimeException("error in EAXSetDirect", e); }
    }

    /// Invokes `EAXGetDirect`.
    /// ```
    /// (int) ALenum EAXGetDirect(ALCcontext* context, const struct _GUID * property_set_id, (unsigned int) ALuint property_id, (unsigned int) ALuint source_id, ALvoid* value, (unsigned int) ALuint value_size);
    /// ```
    public static int EAXGetDirect(@NonNull MemorySegment context, @NonNull MemorySegment property_set_id, int property_id, int source_id, @NonNull MemorySegment value, int value_size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("EAXGetDirect", context, property_set_id, property_id, source_id, value, value_size); }
        return (int) Handles.MH_EAXGetDirect.invokeExact(Handles.get().PFN_EAXGetDirect, context, property_set_id, property_id, source_id, value, value_size); }
        catch (Throwable e) { throw new RuntimeException("error in EAXGetDirect", e); }
    }

    /// Invokes `EAXSetBufferModeDirect`.
    /// ```
    /// ALboolean EAXSetBufferModeDirect(ALCcontext* context, (int) ALsizei n, const ALuint* buffers, (int) ALint value);
    /// ```
    public static boolean EAXSetBufferModeDirect(@NonNull MemorySegment context, int n, @NonNull MemorySegment buffers, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("EAXSetBufferModeDirect", context, n, buffers, value); }
        return (((byte) Handles.MH_EAXSetBufferModeDirect.invokeExact(Handles.get().PFN_EAXSetBufferModeDirect, context, n, buffers, value)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in EAXSetBufferModeDirect", e); }
    }

    /// Invokes `EAXGetBufferModeDirect`.
    /// ```
    /// (int) ALenum EAXGetBufferModeDirect(ALCcontext* context, (unsigned int) ALuint buffer, ALint* pReserved);
    /// ```
    public static int EAXGetBufferModeDirect(@NonNull MemorySegment context, int buffer, @NonNull MemorySegment pReserved) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("EAXGetBufferModeDirect", context, buffer, pReserved); }
        return (int) Handles.MH_EAXGetBufferModeDirect.invokeExact(Handles.get().PFN_EAXGetBufferModeDirect, context, buffer, pReserved); }
        catch (Throwable e) { throw new RuntimeException("error in EAXGetBufferModeDirect", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALExt() {
    }
}
