package timurcodes.starter.di

import org.koin.core.qualifier.Qualifier
import org.koin.core.qualifier.QualifierValue

object GoogleRetrofit : Qualifier {
	
	override val value: QualifierValue
		get() = "google_retrofit"
}