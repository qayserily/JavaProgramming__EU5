package daily_videos.day44_oopreview.callcenter;

public class CallCenter {
    public static void main(String[] args) {
        Whatsapp wa = new Whatsapp();

        wa.launch();
        wa.allOSCompatible=true;
        wa.isFree=true;
        wa.name="Whatsapp";
        wa.call(" Ozzy");
        wa.sendMessage("Thank you ...");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);

        System.out.println("----------------------------------------------------------------------------------------");

        VoiceCallable obj = new Whatsapp();
       ((MessagingApp) obj).launch();
       ((MessagingApp) obj).allOSCompatible=false;
       obj.call("Mr Tom");
       ((VideoCallable)obj).videoCall();


    }
}
