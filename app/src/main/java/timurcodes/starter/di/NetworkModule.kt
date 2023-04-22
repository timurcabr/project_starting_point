package timurcodes.starter.di

import com.google.gson.GsonBuilder
import org.koin.dsl.module

private const val API_CONNECT_TIMEOUT = 15L
private const val API_READ_WRITE_TIMEOUT = 30L

val networkModule = module {
	
	single {
		GsonBuilder().setPrettyPrinting().serializeNulls().create()
	}
	
//	single {
//		OkHttpClient.Builder()
//			.addInterceptor(ApiKeyInterceptor())
//			.addInterceptor(SessionIdInterceptor(get()))
//			.addInterceptor(
//				HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//			)
//			.connectTimeout(API_CONNECT_TIMEOUT, TimeUnit.SECONDS)
//			.writeTimeout(API_READ_WRITE_TIMEOUT, TimeUnit.SECONDS)
//			.readTimeout(API_READ_WRITE_TIMEOUT, TimeUnit.SECONDS)
//			.build()
//	}
	
//	factory { parameters: ParametersHolder ->
//		val path = parameters.getOrNull<String>()
//		Retrofit.Builder()
//			.client(get())
//			.baseUrl("${BuildConfig.API_GATEWAY}/$path/")
//			.addConverterFactory(RetrofitConverterFactory(get()))
//			.addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
//			.build()
//	}
	
}