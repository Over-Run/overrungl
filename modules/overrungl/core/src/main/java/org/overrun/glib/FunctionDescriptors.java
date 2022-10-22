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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.*;

/**
 * The function descriptors.
 *
 * <h2>Char-table</h2>
 * <pre>{@code
 * switch (c) {
 *     case 'B' -> JAVA_BYTE;
 *     case 'S' -> JAVA_SHORT;
 *     case 'I' -> JAVA_INT;
 *     case 'J' -> JAVA_LONG;
 *     case 'C' -> JAVA_CHAR;
 *     case 'Z' -> JAVA_BOOLEAN;
 *     case 'F' -> JAVA_FLOAT;
 *     case 'D' -> JAVA_DOUBLE;
 *     default -> ADDRESS;
 * }}</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public enum FunctionDescriptors {
    // 1
    D, I, J, P, V,
    // 2
    BV, DV, FV, II, IP, IV, IZ, JV, PF, fd_PI("PI"), PP, PV, PZ, SV, ZV,
    // 3
    DDV, FFV, FZV, IDV, IFV, III, IIP, IIV, IIZ, IPI, IPP, IPV, ISV, PFV, PII, PIP, PIV, PPI, PPP, PPV, SSV,
    // 4
    BBBV, DDDV, FFFV, IDDV, IFFV, IIDV, IIFV, IIIV, IIPI, IIPV, IJJV, IPPV, IPPZ, ISSV, PDDV, PIIP, PIIV, PIJI, PIJV,
    PIPP, PIPV, PPPV, SSSV,
    // 5
    BBBBV, DDDDV, FFFFV, IDDDV, IFFFV, IIDDV, IIFFV, IIFIV, IIIIV, IIIJV, IIIPV, IIJIV, IIPIV, IIPPV, IIZIV, IIZPV,
    IJJIP, IJJPV, IJPIV, IPIIV, IPPIV, ISSSV, PIIIP, PIIPP, PIPII, PIPIP, PIPPV, PPPPI, SSSSV, ZZZZV,
    // 6
    IBBBBV, IDDDDV, IFFFFV, IIDDDV, IIFFFV, IIIFIV, IIIIIV, IIIIPV, IIIJIV, IIIJJV, IIIPIV, IIIPPV, IIIPZV, IIIZIV,
    IIIZPV, IIJJJV, IIPIIV, IIPIPV, IIPPPP, IIPPPV, IPIPIV, IPIPPV, IPJIIV, IPPIPV, ISSSSV, IZIIPV, IZZZZV, PIIIIV,
    PIIIPI, PIIPIP, PIIPPV, PIPPPI, PPIIIP, PPPPIP, PPPPPI, PPPPPV,
    // 7
    DDDDDDV, IDDIDDV, IDDIIPV, IFFIFFV, IFFIIPV, IIDDDDV, IIFFFFV, IIIIIIV, IIIIIPV, IIIIIZV, IIIIPPV, IIIIPZV, IIIIZIV,
    IIIPIIV, IIIPPPV, IIIZIPV, IIPJIIV, IPIPIPV, PIIIIPP, PIPPPIP, PPIIIPI, PPPPPIP,
    // 8
    IIFFFFPV, IIIIIIIV, IIIIIIPV, IIIIIIZV, IIIIIPIV, IIIPIIIV, IIIPPPPV, IIIZIIIV, IIJJIIPV, IIPIIIIV, IIPPPPPI,
    PPIIIIIV,
    // 9
    IIIIIIIIV, IIIIIIIPV, IIIIPIPPV, IIPPPPPPI, PIPPPPPIP,
    // 10
    IIIIIIIIIV, IIIIIIIIPV, PIIIPIIIII,
    // 11
    IDDIIDDIIPV, IFFIIFFIIPV, IIIIIIIIIIV, IIIIIIIIIPV,
    // 12
    IIIIIIIIIIPV, PIIIPIIIIIII,
    // 13
    IIIIIIIIIIIIV, IIIIIIIIIIIPV, PIIIPIIIIIIII,
    // 16
    IIIIIIIIIIIIIIIV, PIIIPIIIIIIIIIPI,
    // 19
    PIIIPIIIIIIIIIIIIPI,
    // 23
    PIIIPIIIIIIIIIIIIPFFFFI,
    ;

    private final FunctionDescriptor descriptor;

    FunctionDescriptors(String customName) {
        descriptor = ofDescriptor(customName);
    }

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
     * Gets the function descriptor.
     *
     * @return the function descriptor
     */
    public FunctionDescriptor descriptor() {
        return descriptor;
    }
}
