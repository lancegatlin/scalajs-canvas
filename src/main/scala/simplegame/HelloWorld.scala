package simplegame

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery

import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery("body").append("<p>[message]</p>")
    println("Hello world!")
  }
//  def appendPar(targetNode: dom.Node, text: String): Unit = {
//    val parNode = document.createElement("p")
//    val textNode = document.createTextNode(text)
//    parNode.appendChild(textNode)
//    targetNode.appendChild(parNode)
//  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>[message]</p>")
  }
}