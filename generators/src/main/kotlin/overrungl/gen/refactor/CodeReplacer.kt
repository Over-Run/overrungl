/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.gen.refactor

import overrungl.gen.GENERATOR_BEGIN
import overrungl.gen.GENERATOR_END

fun replaceCode(originalCode: String, replacingCode: String): String {
    check(originalCode.indexOf(GENERATOR_BEGIN) != -1 && originalCode.indexOf(GENERATOR_END) != -1) { "Generator region not found" }
    val split = originalCode.split(GENERATOR_BEGIN, GENERATOR_END)
    return "${split[0]}$GENERATOR_BEGIN\n$replacingCode    $GENERATOR_END${split[2]}"
}
