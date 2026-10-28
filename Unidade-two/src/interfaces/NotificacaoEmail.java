package interfaces;

public class NotificacaoEmail implements Notificar {
    public void notificacao(){
        System.out.println("notificacao email");
    }

    @Override
    public void notificar() {
        System.out.println("notificao por email via interface");
    }
}
