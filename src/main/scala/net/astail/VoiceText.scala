package net.astail

import java.io.File
import java.net.URL

import sys.process.urlToProcess

import com.typesafe.config.ConfigFactory

object VoiceText {

    val api = "https://api.voicetext.jp/v1/tts"
    val hozon = "./dl.wav"
    val key = ConfigFactory.load.getString("voice_text_token")
    val text = "こんばんわ"
    val speaker = "hikari"
    val emotion = "happiness"
    val emotion_level = 2
    val pitch = 100
    val speed = 100

    val url = s"${api} -o ${hozon} -u ${key}: -d text=${text} -d speaker=${speaker} -d emotion=${emotion} -d emotion_level=${emotion_level} -d pitch=${pitch} -d ${speed}"

    download(url, hozon)


  def download(url: String, save: String): String = {

    println(url)
    new URL(url) #> new File(save) !!
  }

  def retry[R](f: => R, count: Int = 3): R = {
    try {
      f
    } catch {
      case _: Throwable if count > 0 =>
        retry(f, count - 1)
    }
  }
}
