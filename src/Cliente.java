
class Cliente {
    private AbstractAITextBox textbox; // Fabrica para criar produto

    private AbstractAIChat chat; // outra fábrica para criar produto

    Cliente(AIFactory aiFactory) {

        textbox = aiFactory.createNewTextBox();
        chat = aiFactory.createNewChat();

    }

    void setTextbox(String name) {
        textbox.setName(name);
    }

    String getTextBox() {
        return textbox.getName();
    }

    void setChat(String name) {
        chat.setName(name);
    }

    String getChat() {
        return chat.getName();
    }

    void execute() {
        chat.interagir(textbox);
    }
}