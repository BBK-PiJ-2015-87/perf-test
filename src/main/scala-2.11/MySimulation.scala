import io.gatling.core.Predef._ // 2
import io.gatling.http.Predef._
import scala.concurrent.duration._

class MySimulation extends Simulation { // 3

  val httpConf = http // 4
    .baseURL("http://localhost:8080") // 5

  val scn = scenario("BasicSimulation") // 7
    .exec(http("index request")  // 8
    .get("/")) // 9
    .pause(5) // 10

  setUp( // 11
    scn.inject(atOnceUsers(1)) // 12
  ).protocols(httpConf) // 13
}