organization := "com.lunatech"

name := "specs2-elastic"

description := "Tools that allow specs2 tests to use their own MongoDB instance"

crossScalaVersions := Seq("2.10.5", "2.11.6")

libraryDependencies ++= Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-core" % "1.7.4",
  "com.sksamuel.elastic4s" %% "elastic4s-testkit" % "1.7.4"
)

publishTo  := {
  val artifactory = "http://artifactory.lunatech.com/artifactory/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("releases" at artifactory + "snapshots-public")
  else
    Some("snapshots" at artifactory + "releases-public")
}

releaseSettings