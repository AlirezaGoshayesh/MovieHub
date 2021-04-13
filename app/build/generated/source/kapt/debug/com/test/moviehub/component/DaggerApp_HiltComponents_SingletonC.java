// Generated by Dagger (https://dagger.dev).
package com.test.moviehub.component;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.test.moviehub.component.activities.MainActivity;
import com.test.moviehub.component.adapters.SearchResultsAdapter;
import com.test.moviehub.component.fragments.SearchFragment;
import com.test.moviehub.component.fragments.SearchFragment_MembersInjector;
import com.test.moviehub.component.viewModels.SearchMoviesVM;
import com.test.moviehub.component.viewModels.SearchMoviesVM_HiltModules_KeyModule_ProvideFactory;
import com.test.moviehub.data.remote.RemoteDataSourceImpl;
import com.test.moviehub.data.remote.connection.AuthTokenInterceptor;
import com.test.moviehub.data.remote.connection.MService;
import com.test.moviehub.di.DataModule;
import com.test.moviehub.di.DataModule_ProvideErrorHandlerFactory;
import com.test.moviehub.di.DataModule_ProvideRepositoryFactory;
import com.test.moviehub.di.NetworkModule;
import com.test.moviehub.di.NetworkModule_ProvideGsonFactoryFactory;
import com.test.moviehub.di.NetworkModule_ProvideHttpLoggingInterceptorFactory;
import com.test.moviehub.di.NetworkModule_ProvideStickersServiceFactory;
import com.test.moviehub.di.NetworkModule_ProvidesOkHttpClientFactory;
import com.test.moviehub.domain.GetDetails;
import com.test.moviehub.domain.Repository;
import com.test.moviehub.domain.SearchMovies;
import com.test.moviehub.domain.exceptions.IErrorHandler;
import com.vada.parents.component.viewModels.GetDetailsVM;
import com.vada.parents.component.viewModels.GetDetailsVM_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object gsonConverterFactory = new MemoizedSentinel();

  private volatile Object mService = new MemoizedSentinel();

  private volatile Object repository = new MemoizedSentinel();

  private volatile Object iErrorHandler = new MemoizedSentinel();

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private HttpLoggingInterceptor httpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor();
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesOkHttpClientFactory.providesOkHttpClient(httpLoggingInterceptor(), new AuthTokenInterceptor());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private GsonConverterFactory gsonConverterFactory() {
    Object local = gsonConverterFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gsonConverterFactory;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideGsonFactoryFactory.provideGsonFactory();
          gsonConverterFactory = DoubleCheck.reentrantCheck(gsonConverterFactory, local);
        }
      }
    }
    return (GsonConverterFactory) local;
  }

  private MService mService() {
    Object local = mService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = mService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideStickersServiceFactory.provideStickersService(okHttpClient(), ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), gsonConverterFactory());
          mService = DoubleCheck.reentrantCheck(mService, local);
        }
      }
    }
    return (MService) local;
  }

  private RemoteDataSourceImpl remoteDataSourceImpl() {
    return new RemoteDataSourceImpl(mService());
  }

  private Repository repository() {
    Object local = repository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = repository;
        if (local instanceof MemoizedSentinel) {
          local = DataModule_ProvideRepositoryFactory.provideRepository(remoteDataSourceImpl());
          repository = DoubleCheck.reentrantCheck(repository, local);
        }
      }
    }
    return (Repository) local;
  }

  private IErrorHandler iErrorHandler() {
    Object local = iErrorHandler;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iErrorHandler;
        if (local instanceof MemoizedSentinel) {
          local = DataModule_ProvideErrorHandlerFactory.provideErrorHandler();
          iErrorHandler = DoubleCheck.reentrantCheck(iErrorHandler, local);
        }
      }
    }
    return (IErrorHandler) local;
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataModule(DataModule dataModule) {
      Preconditions.checkNotNull(dataModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Set<String> keySetSetOfString() {
        return SetBuilder.<String>newSetBuilder(2).add(GetDetailsVM_HiltModules_KeyModule_ProvideFactory.provide()).add(SearchMoviesVM_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
      }

      private Set<ViewModelProvider.Factory> defaultActivityViewModelFactorySetOfViewModelProviderFactory(
          ) {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), keySetSetOfString(), new ViewModelCBuilder(), defaultActivityViewModelFactorySetOfViewModelProviderFactory(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends App_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
        }

        private Set<ViewModelProvider.Factory> defaultFragmentViewModelFactorySetOfViewModelProviderFactory(
            ) {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public void injectSearchFragment(SearchFragment searchFragment) {
          injectSearchFragment2(searchFragment);
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.keySetSetOfString(), new ViewModelCBuilder(), ActivityCImpl.this.defaultActivityViewModelFactorySetOfViewModelProviderFactory(), defaultFragmentViewModelFactorySetOfViewModelProviderFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private SearchFragment injectSearchFragment2(SearchFragment instance) {
          SearchFragment_MembersInjector.injectSearchResultsAdapter(instance, new SearchResultsAdapter());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends App_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public App_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
      private volatile Provider<GetDetailsVM> getDetailsVMProvider;

      private volatile Provider<SearchMoviesVM> searchMoviesVMProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private GetDetails getDetails() {
        return new GetDetails(DaggerApp_HiltComponents_SingletonC.this.repository(), DaggerApp_HiltComponents_SingletonC.this.iErrorHandler());
      }

      private GetDetailsVM getDetailsVM() {
        return new GetDetailsVM(getDetails());
      }

      private Provider<GetDetailsVM> getDetailsVMProvider() {
        Object local = getDetailsVMProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          getDetailsVMProvider = (Provider<GetDetailsVM>) local;
        }
        return (Provider<GetDetailsVM>) local;
      }

      private SearchMovies searchMovies() {
        return new SearchMovies(DaggerApp_HiltComponents_SingletonC.this.repository());
      }

      private SearchMoviesVM searchMoviesVM() {
        return new SearchMoviesVM(searchMovies());
      }

      private Provider<SearchMoviesVM> searchMoviesVMProvider() {
        Object local = searchMoviesVMProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          searchMoviesVMProvider = (Provider<SearchMoviesVM>) local;
        }
        return (Provider<SearchMoviesVM>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.vada.parents.component.viewModels.GetDetailsVM", (Provider) getDetailsVMProvider()).put("com.test.moviehub.component.viewModels.SearchMoviesVM", (Provider) searchMoviesVMProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.vada.parents.component.viewModels.GetDetailsVM 
            return (T) ViewModelCImpl.this.getDetailsVM();

            case 1: // com.test.moviehub.component.viewModels.SearchMoviesVM 
            return (T) ViewModelCImpl.this.searchMoviesVM();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
