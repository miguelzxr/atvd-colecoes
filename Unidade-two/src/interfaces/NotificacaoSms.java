package interfaces;

public class NotificacaoSms implements Notificar{
    public void notificacao(){
        System.out.println("notificacao sms");
    }

    @Override
    public void notificar() {
        System.out.println("notificao por sms via interface");
    }
}
