---
layout: page
title: Composing and building executable tutorial docs
---


The `build.sbt` configuration defines the source for tutorial documentation as `src/main/tut` and the output directory as `docs` which our github repo has configured to be the source for `ghpages`.

 Documentation is generated from sbt with the command


    crossedJVM/tut

In addition to content placed in the `docs` directory by this command, we've manually added the API output in `jvm/target/scala-2.12/api`.


## Executable code in tutorial documentation

This block demonstrates that it's possible to execute code automatically while building documentation.

Compare the source markdown file in `shared/src/main/tut/tut.md` with the rendered page to see how this works.

Here's how to import the library:

```tut:silent
import edu.holycross.shot.skelly._
```
