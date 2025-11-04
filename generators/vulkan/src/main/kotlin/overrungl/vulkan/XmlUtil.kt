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
import java.io.StringWriter
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

private val transformer = TransformerFactory.newInstance()
    .newTransformer()
    .also {
        it.setOutputProperty(OutputKeys.INDENT, "yes")
        it.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4")
    }

inline fun NodeList.forEach(action: (Node) -> Unit) {
    for (i in 0 until length) {
        action(item(i))
    }
}

inline fun NodeList.forEachElement(action: (Element) -> Unit) {
    forEach { action(it as Element) }
}

fun NodeList.toList(): List<Node> {
    val list = mutableListOf<Node>()
    for (i in 0 until length) {
        list.add(item(i))
    }
    return list
}

fun NodeList.toElementList(): List<Element> {
    return toList().map { it as Element }
}

inline fun Node.forEachImmediateChildren(copy: Boolean = false, action: (Element) -> Unit) {
    if (copy) {
        childNodes.toList().forEach {
            if (it is Element) {
                action(it)
            }
        }
    } else {
        childNodes.forEach {
            if (it is Element) {
                action(it)
            }
        }
    }
}

inline fun Node.forEachNamedImmediateTags(name: String, copy: Boolean = false, action: (Element) -> Unit) {
    forEachImmediateChildren(copy = copy) {
        if (it.tagName == name) {
            action(it)
        }
    }
}

inline fun Node.forEachChildrenChildren(childName: String, childChildName: String, action: (Element) -> Unit) {
    forEachNamedImmediateTags(childName) { child ->
        child.forEachNamedImmediateTags(childChildName) {
            action(it)
        }
    }
}

inline fun Node.forEachChildrenChildrenWithAttr(
    childName: String,
    childChildName: String,
    childChildAttr: String,
    action: (Element) -> Unit
) {
    forEachChildrenChildren(childName, childChildName) {
        if (it.hasAttribute(childChildAttr)) {
            action(it)
        }
    }
}

fun Node.findChild(childName: String): Element? {
    forEachNamedImmediateTags(childName) {
        return it
    }
    return null
}

fun Node.findChildren(childName: String): List<Element> {
    val list = mutableListOf<Element>()
    forEachNamedImmediateTags(childName) {
        if (it.tagName == childName) {
            list.add(it)
        }
    }
    return list
}

fun Node.findChildChild(childName: String, childChildName: String): Element? {
    forEachNamedImmediateTags(childName) { child ->
        child.forEachNamedImmediateTags(childChildName) {
            return it
        }
    }
    return null
}

fun Node.findChildChildren(childName: String, childChildName: String): NodeList? {
    forEachNamedImmediateTags(childName) { child ->
        return child.getElementsByTagName(childChildName)
    }
    return null
}

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

fun Element.getAttributeOrNull(name: String): String? =
    if (hasAttribute(name)) getAttribute(name)
    else null

fun Node.dump(): String {
    val writer = StringWriter()
    transformer.transform(DOMSource(this), StreamResult(writer))
    return writer.toString()
}
