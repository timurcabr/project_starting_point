package timurcodes.starter.data.ext

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class ExtractObject(val fieldName: String)