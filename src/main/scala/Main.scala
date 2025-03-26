package ui

import com.raquo.laminar.api.L._
import org.scalajs.dom
import components.{DiffInput, DiffViewer}


object Main {
  def main(args: Array[String]): Unit = {
    val userInputVar = Var("")

    val app = div(
      h1("Difflicious UI"),
      DiffInput(userInputVar),
      DiffViewer(userInputVar)
    )

    render(dom.document.getElementById("app"), app)
  }
}
