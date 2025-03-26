package ui.components

import com.raquo.laminar.api.L._
// import difflicious._
// import difflicious.implicits._

object DiffViewer {
  def apply(userInput: Var[String]): HtmlElement = {
    val parsedDiffs = userInput.signal.map(parseDiff) // Process input

    div(
      h2("Diff Results"),
      child <-- parsedDiffs
    )
  }

  def parseDiff(input: String): HtmlElement = {
    if (input.isEmpty) {
      div("No diff data provided.")
    } else {
      val diffs = input.split("\n\n").map { section =>
        val lines = section.split("\n")
        val title = lines.headOption.getOrElse("[Unknown]")
        val content = lines.drop(1).mkString("\n")

        div(
          h3(title, onClick --> { _ => println(s"Expanding $title") }), // Expandable title
          div(content, cls := "diff-content")
        )
      }
      div(diffs)
    }
  }
}
