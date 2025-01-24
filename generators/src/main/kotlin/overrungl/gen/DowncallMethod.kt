/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.gen

enum class AllocatorRequirement {
    NO,
    STACK,
    BY_VALUE_SEGMENT_ALLOCATOR,
    SEGMENT_ALLOCATOR,
    ARENA;

    fun stricter(other: AllocatorRequirement): AllocatorRequirement {
        return if (other > this) other else this
    }
}

