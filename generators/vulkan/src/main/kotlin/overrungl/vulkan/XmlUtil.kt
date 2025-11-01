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

import org.w3c.dom.Attr
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import javax.xml.xpath.XPathConstants

inline fun NodeList.forEach(action: (Node) -> Unit) {
    for (i in 0 until length) {
        action(item(i))
    }
}

inline fun NodeList.forEachElement(action: (Element) -> Unit) {
    forEach { action(it as Element) }
}

fun Node.findAll(expression: String): NodeList? =
    xpath.evaluate(expression, this, XPathConstants.NODESET) as NodeList?

fun Node.find(expression: String): Node? =
    findAll(expression)?.item(0)

fun Element.keys(): List<String> {
    val list = mutableListOf<String>()
    for (i in 0 until attributes.length) {
        val attr = attributes.item(i) as Attr
        list.add(attr.name)
    }
    return list
}

fun Element.getAttributeOr(name: String, defaultValue: String): String =
    if (hasAttribute(name)) getAttribute(name)
    else defaultValue
