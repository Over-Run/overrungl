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

public enum VkResult implements overrun.marshal.CEnum {
    /**
     * Command completed successfully
     */
    SUCCESS(0),
    /**
     * A fence or query has not yet completed
     */
    NOT_READY(1),
    /**
     * A wait operation has not completed in the specified time
     */
    TIMEOUT(2),
    /**
     * An event is signaled
     */
    EVENT_SET(3),
    /**
     * An event is unsignaled
     */
    EVENT_RESET(4),
    /**
     * A return array was too small for the result
     */
    INCOMPLETE(5),
    /**
     * A host memory allocation has failed
     */
    ERROR_OUT_OF_HOST_MEMORY(-1),
    /**
     * A device memory allocation has failed
     */
    ERROR_OUT_OF_DEVICE_MEMORY(-2),
    /**
     * Initialization of an object has failed
     */
    ERROR_INITIALIZATION_FAILED(-3),
    /**
     * The logical device has been lost. See <<devsandqueues-lost-device>>
     */
    ERROR_DEVICE_LOST(-4),
    /**
     * Mapping of a memory object has failed
     */
    ERROR_MEMORY_MAP_FAILED(-5),
    /**
     * Layer specified does not exist
     */
    ERROR_LAYER_NOT_PRESENT(-6),
    /**
     * Extension specified does not exist
     */
    ERROR_EXTENSION_NOT_PRESENT(-7),
    /**
     * Requested feature is not available on this device
     */
    ERROR_FEATURE_NOT_PRESENT(-8),
    /**
     * Unable to find a Vulkan driver
     */
    ERROR_INCOMPATIBLE_DRIVER(-9),
    /**
     * Too many objects of the type have already been created
     */
    ERROR_TOO_MANY_OBJECTS(-10),
    /**
     * Requested format is not supported on this device
     */
    ERROR_FORMAT_NOT_SUPPORTED(-11),
    /**
     * A requested pool allocation has failed due to fragmentation of the pool's memory
     */
    ERROR_FRAGMENTED_POOL(-12),
    /**
     * An unknown error has occurred, due to an implementation or application bug
     */
    ERROR_UNKNOWN(-13),
    ;
    private final int value;
    VkResult(int value) { this.value = value; }
    @Override public int value() { return value; }
}
