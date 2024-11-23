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

package overrungl.gen

import com.palantir.javapoet.*
import java.lang.invoke.MethodHandles
import javax.lang.model.element.Modifier
import kotlin.io.path.Path

/**
 * @author squid233
 * @since 0.1.0
 */
class StructSpec(
    private val packageName: String,
    className: String,
    private val cType: String?,
    private val javadoc: JavadocProvider?
) {
    val selfClassName: ClassName = ClassName.get(packageName, className)
    private val typeSpecBuilder = TypeSpec.interfaceBuilder(className).addModifiers(Modifier.PUBLIC)
    private val members = ArrayList<StructMemberSpec>()
    private val allocatorInit = CodeBlock.builder()
    private val membersJavadocBuilder = CodeBlock.builder()
    private val layoutJavadocBuilder = CodeBlock.builder()
    val customTypeSpec by lazy {
        CustomTypeSpec(
            MemorySegment_,
            cType,
            null,
            CodeBlock.of("\$T.OF.layout()", selfClassName)
        )
    }
    private var doLast: TypeSpec.Builder.() -> Unit = {}

    init {
        StructRegistration.structs.add(selfClassName)
        if (javadoc != null) {
            typeSpecBuilder.addJavadoc(CodeBlock.builder().also(javadoc.doFirst).build())
        }
        membersJavadocBuilder.add("\n<h2>Members</h2>\n")
        layoutJavadocBuilder.add("\n<h2>Layout</h2>\n{@snippet lang=c:\ntypedef struct ")
        if (cType != null) {
            layoutJavadocBuilder.add("$cType ")
        }
        layoutJavadocBuilder.add("{\n")

        extends(ParameterizedTypeName.get(Struct, selfClassName))
        allocatorInit.add(
            "new \$T<>(\$T.lookup(), \$T.struct()",
            StructAllocator,
            MethodHandles::class.java,
            LayoutBuilder
        )

        typeSpecBuilder.addMethod(
            MethodSpec.methodBuilder("slice")
                .addAnnotation(Override::class.java)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(selfClassName)
                .addParameter(TypeName.LONG, "index")
                .addParameter(TypeName.LONG, "count")
                .build()
        )
        typeSpecBuilder.addMethod(
            MethodSpec.methodBuilder("slice")
                .addAnnotation(Override::class.java)
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(selfClassName)
                .addParameter(TypeName.LONG, "index")
                .build()
        )
    }

    fun extends(typeName: TypeName) {
        typeSpecBuilder.addSuperinterface(typeName)
    }

    private fun addMember(type: CustomTypeSpec, name: String) {
        membersJavadocBuilder.add(
            "\n<h3>$1L</h3>\n<p>{@linkplain #$1L() Getter} - {@linkplain #$1L($2T) Setter}\n",
            name,
            type.carrier
        )
        typeSpecBuilder.addMethod(
            MethodSpec.methodBuilder(name)
                .addJavadoc("{@return {@code \$L}}", name)
                .also {
                    if (type.cType != null) it.addAnnotation(
                        AnnotationSpec.builder(CType).addMember("value", "\$S", type.cType).build()
                    )
                }
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(type.carrier)
                .build())
        typeSpecBuilder.addMethod(
            MethodSpec.methodBuilder(name)
                .addJavadoc(
                    """
                        Sets {@code $1L} with the given value.
                        @return {@code this}
                    """.trimIndent(),
                    name
                )
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(selfClassName)
                .addParameter(
                    ParameterSpec.builder(type.carrier, name).addJavadoc("the value").also {
                        if (type.cType != null) {
                            it.addAnnotation(
                                AnnotationSpec.builder(CType).addMember("value", "\$S", type.cType).build()
                            )
                        }
                    }.build()
                )
                .build()
        )
    }

    operator fun CustomTypeSpec.invoke(name: String) {
        members.add(StructMemberSpec(this, name))
        allocatorInit.add("\$Z.add(\$L, \$S)", this.layout, name)
        layoutJavadocBuilder.add("    $1L $2L; // @link substring=$2S target=#$2L()\n", this.cType, name)
        addMember(this, name)
    }

    fun byValueStruct(structSpec: StructSpec, name: String) {
        members.add(StructMemberSpec(structSpec.customTypeSpec, name))
        allocatorInit.add("\$Z.add(\$L, \$S)", structSpec.customTypeSpec.layout, name)
        layoutJavadocBuilder.add("    \$L \$L;\n", structSpec.cType, name)
        structSpec.members.forEach {
            val memberName = "$name$${it.name}"
            addMember(it.type, memberName)
        }
    }

    fun doLast(action: TypeSpec.Builder.() -> Unit) {
        doLast = action
    }

    fun generate(): GeneratedStruct {
        typeSpecBuilder.addJavadoc(membersJavadocBuilder.build())
        typeSpecBuilder.addJavadoc(layoutJavadocBuilder.add("} ${selfClassName.simpleName()};\n}\n").build())
        if (javadoc != null) {
            typeSpecBuilder.addJavadoc(CodeBlock.builder().also(javadoc.doLast).build())
        }

        typeSpecBuilder.addField(
            FieldSpec.builder(
                ParameterizedTypeName.get(StructAllocator, selfClassName),
                "OF",
                Modifier.PUBLIC,
                Modifier.STATIC,
                Modifier.FINAL
            ).addJavadoc("The struct allocator.").initializer(allocatorInit.add("\$Z.build())").build()).build()
        )

        typeSpecBuilder.also(doLast)

        val typeSpec = typeSpecBuilder.build()
        JavaFile.builder(packageName, typeSpec).addFileComment(fileHeader).build().writeTo(Path("."))
        return GeneratedStruct(typeSpec, this)
    }
}

data class GeneratedStruct(val typeSpec: TypeSpec, val structSpec: StructSpec)

fun struct(
    packageName: String,
    className: String,
    cType: String? = null,
    javadoc: (JavadocProvider.() -> Unit)? = null,
    action: StructSpec.() -> Unit
): GeneratedStruct {
    return StructSpec(packageName, className, cType, javadoc?.let { JavadocProvider().also(it) })
        .also(action)
        .generate()
}

class StructMemberSpec(val type: CustomTypeSpec, val name: String)

object StructRegistration {
    internal val structs = ArrayList<ClassName>()
    fun generate(packageName: String, className: String) {
        JavaFile.builder(
            packageName, TypeSpec.classBuilder(className)
                .addModifiers(Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build())
                .addMethod(
                    MethodSpec.methodBuilder("registerAll").addModifiers(Modifier.STATIC).returns(TypeName.VOID)
                        .also { m ->
                            structs.forEach {
                                m.addStatement("$1T.registerStruct($2T.class, $2T.OF)", ProcessorTypes, it)
                            }
                        }
                        .build()
                )
                .build()
        ).addFileComment(fileHeader).addStaticImport(ProcessorTypes, "registerStruct").build().writeTo(Path("."))
    }
}
