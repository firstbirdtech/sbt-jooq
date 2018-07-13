import bintray.BintrayPlugin
import bintray.BintrayPlugin.autoImport._
import sbt.Keys._
import sbt._

object Publish extends AutoPlugin {

  override def requires: Plugins = BintrayPlugin
  override def trigger: PluginTrigger = allRequirements

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    bintrayOrganization := Some("firstbird"),
    bintrayPackage := "sbt-jooq",
    licenses := Seq(
      "Apache License, Version 2.0" -> url(
        "http://www.apache.org/licenses/LICENSE-2.0.html")
    ),
    pomIncludeRepository := { _ =>
      false
    }
  )

}
