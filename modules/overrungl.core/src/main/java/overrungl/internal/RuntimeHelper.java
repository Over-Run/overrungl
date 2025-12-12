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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.internal;

import overrungl.OverrunGL;
import overrungl.OverrunGLConfig;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The runtime helper, for internal use.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class RuntimeHelper {
    private static final Linker LINKER = Linker.nativeLinker();
    /// Trace downcall invocation and print a debug message with [OverrunGL#apiLogger()].
    ///
    /// Specify with [OverrunGLConfig#TRACE_DOWNCALLS]
    public static final boolean TRACE_DOWNCALLS = OverrunGLConfig.TRACE_DOWNCALLS.get();

    /**
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Generates a string for unknown token.
     *
     * @param token the token.
     * @return the string formatted in {@code Unknown [0xHex(token)]}.
     * @see #unknownToken(String, int)
     */
    public static String unknownToken(int token) {
        return unknownToken("Unknown", token);
    }

    /**
     * Generates a string for unknown token.
     *
     * @param description the description. default to {@code Unknown}
     * @param token       the token.
     * @return the string is formatted in {@code description [0xHex(token)]}.
     */
    public static String unknownToken(String description, int token) {
        return description + " [0x" + Integer.toHexString(token) + "]";
    }

    /// Creates a method handle without binding to a specific address.
    ///
    /// @param descriptor the function descriptor
    /// @return the method handle
    public static MethodHandle downcallHandle(FunctionDescriptor descriptor) {
        return LINKER.downcallHandle(descriptor);
    }

    /// Converts upcall target name to `name*`, where `*` is a character describing the return layout
    ///
    /// Implementation note: the behavior of this method was changed in 0.2.0.
    /// the returned value used to include descriptor of parameters
    ///
    /// @param name       the original name
    /// @param descriptor the descriptor
    /// @return the converted name
    public static String upcallTarget(String name, FunctionDescriptor descriptor) {
        return name + descriptor.returnLayout().map(RuntimeHelper::descriptorLayoutToChar).orElse('V');
    }

    private static char descriptorLayoutToChar(MemoryLayout layout) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw new IllegalArgumentException("Not a value layout: " + layout);
        }
        return switch (valueLayout) {
            case AddressLayout _ -> 'P';
            case ValueLayout.OfBoolean _ -> 'Z';
            case ValueLayout.OfChar _ -> 'C';
            case ValueLayout.OfByte _ -> 'B';
            case ValueLayout.OfShort _ -> 'S';
            case ValueLayout.OfInt _ -> 'I';
            case ValueLayout.OfLong _ -> 'J';
            case ValueLayout.OfFloat _ -> 'F';
            case ValueLayout.OfDouble _ -> 'D';
        };
    }

    /// Prints a message indicating that a downcall method is being invoked.
    ///
    /// @param name the name of the downcall method
    /// @param args the arguments passed to the method
    public static void traceDowncall(String name, Object... args) {
        OverrunGL.apiLog(name + "(" + Arrays.stream(args).map(String::valueOf).collect(Collectors.joining(", ")) + ")");
    }
}
