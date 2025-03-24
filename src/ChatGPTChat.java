public class ChatGPTChat implements AbstractAIChat {
    private String name;

    @Override
    public void interagir(AbstractAITextBox textBox) {
        System.out.println("A mensagem " + textBox.getName() + " foi enviada no " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
