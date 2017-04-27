package org.bubenheimer.dagger.app;

import org.bubenheimer.dagger.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class AppModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();
}
