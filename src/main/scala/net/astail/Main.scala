package net.astail

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import slack.rtm.SlackRtmClient
import am.ik.voicetext4j._


object Main {
  def main(args: Array[String]): Unit = {


    VoiceText
    //    val voice_text_token = ConfigFactory.load.getString("voice_text_token")
    //    val slack_token = ConfigFactory.load.getString("slack_token")
    //    val botChannel = ConfigFactory.load.getString("slack_channel")
    //    implicit val system = ActorSystem("slack")
    //    implicit val ec = system.dispatcher
    //
    //    val client = SlackRtmClient(slack_token)
    //    val selfId = client.state.self.id
    //
    //    client.onMessage { message =>
    //
    //      val channelId: String = message.channel
    //      val channel = client.state.getChannelIdForName(botChannel).getOrElse("")
    //      val user = client.state.getUserById(message.user).map(_.name).getOrElse("")
    //      voiceText(message.text)
    //    }
    //
    //
    //    def voiceText(message: String) = {
    //      println(message)
    //      System.setProperty("voicetext.apikey", voice_text_token)
    //      EmotionalSpeaker.HARUKA.ready.pitch(105).speed(105).very.happy.speak(message).get
    //    }
    //  }

  }
}