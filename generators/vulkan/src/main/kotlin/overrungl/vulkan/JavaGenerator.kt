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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.vulkan

import org.w3c.dom.Element

class JavaGenerator : BaseGenerator() {
    override fun beginFeature(interfaceElem: Element, emit: Boolean) {
        super.beginFeature(interfaceElem, emit)
    }

    override fun endFeature() {
        super.endFeature()
    }

    override fun genCmd(cmdInfo: CmdInfo, name: String, alias: String?) {
        super.genCmd(cmdInfo, name, alias)
    }

    override fun genGroup(groupInfo: GroupInfo, groupName: String, alias: String?) {
        super.genGroup(groupInfo, groupName, alias)
    }

    override fun genType(typeInfo: TypeInfo, typeName: String, alias: String?) {
        super.genType(typeInfo, typeName, alias)
    }

    override fun genStruct(typeInfo: TypeInfo, typeName: String, alias: String?) {
        super.genStruct(typeInfo, typeName, alias)
    }

    override fun genEnum(enumInfo: EnumInfo, typeName: String, alias: String?) {
        super.genEnum(enumInfo, typeName, alias)
    }
}
