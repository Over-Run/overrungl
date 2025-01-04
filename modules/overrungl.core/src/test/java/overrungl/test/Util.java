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

/**
 * @author squid233
 * @since 0.1.0
 */
public class Util {
    public static final String TEST_STRING_U8 = "Lorem ipsum odor amet, consectetuer adipiscing elit.";
    public static final char[] TEST_CHAR_ARR = {'L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm'};
    public static final byte[] TEST_BYTE_ARR = {-128, -1, 0, 1, 127};
    public static final short[] TEST_SHORT_ARR = {Short.MIN_VALUE, -2, 0, 2, Short.MAX_VALUE};
    public static final int[] TEST_INT_ARR = {Integer.MIN_VALUE, -3, 0, 3, Integer.MAX_VALUE};
    public static final long[] TEST_LONG_ARR = {Long.MIN_VALUE, -4, 0, 4, Long.MAX_VALUE};
    public static final float[] TEST_FLOAT_ARR = {Float.MIN_VALUE, -5.1f, 0, 5.1f, Float.MAX_VALUE, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY};
    public static final double[] TEST_DOUBLE_ARR = {Double.MIN_VALUE, -6.2, 0, 6.2, Double.MAX_VALUE, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
    public static final String[] TEST_STRING_ARR = {
        "Lorem ipsum odor amet, consectetuer adipiscing elit.",
        "Dictum ultricies maecenas primis primis; vehicula imperdiet consequat.",
        "Ullamcorper curabitur vel nam nisl id iaculis.",
        "Odio purus a metus posuere fusce.",
        "Consectetur leo condimentum turpis nullam odio quam dictum iaculis tristique."
    };
}
