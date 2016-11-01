# PokeDroid
An Android library for v2 of pokeapi.co to use with RxJava.

### Installation
This library can be added to your project with Gradle build system. To achieve that you have to add these lines to your project `build.gradle` file.
```groovy
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
and then in your module `build.gradle` file
```groovy
dependencies {
		compile 'com.github.kbrz:PokeDroid:<version-tag>'
	}
```
List of tags and also the most recent one can be found in the [releases](https://github.com/kbrz/PokeDroid/releases) tab.

### Example usage
Examples below use
[RxAndroid](https://github.com/ReactiveX/RxAndroid) 
and 
[RetroLambda](https://github.com/orfjackal/retrolambda).

Fetching list of berry flavors:
```java
pokeDroid = new PokeDroid();
pokeDroid.getBerriesService().getBerryFlavors(100, 0)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .flatMap((APIResourceList apiResourceList) -> Observable.from(apiResourceList.getResults()))
        .subscribe((ApiResource apiResource) -> Log.d(TAG, apiResource.getUrl()));
```

An example below fetches first 60 pokemons and logs their names.
```java
pokeDroid = new PokeDroid();
pokeDroid.getPokemonsService().getPokemons(60, 0)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .flatMap((APIResourceList apiResourceList) -> Observable.from(apiResourceList.getResults()))
        .concatMap((ApiResource apiResource) -> 
                pokeDroid.getPokemonsService().getPokemon(apiResource.getId())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread()))
        .subscribe((Pokemon pokemon) -> Log.d(TAG, pokemon.getName()));
```

### License
Copyright 2016 Konrad Brzykcy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
