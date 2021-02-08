# MinecraftSkinViewer

<img src="https://github.com/luthfipun/MinecraftSkinViewer/blob/master/Screenshot_20210208_100226.png" width="300" />

### Install
Add it in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Add the dependency

```
dependencies {
  def minecraftSkinViewer = '2.0'
  implementation "com.github.luthfipun:MinecraftSkinViewer:$minecraftSkinViewer"
}
```
