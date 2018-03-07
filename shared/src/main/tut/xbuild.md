---
layout: page
title: Cross building
---

The main `build.sbt` defines separate projects for the JVM and for Javascript.  It also defines cross building for multiple versions of Scala.

Testing:  `sbt +test`

Running: `sbt crossedJVM/run`

Note:  the current version
