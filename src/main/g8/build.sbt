name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.3"

crossScalaVersions := Seq("2.10.3", "2.11.0-M8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.RC1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

libraryDependencies ++= {
  val akkaV = "2.3.3"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %   "spray-can"            % sprayV,
    "io.spray"            %   "spray-routing"        % sprayV,
    "io.spray"            %   "spray-testkit"        % sprayV,
    "io.spray"            %%  "spray-json"           % "1.2.6",
    "com.typesafe.akka"   %%  "akka-actor"           % akkaV,
    "com.typesafe.akka"   %%  "akka-slf4j"           % akkaV,
    "ch.qos.logback"      %   "logback-classic"      % "1.1.1"
  )
}

initialCommands := "import $organization$.$name;format="lower,word"$._"

seq(Revolver.settings: _*) // for sbt-revolver
