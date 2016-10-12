name := "perf-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.2" % "test",
                            "io.gatling" % "gatling-test-framework" % "2.2.2" % "test")


enablePlugins(GatlingPlugin)
    