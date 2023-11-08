ThisBuild / version := "0.1.0"
ThisBuild / organization := "io.github.malyszaryczlowiek"
ThisBuild / organizationName := "io.github.malyszaryczlowiek"
ThisBuild / organizationHomepage := Some(url("https://github.com/malyszaryczlowiek/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/malyszaryczlowiek/scala-training-repo"),
    "scm:git@github.com:malyszaryczlowiek/scala-training-repo.git"
  )
)


ThisBuild / description := "Repo to training scala."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/malyszaryczlowiek/scala-training-repo"))



lazy val scala212 = "2.12.16"
lazy val scala213 = "2.13.10"
lazy val scala3   = "3.1.1"



lazy val root = (project in file("."))
  .aggregate(scala_2_12, scala_2_13, scala_3)
  .settings(
    // crossScalaVersions must be set to Nil on the aggregating project
    crossScalaVersions := Nil,
    publish / skip     := true
  )


lazy val commonSettings = Seq(
  name               := "scala-training-repo",
  idePackagePrefix   := Some("io.github.malyszaryczlowiek"),
  libraryDependencies ++= Seq(

    "org.scalactic" %% "scalactic" % "3.2.17",
    "org.scalatest" %% "scalatest" % "3.2.17" % "test"

  )
)


lazy val scala_2_12 = (project in file("scala-2.12"))
  .settings(
    idePackagePrefix   := Some("io.github.malyszaryczlowiek"),
    scalaVersion       := scala212,
    commonSettings,
    libraryDependencies ++= Seq(
    )

    // other settings
  )


lazy val scala_2_13 = (project in file("scala-2.13"))
  .settings(
    idePackagePrefix   := Some("io.github.malyszaryczlowiek"),
    scalaVersion       := scala213,
    commonSettings,
    libraryDependencies ++= Seq(

    )
    // other settings
  )


lazy val scala_3 = (project in file("scala-3"))
  .settings(
    idePackagePrefix   := Some("io.github.malyszaryczlowiek"),
    scalaVersion       := scala3,
    commonSettings,
    libraryDependencies ++= Seq(

      // kafka
//      ("org.apache.kafka" %% "kafka"               % "3.1.0").cross(CrossVersion.for3Use2_13),
//      ("org.apache.kafka" %% "kafka-streams-scala" % "3.1.0").cross(CrossVersion.for3Use2_13),
//
//      // used for serdes
//      ("io.circe" %% "circe-core"    % "0.14.2").cross(CrossVersion.for3Use2_13),
//      ("io.circe" %% "circe-generic" % "0.14.2").cross(CrossVersion.for3Use2_13),
//      ("io.circe" %% "circe-parser"  % "0.14.2").cross(CrossVersion.for3Use2_13)

    )
    // other settings
  )