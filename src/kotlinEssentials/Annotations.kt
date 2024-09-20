@file:JvmName("InteropFish")
package kotlinEssentials

//import kotlin.reflect.full.declaredMemberFunctions
//import kotlin.reflect.full.findAnnotation
//
//class InteropFish { companion object { @JvmStatic fun interop() {} } }
//
//class Plant {
//    fun trim() {}
//    fun fertilize() {}
//
//    @get:OnGet
//    val isGrowing = true
//    @set:OnSet
//    var needsFood = false
//}
//
//annotation class ImAPlant
//
//@Target(AnnotationTarget.PROPERTY_GETTER)
//annotation class OnGet
//@Target(AnnotationTarget.PROPERTY_SETTER)
//annotation class OnSet
//
//fun reflections() {
//    val classObj = Plant::class
//    //print all annotations
//    for (method in classObj.declaredMemberFunctions) { println(method.name) }
//
//    for (annotation in classObj.annotations) { println(annotation.annotationClass.simpleName) }
//
//    //find one annotation, or null
//    val annotated = classObj.findAnnotation<ImAPlant>()
//
//    annotated?.apply { println("Found a plant annotation!") }
//}