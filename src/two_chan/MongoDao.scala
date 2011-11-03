package two_chan

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoOptions

/**
 * MongoDBにデータを格納するための親DAO
 * すべてのMongoDBにアクセスするDAOはこのクラスを継承する
 */
class MongoDao {

  /**
   * Mongodbの初期化
   */
  //val opt = new MongoOptions()
  //val con = MongoConnection("localhost", opt)
  //val con = MongoConnection("localhost")
  val con = MongoConnection("192.168.11.200:27017")
  val db = con("2chData")
}