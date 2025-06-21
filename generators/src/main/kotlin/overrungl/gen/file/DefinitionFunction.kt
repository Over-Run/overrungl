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

package overrungl.gen.file

/**
 * @author squid233
 * @since 0.1.0
 */
data class DefinitionFunction(
    val returnType: DefinitionType,
    val name: String,
    val parameters: List<DefTypeNamePair>,
    val optional: Boolean,
    val entrypoint: String,
    val body: String?,
    val symbolNotFoundError: String = "SymbolNotFoundError"
) {
    val requireAllocator: Boolean
        get() = returnType is GroupLayoutType
}
