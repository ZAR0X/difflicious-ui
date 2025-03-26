enablePlugins(ScalaJSPlugin)
enablePlugins(GhpagesPlugin)

git.remoteRepo := "git@github.com:ZAR0X/difflicious-ui.git"

ghpagesNoJekyll := true

name := "difflicious-ui"
version := "0.1"
scalaVersion := "3.3.1"

scalacOptions += "-deprecation"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.6.0",
  "com.raquo" %%% "laminar" % "15.0.0",
  "com.github.jatcwang" %% "difflicious-core" % "0.4.3",
  "com.softwaremill.sttp.client3" %%% "core" % "3.8.0"
)



// mainClass := Some("ui.DiffliciousUI")