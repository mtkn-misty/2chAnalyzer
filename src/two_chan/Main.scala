package two_chan

import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoOptions

object Main extends Application {

  TwoChAnalyzer.analyze2ch(List("http://hibari.2ch.net/news4vip/"));
}