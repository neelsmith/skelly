---
layout: page
title: Cross building and publishing
---

The main `build.sbt` defines separate projects for the JVM and for Javascript.  It also defines cross building for multiple versions of Scala.

Building or publishing:  `sbt +package` or  `sbt +publish`

Running: `sbt crossedJVM/run`

Note:  the current version
