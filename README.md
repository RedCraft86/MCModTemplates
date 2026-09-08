## Multi-Mod workspace for NeoForge in Minecraft {VERSION}

Open up this folder/workspace as a project in IntelliJ IDEA and get started!

### Adding a mod
To add a mod, simply create a new folder in the directory and implement it the same way `SampleLib` or `SampleMod` is implemented. 
Once finished, make sure to include your new mod in [settings.gradle](settings.gradle) and [_RunAll/build.gradle's](_RunAll/build.gradle) `dependencies` mimicking the examples.

### What is _RunAll (ModRunner)?
It is a simple utility mod that serves no purpose other than requiring other mods in this workspace.
In other words, use it to run all the mods (or multiple) at once!

### Common (Shared) Repositories and Third Party Mods
These can be set up in the root [build.gradle](build.gradle) file. Scroll down to `repositories` and `dependencies` sections to see examples.

### Gradle Commands
The typical Gradle commands you'd use when modding will still work, just slightly different based on your needs.  
(Don't click the fancy play buttons in your IDE unless intended as they will actually run the commands)
- `./gradlew publishToMavenLocal` will locally publish ALL your mods under `/Users/{USERNAME}/.m2/repository/{YOUR.MOD.GROUP}/{MOD}`  
If you want to be specific with which mod you publish, use `./gradlew :{MOD}:publishToMavenLocal`  

- `./gradlew build` will build ALL your mods into `.jar` files under `/{MOD}/build/libs`  
If you want to be specific with which mod you build, use `./gradlew :{MOD}:build`

In both cases, `{MOD}` is what you have named the folder. In this case it will be `SampleLib` or `SampleMod`  
Any other command can be formatted in the same way as well and should work.
