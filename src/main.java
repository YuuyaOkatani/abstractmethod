
public class main {

    public static void main(String[] args) {

        AIFactory bot = new ChatGPTFactory();
        Cliente cliente1 = new Cliente(bot);
        cliente1.setTextbox("Mensagem 1"); // Cliente vai mudar o nome do textbox
        cliente1.setChat("Assunto 1"); // Cliente vai mudar o nome do chat
        System.out.println(cliente1.getTextBox());
        System.out.println(cliente1.getChat());
        cliente1.execute();

        AIFactory bot2 = new DeepSeekFactory(); // Possui métodos para cirar um novo produto
        Cliente cliente2 = new Cliente(bot2); // O cliente irá ativar esses métodos para criar novos produtos
        cliente2.setTextbox("Mensagem 2");
        cliente2.setChat("Assunto 2");
        System.out.println(cliente2.getTextBox());
        System.out.println(cliente2.getChat());
        cliente2.execute();

    }
}