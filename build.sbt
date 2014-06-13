name := "activator-reactive-monitor"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "org.eigengo.monitor" % "agent-akka" % "0.4-SNAPSHOT",
  "org.eigengo.monitor" % "output-statsd" % "0.4-SNAPSHOT"
)

javaOptions in run ++= Seq(
	"-javaagent:" + System.getProperty("user.home") + s"/.ivy2/cache/org.aspectj/aspectjweaver/jars/aspectjweaver-1.7.3.jar",
	"-XX:+ExtendedDTraceProbes"
)

fork in run := true

connectInput in run := true
