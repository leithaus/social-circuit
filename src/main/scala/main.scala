package com.biosimilarity.coso

import ru.circumflex._, core._, web._, freemarker._
import java.util.Date

class Main extends Router {
  val log = new Logger("com.biosimilarity.coso")

  'currentDate := new Date

  //get("/test") = "I'm fine, thanks!"
  get("/test") = ftl("index.ftl")
  get("/") = redirect("index.html")

}
