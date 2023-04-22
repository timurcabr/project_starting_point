package timurcodes.starter

import android.app.Application
import timurcodes.starter.di.domainModule
import timurcodes.starter.di.networkModule
import timurcodes.starter.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import timurcodes.starter.di.presentationModules
import timurcodes.starter.di.source.sourceModule
import timurcodes.starter.di.storageModule

class ProjectApplication : Application() {
	
	override fun onCreate() {
		super.onCreate()
		instance = this
		GlobalContext.startKoin {
			androidLogger()
			androidContext(this@ProjectApplication)
			modules(*presentationModules + sourceModule + storageModule + repositoryModule + domainModule + networkModule)
		}
	}
	
	companion object {
		lateinit var instance: ProjectApplication
			private set
	}
}