package two_chan

import java.text.SimpleDateFormat

object ThreadDownloadLogic {
  def downloadThread(subject: String, url: String, callback: (ResVo) => Unit): Unit = {
    DownloadLogic.download(url, "Windows-31J").foreach(line => {
      //lineの構造: Name<>Mail<>Date（2011/03/26(土) 00:38:06.48） <> 中身 <> title
      val res = line.split("<>")
      val date = res(2)
      if (date != "Over 1000 Thread") {
        /*
    	  val parsedDate = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss")
          .parse(date.substring(0, 10) + date.substring(13, date.length()))
       */
        val resVo = new ResVo(subject, url, res(0), res(1), date, res(3))
        callback(resVo)
      }
    })
  }
}