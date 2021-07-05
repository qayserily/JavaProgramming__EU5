package daily_videos.day44_oopreview.callcenter;

public class Whatsapp extends MessagingApp implements VideoCallable,VoiceCallable{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Whatsapp - doing video call Mr Mike ...");
    }


    public void videoCall(String msg) {

        System.out.println("Whatsapp - sending a message -" + msg + " ...");
    }

    @Override
    public void call(String contact) {
        System.out.println("Whatsapp - calling" + contact + " ...");

    }

    @Override
    public void videoCall() {

    }
}
