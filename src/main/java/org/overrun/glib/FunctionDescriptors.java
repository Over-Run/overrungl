/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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

package org.overrun.glib;

import java.lang.foreign.Addressable;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * The function descriptors.
 *
 * @author squid233
 * @since 0.1.0
 */
public enum FunctionDescriptors {
    // 1
    I, V,
    // 2
    BV, DV, FV, II, IP, IV, IZ, JV, PV, SV, PZ, ZV,
    // 3
    DDV, FFV, FZV, IDV, IFV, III, IIP, IIV, IIZ, IPI, IPV, ISV, PPV, SSV,
    // 4
    BBBV, DDDV, FFFV, IDDV, IFFV, IIDV, IIFV, IIIV, IIPI, IIPV, IJJV, IPPV, IPPZ, ISSV, PIJI, PIJV, PIPV, SSSV,
    // 5
    BBBBV, DDDDV, FFFFV, IDDDV, IFFFV, IIDDV, IIFFV, IIFIV, IIIIV, IIIJV, IIIPV, IIJIV, IIPIV, IIPPV, IIZIV, IIZPV,
    IJJIP, IJJPV, IJPIV, IPIIV, IPPIV, ISSSV, PIPPV, SSSSV, ZZZZV,
    // 6
    IBBBBV, IDDDDV, IFFFFV, IIDDDV, IIFFFV, IIIFIV, IIIIIV, IIIIPV, IIIJIV, IIIJJV, IIIPIV, IIIPPV, IIIPZV, IIIZIV,
    IIIZPV, IIJJJV, IIPIIV, IIPIPV, IIPPPV, IPIPIV, IPIPPV, IPJIIV, ISSSSV, IZZZZV, PIIPPV,
    // 7
    DDDDDDV, IDDIDDV, IDDIIPV, IFFIFFV, IFFIIPV, IIDDDDV, IIFFFFV, IIIIIIV, IIIIIPV, IIIIIZV, IIIIPPV, IIIIPZV, IIIIZIV,
    IIIPIIV, IIIPPPV, IIIZIPV, IIPJIIV, IPIPIPV,
    // 8
    IIFFFFPV, IIIIIIIV, IIIIIIPV, IIIIIIZV, IIIIIPIV, IIIPIIIV, IIIPPPPV, IIIZIIIV, IIJJIIPV, IIPIIIIV, IIPPPPPI,
    // 9
    IIIIIIIIV, IIIIIIIPV, IIIIPIPPV, IIPPPPPPI,
    // 10
    IIIIIIIIIV, IIIIIIIIPV,
    // 11
    IDDIIDDIIPV, IFFIIFFIIPV, IIIIIIIIIIV, IIIIIIIIIPV,
    // 12
    IIIIIIIIIIPV,
    // 13
    IIIIIIIIIIIIV, IIIIIIIIIIIPV,
    // 16
    IIIIIIIIIIIIIIIV,
    ;

    private final FunctionDescriptor descriptor;

    FunctionDescriptors() {
        descriptor = ofDescriptor(name());
    }

    /**
     * Gets the value layout of the specified char.
     *
     * @param c the character
     * @return the value layout
     */
    public static ValueLayout ofValue(char c) {
        return switch (c) {
            case 'B' -> JAVA_BYTE;
            case 'S' -> JAVA_SHORT;
            case 'I' -> JAVA_INT;
            case 'J' -> JAVA_LONG;
            case 'C' -> JAVA_CHAR;
            case 'Z' -> JAVA_BOOLEAN;
            case 'F' -> JAVA_FLOAT;
            case 'D' -> JAVA_DOUBLE;
            default -> ADDRESS;
        };
    }

    /**
     * Create the function descriptor of the string.
     *
     * @param str the string
     * @return the function descriptor
     */
    public static FunctionDescriptor ofDescriptor(String str) {
        final int len = str.length();
        ValueLayout[] layouts = new ValueLayout[len - 1];
        for (int i = 0; i < layouts.length; i++) {
            layouts[i] = ofValue(str.charAt(i));
        }
        if (str.endsWith("V")) {
            return FunctionDescriptor.ofVoid(layouts);
        }
        return FunctionDescriptor.of(ofValue(str.charAt(len - 1)), layouts);
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol the address of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemoryAddress#NULL}
     * @see RuntimeHelper#downcallSafe(Addressable, FunctionDescriptor)
     */
    public MethodHandle downcallSafe(Addressable symbol) {
        return RuntimeHelper.downcallSafe(symbol, descriptor);
    }

    /**
     * Gets the function descriptor.
     *
     * @return the function descriptor
     */
    public FunctionDescriptor descriptor() {
        return descriptor;
    }
}
