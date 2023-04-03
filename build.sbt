ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "MultiModuleProject"
  )
  .aggregate(module1,module2,commonModule)

lazy val module1=project.dependsOn(module2)
lazy val module2=project


lazy val commonModule=project.dependsOn(module1,module2)
