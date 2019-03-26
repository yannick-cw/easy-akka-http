import sbt._

object Dependencies {
  val ScalaTestVersion     = "3.0.7"
  val AkkaHttpVersion      = "10.1.8"
  val CatsEffectVersion    = "1.2.0"
  val AkkaVersion          = "2.5.21"
  val CirceVersion         = "0.11.1"
  val AkkaHttpCirceVersion = "1.25.2"
  val RefinedVersion       = "0.9.4"

  lazy val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-refined",
    "io.circe" %% "circe-parser"
  ).map(_ % CirceVersion)

  lazy val akkaHttpCirce = Seq(
    "de.heikoseeberger" %% "akka-http-circe" % AkkaHttpCirceVersion
  )

  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % ScalaTestVersion % Test
  )

  lazy val cats = Seq(
    "org.typelevel" %% "cats-effect" % CatsEffectVersion
  )

  lazy val refined = Seq(
    "eu.timepit" %% "refined"            % RefinedVersion,
    "eu.timepit" %% "refined-pureconfig" % RefinedVersion
  )

  lazy val akkaHttpDependencies = Seq(
    "com.typesafe.akka" %% "akka-http"           % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream"         % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-testkit"   % AkkaHttpVersion % Test
  )
}
