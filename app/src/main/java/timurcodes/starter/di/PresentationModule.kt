package timurcodes.starter.di

import com.photocheck.di.source.GlobalKoinInjector
import com.photocheck.di.source.KoinInjector
import org.koin.dsl.module

val baseModule = module {
	single<KoinInjector> { GlobalKoinInjector(getKoin()) }
}

val authModule = module {

}

val previewModule = module {
	
}

val presentationModules = arrayOf(
	baseModule, authModule, previewModule
)