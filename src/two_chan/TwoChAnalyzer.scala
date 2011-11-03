package two_chan

object TwoChAnalyzer {
  val MAX_LENGTH = 100

  def analyze2ch(itas: List[String]): Unit = {

    var freqLength = new Array[Int](MAX_LENGTH)
    itas.foreach(i => DownloadLogic
      .download(i + "/subject.txt", "Windows-31J")
      .foreach(line => {
        val subject = line.split("<>")

        //DOSにならないようにウエイトを入れる
        Thread.sleep(60000)
        println("## " + subject(0) + "/" + subject(1))
        try {
          ThreadDownloadLogic.downloadThread(subject(1), i + "dat/" + subject(0),
            { resVo =>
              {
                ThreadDao.insertRes(resVo)
              }
            })
        } catch {
          case ex: Exception => println("err " + subject(0) + '/' + subject(1))
        } finally {
        }
      }))
  }
}