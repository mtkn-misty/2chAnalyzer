package two_chan

import scala.io.Source
import scala.io.Codec
import java.nio.charset.CodingErrorAction.REPLACE


object DownloadLogic {
  def download(url: String, charCode: String) = {
    implicit def codec = Codec(charCode).onUnmappableCharacter(REPLACE)
  
    //println(url)

    val subjectText = Source.fromURL(url)(codec)

    subjectText.getLines
  }
}