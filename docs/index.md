#  Tutorial documentation



## API documentation

API documentation was generated with the sbt command

    crossedJVM/doc

## Tutorial documentation and `ghpages` web site

The source for tutorial documentation is defined as `src/main/tut`.  Documentation is generated from sbt with the command


    crossedJVM/tut

Output is configured to go into `docs`, which is defined in the github repo's configuration to be the source for `ghpages`.

In addition, the API output in `jvm/target/scala-2.12/api` was then manually added to `docs`.



## Executable code in tutorial documentation

This block demonstrates that it's possible to execute code automatically while building documentation.

Import the library:

```scala
import edu.holycross.shot.skelly._
```
