val scala3Version = "3.4.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kevi-scala",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.9.0", // 最新の安定版バージョンを使用
      "org.typelevel" %% "cats-effect" % "3.4.8", // 最新の安定版バージョンを使用
      "org.wvlet.airframe" %% "airframe" % "22.5.0", // Scala 3に対応する最新バージョン
      "org.scalameta" %% "munit" % "1.0.0" % Test
    )
  )
