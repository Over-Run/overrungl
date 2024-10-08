/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.glfw;

import overrungl.Configurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;

/**
 * The GLFW method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    static final SymbolLookup lookup;

    static {
        registerStruct(GLFWAllocator.class, GLFWAllocator.OF);
        registerStruct(GLFWGamepadState.class, GLFWGamepadState.OF);
        registerStruct(GLFWGammaRamp.class, GLFWGammaRamp.OF);
        registerStruct(GLFWImage.class, GLFWImage.OF);
        registerStruct(GLFWVidMode.class, GLFWVidMode.OF);

        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("glfw", "glfw", OverrunGL.GLFW_VERSION);
        final var function = Configurations.GLFW_SYMBOL_LOOKUP.get();
        lookup = function != null ? function.apply(lib) : lib.get();
    }

    private Handles() {
        //no instance
    }
}
