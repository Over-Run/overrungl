/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.*;

/**
 * The function descriptors.
 *
 * <h2>Mappings</h2>
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
 *     case 'P' -> ADDRESS;
 *     case 'p' -> RuntimeHelper.ADDRESS_UNBOUNDED;
 *     default -> throw();
 * }}</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public enum FunctionDescriptors {
    // 1
    D, F, I, J, P, p, V,
    // 2
    BV, DV, FV, II, IJ, IP, Ip, IV, IZ, JP, JV, JZ, PF,
    /**
     * Make it doesn't confuse with {@link Math#PI}.
     */
    fd_PI("PI"),
    PJ, PP, Pp, PV, PZ, SV, ZV,
    // 3
    DDV, FFV, FZV, IDV, IFV, III, IIJ, IIP, IIp, IIV, IIZ, IJV, IPI, IPP, IPp, IPV, ISV, JIV, JJP, PFV, PII, PIV, PJP, PPI,
    PPP, PPp, PPV, SSV,
    // 4
    BBBV, DDDV, FFFV, IDDV, IFFV, IIDV, IIFV, IIII, IIIV, IIJV, IIPI, IIPV, IJJV, IPIV, IPPV, IPPZ, ISSV, PDDV, PIIP, PIIV,
    PIJI, PIJP, PIJV, PIPp, PIPV, PPII, PPIP, PPJP, PPPV, SSSV,
    // 5
    BBBBV, DDDDV, FFFFV, IDDDV, IFFFV, IIDDV, IIFFV, IIFIV, IIIIV, IIIJV, IIIPV, IIJIV, IIJJV, IIPIV, IIPPV, IIZIV, IIZPV,
    IJJIP, IJJJV, IJJPV, IJPIV, IPIIV, IPPIV, ISSSV, PIIIP, PIIPp, PIPII, PIPIp, PIPPV, PPPPI, PPPPV, SSSSV, ZZZZV,
    // 6
    FFFFFV, IBBBBV, IDDDDV, IFFFFV, IIDDDV, IIFFFV, IIIFIV, IIIIIV, IIIIPV, IIIJIV, IIIJJV, IIIPIV, IIIPPP, IIIPPV, IIIPZV,
    IIIZIV, IIIZPV, IIJJJV, IIPIIV, IIPIPV, IIPPPP, IIPPPV, IIZIIJ, IJJJJV, IPIPIV, IPIPPV, IPJIIV, IPPIPV, ISSSSV, IZIIPV,
    IZZZZV, PIIIIV, PIIIPI, PIIPIp, PIIPPV, PIPPPI, PPIIIP, PPPIIV, PPPPIp, PPPPPI, PPPPPV,
    // 7
    BBBBFFV, DDDDDDV, FFFFFFV, FFFFFIF, FFFIIIF, FFPPPII, IDDIDDV, IDDIIPV, IFFFFFV, IFFIFFV, IFFIIPV, IIDDDDV, IIFFFFV,
    IIIIIIV, IIIIIPV, IIIIIZV, IIIIPPV, IIIIPZV, IIIIZIV, IIIPIIV, IIIPPIV, IIIPPPV, IIIZIPV, IIJJJJV, IIPJIIV, IPIPIPV,
    PIIIIPp, PIIIPII, PIPPPIp, PPIIIPI, PPIPIIV, PPPPPIp,
    // 8
    BBBBFFFV, FFFFFFIF, FFFIIIBF, FFFIIIIF, IFFFFFFV, IIDDIIPV, IIFFFFPV, IIFFIIPV, IIIIIIIV, IIIIIIPV, IIIIIIZV, IIIIIPIV,
    IIIPIIIV, IIIPPPPV, IIIZIIIV, IIJJIIPV, IIPIIIIV, IIPPPPPI, IIPPPPPV, PPIIIIIV,
    // 9
    FFFFFFFFV, IBBBBFFFV, IIIIIIIIV, IIIIIIIPV, IIIIPIPPV, IIPPPPPPI, PIPPPPPIp,
    // 10
    FFBBBBFFFV, FFPIIPPIII, IFFFFFFFFV, IIIIIIIIIV, IIIIIIIIPV, PIIIPIIIII,
    // 11
    FFFFFFFFFFV, IDDIIDDIIPV, IFFIIFFIIPV, IIIIIIIIIIV, IIIIIIIIIPV,
    // 12
    IFFFFFFFFFFV, IIDDIIDDIIPV, IIFFIIFFIIPV, IIIIIIIIIIPV, IIIPIPPPPPPV, PIIIPIIIIIII,
    // 13
    FFFFFFFFFFFFV, IIIIIIIIIIIIV, IIIIIIIIIIIPV, PIIIPIIIIIIII,
    // 14
    IFFFFFFFFFFFFV,
    // 16
    FFFFFFFFFFFFFFFV, IIIIIIIIIIIIIIIV, PIIIPIIIIIIIIIPI,
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
     * {@return the value layout of the specified character}
     *
     * @param c the character
     * @throws IllegalArgumentException if <i>{@code c}</i> is not a value layout mark.
     */
    public static ValueLayout ofValue(char c) throws IllegalArgumentException {
        return switch (c) {
            case 'B' -> JAVA_BYTE;
            case 'S' -> JAVA_SHORT;
            case 'I' -> JAVA_INT;
            case 'J' -> JAVA_LONG;
            case 'C' -> JAVA_CHAR;
            case 'Z' -> JAVA_BOOLEAN;
            case 'F' -> JAVA_FLOAT;
            case 'D' -> JAVA_DOUBLE;
            case 'P' -> ADDRESS;
            case 'p' -> RuntimeHelper.ADDRESS_UNBOUNDED;
            default ->
                throw new IllegalArgumentException(
                    "Invalid argument c: expected one of B, S, I, J, C, Z, F, D, P or p; got '" + c + '\''
                );
        };
    }

    /**
     * Creates the function descriptor of the string.
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
     * {@return the function descriptor}
     */
    public FunctionDescriptor descriptor() {
        return descriptor;
    }
}
