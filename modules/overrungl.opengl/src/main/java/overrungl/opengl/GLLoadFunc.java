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

package overrungl.opengl;

import overrun.marshal.Unmarshal;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.util.Optional;

/**
 * The OpenGL loading function.
 * <h2>Example</h2>
 * {@snippet lang = java:
 * // loads OpenGL forward-compatible profile
 * import java.util.Objects;
 * Objects.requireNonNull(GLLoader.load(GLLoader.loadFlags(glfw::getProcAddress)), "Failed to load OpenGL");
 * }
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc {
    /**
     * Gets the function pointer of the given GL function.
     *
     * @param string the name of the function.
     * @return the function pointer.
     */
    MemorySegment invoke(String string);

    /**
     * {@return a symbol lookup of this}
     */
    default SymbolLookup lookup() {
        return name -> {
            final MemorySegment segment = invoke(name);
            return Unmarshal.isNullPointer(segment) ? Optional.empty() : Optional.of(segment);
        };
    }

    /**
     * {@return a loading function with alias supports}
     *
     * @param load the original loading function
     */
    static GLLoadFunc withAlias(GLLoadFunc load) {
        return string -> GLAliasResolver.resolve(load, string);
    }
}
