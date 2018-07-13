scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint:-unused,_"
)

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

//this is custom for the firstbird build to publish to our bintray
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.0.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.2")
