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

package overrungl.test;

import org.junit.jupiter.api.Test;
import overrungl.util.Unmarshal;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;
import static org.junit.jupiter.api.Assertions.*;
import static overrungl.test.Util.*;

/**
 * @author squid233
 * @since 0.1.0
 */
public class UnmarshalTest {
    @Test
    void unmarshalAsString() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocateFrom(TEST_STRING_U8);
            assertEquals(TEST_STRING_U8, Unmarshal.unmarshalAsString(segment));
        }
    }

    @Test
    void unmarshalStringPointer() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocateFrom(ADDRESS, arena.allocateFrom(TEST_STRING_U8));
            assertEquals(TEST_STRING_U8, Unmarshal.unmarshalStringPointer(segment));
        }
    }

    @Test
    void unmarshalPointer() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocateFrom(ADDRESS, arena.allocateFrom(JAVA_INT, 42));
            assertEquals(42, Unmarshal.unmarshalPointer(segment).reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0));
        }
    }

    @Test
    void unmarshalAsArray() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment c = arena.allocateFrom(JAVA_CHAR, TEST_CHAR_ARR);
            assertArrayEquals(TEST_CHAR_ARR, Unmarshal.unmarshalAsCharArray(c));
            MemorySegment b = arena.allocateFrom(JAVA_BYTE, TEST_BYTE_ARR);
            assertArrayEquals(TEST_BYTE_ARR, Unmarshal.unmarshalAsByteArray(b));
            MemorySegment s = arena.allocateFrom(JAVA_SHORT, TEST_SHORT_ARR);
            assertArrayEquals(TEST_SHORT_ARR, Unmarshal.unmarshalAsShortArray(s));
            MemorySegment i = arena.allocateFrom(JAVA_INT, TEST_INT_ARR);
            assertArrayEquals(TEST_INT_ARR, Unmarshal.unmarshalAsIntArray(i));
            MemorySegment l = arena.allocateFrom(JAVA_LONG, TEST_LONG_ARR);
            assertArrayEquals(TEST_LONG_ARR, Unmarshal.unmarshalAsLongArray(l));
            MemorySegment f = arena.allocateFrom(JAVA_FLOAT, TEST_FLOAT_ARR);
            assertArrayEquals(TEST_FLOAT_ARR, Unmarshal.unmarshalAsFloatArray(f));
            MemorySegment d = arena.allocateFrom(JAVA_DOUBLE, TEST_DOUBLE_ARR);
            assertArrayEquals(TEST_DOUBLE_ARR, Unmarshal.unmarshalAsDoubleArray(d));
        }
    }

    @Test
    void unmarshalAsAddressArray() {
        /*
        int* arr[10];
        arr[i] = new int(i);
         */
        final int count = 10;
        final AddressLayout defLayout = ADDRESS.withTargetLayout(JAVA_INT);
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(ADDRESS, count);
            for (int i = 0; i < count; i++) {
                MemorySegment p = arena.allocateFrom(JAVA_INT, i);
                segment.setAtIndex(ADDRESS, i, p);
            }

            MemorySegment[] newArr = Unmarshal.unmarshalAsAddressArray(segment);
            assertNotNull(newArr);
            assertEquals(count, newArr.length);
            for (int i = 0; i < count; i++) {
                assertEquals(segment.getAtIndex(defLayout, i).get(JAVA_INT, 0),
                    newArr[i].reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0));
            }
        }
    }

    @Test
    void unmarshalAsStringArray() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(ADDRESS, TEST_STRING_ARR.length);
            for (int i = 0; i < TEST_STRING_ARR.length; i++) {
                segment.setAtIndex(ADDRESS, i, arena.allocateFrom(TEST_STRING_ARR[i]));
            }
            assertArrayEquals(TEST_STRING_ARR, Unmarshal.unmarshalAsStringArray(segment));
        }
    }

    @Test
    void copy() {
        try (Arena arena = Arena.ofConfined()) {
            char[] ca = new char[TEST_CHAR_ARR.length];
            MemorySegment c = arena.allocateFrom(JAVA_CHAR, TEST_CHAR_ARR);
            Unmarshal.copy(c, ca);
            assertArrayEquals(TEST_CHAR_ARR, ca);

            byte[] ba = new byte[TEST_BYTE_ARR.length];
            MemorySegment b = arena.allocateFrom(JAVA_BYTE, TEST_BYTE_ARR);
            Unmarshal.copy(b, ba);
            assertArrayEquals(TEST_BYTE_ARR, ba);

            short[] sa = new short[TEST_SHORT_ARR.length];
            MemorySegment s = arena.allocateFrom(JAVA_SHORT, TEST_SHORT_ARR);
            Unmarshal.copy(s, sa);
            assertArrayEquals(TEST_SHORT_ARR, sa);

            int[] ia = new int[TEST_INT_ARR.length];
            MemorySegment i = arena.allocateFrom(JAVA_INT, TEST_INT_ARR);
            Unmarshal.copy(i, ia);
            assertArrayEquals(TEST_INT_ARR, ia);

            long[] la = new long[TEST_LONG_ARR.length];
            MemorySegment l = arena.allocateFrom(JAVA_LONG, TEST_LONG_ARR);
            Unmarshal.copy(l, la);
            assertArrayEquals(TEST_LONG_ARR, la);

            float[] fa = new float[TEST_FLOAT_ARR.length];
            MemorySegment f = arena.allocateFrom(JAVA_FLOAT, TEST_FLOAT_ARR);
            Unmarshal.copy(f, fa);
            assertArrayEquals(TEST_FLOAT_ARR, fa);

            double[] da = new double[TEST_DOUBLE_ARR.length];
            MemorySegment d = arena.allocateFrom(JAVA_DOUBLE, TEST_DOUBLE_ARR);
            Unmarshal.copy(d, da);
            assertArrayEquals(TEST_DOUBLE_ARR, da);
        }
    }

    @Test
    void copyAddressArray() {
        final int count = 10;
        final AddressLayout defLayout = ADDRESS.withTargetLayout(JAVA_INT);
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment[] arr = new MemorySegment[count];
            MemorySegment segment = arena.allocate(ADDRESS, count);
            for (int i = 0; i < count; i++) {
                segment.setAtIndex(ADDRESS, i, arena.allocateFrom(JAVA_INT, i));
            }
            Unmarshal.copy(segment, arr);
            for (int i = 0; i < count; i++) {
                assertEquals(segment.getAtIndex(defLayout, i).get(JAVA_INT, 0),
                    arr[i].reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0));
            }
        }
    }

    @Test
    void copyStringArray() {
        try (Arena arena = Arena.ofConfined()) {
            String[] arr = new String[TEST_STRING_ARR.length];
            MemorySegment segment = arena.allocate(ADDRESS, TEST_STRING_ARR.length);
            for (int i = 0; i < TEST_STRING_ARR.length; i++) {
                segment.setAtIndex(ADDRESS, i, arena.allocateFrom(TEST_STRING_ARR[i]));
            }
            Unmarshal.copy(segment, arr);
            assertArrayEquals(TEST_STRING_ARR, arr);
        }
    }
}
