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

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan;

public enum VkSubpassMergeStatusEXT implements overrun.marshal.CEnum {
    MERGED(0),
    DISALLOWED(1),
    NOT_MERGED_SIDE_EFFECTS(2),
    NOT_MERGED_SAMPLES_MISMATCH(3),
    NOT_MERGED_VIEWS_MISMATCH(4),
    NOT_MERGED_ALIASING(5),
    NOT_MERGED_DEPENDENCIES(6),
    NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT(7),
    NOT_MERGED_TOO_MANY_ATTACHMENTS(8),
    NOT_MERGED_INSUFFICIENT_STORAGE(9),
    NOT_MERGED_DEPTH_STENCIL_COUNT(10),
    NOT_MERGED_RESOLVE_ATTACHMENT_REUSE(11),
    NOT_MERGED_SINGLE_SUBPASS(12),
    NOT_MERGED_UNSPECIFIED(13),
    ;
    private final int value;
    VkSubpassMergeStatusEXT(int value) { this.value = value; }
    @Override public int value() { return value; }
}
