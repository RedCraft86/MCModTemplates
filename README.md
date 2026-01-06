## Multi-Mod workspace for NeoForge in Minecraft 1.21.1

Open up this folder as a project in IntelliJ IDEA and get started!

### Adding a mod
To add a mod, simply create a new folder in the directory and implement it the same way `SampleLib` or `SampleMod` is implemented. 
Once finished, make sure to include your new mod in [settings.gradle](settings.gradle) and [_RunAll/build.gradle](_RunAll/build.gradle) → `dependencies` mimicking the examples.

### What is _RunAll (ModRunner)?
It is a simple utility mod that serves no purpose other than requiring other mods in this workspace.
In other words, use it to run all the mods (or multiple) at once!

### Common (Shared) Repositories and Third Party Mods
These can be set up in the root [build.gradle](build.gradle) file. Scroll down to `repositories` and `dependencies` sections to see examples.

### Gradle Commands
The typical Gradle commands you'd use when modding will still work, just slightly different based on your needs.  
(Don't click the fancy play buttons unless intended as they will actually run the commands)
- `./gradlew publishToMavenLocal` will locally publish ALL your mods under `/Users/USERNAME/.m2/repository/YOUR_MOD_GROUP/ModName`  
If you want to be specific with which mod you publish, use `./gradlew :ModName:publishToMavenLocal`  
<br>
- `./gradlew build` will build ALL your mods into `.jar` files under `/ModName/build/libs`  
If you want to be specific with which mod you build, use `./gradlew :ModName:build`

In both cases, `ModName` is what you have named the folder. In this case it will be `SampleLib` or `SampleMod`  
Any other command can be formatted in the same way as well and should work.
