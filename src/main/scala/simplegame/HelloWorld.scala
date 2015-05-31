package simplegame

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object TutorialApp extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Hello World")
    println("Hello world!")
  }
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}