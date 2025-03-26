package ui.components

import com.raquo.laminar.api.L._

object DiffInput {
  def apply(userInput: Var[String]): HtmlElement = {
    div(
      h2("Enter Difflicious Output"),
      textArea(
        placeholder := "Paste Difflicious output here...",
        rows := 10,
        cols := 50,
        controlled(
          value <-- userInput,
          onInput.mapToValue --> userInput
        )
      ),
      button(
        "Submit",
        onClick --> { _ =>
          println(s"User submitted: ${userInput.now()}") // Debugging output
        }
      )
    )
  }
}
