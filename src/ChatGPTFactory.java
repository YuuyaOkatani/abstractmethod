public class ChatGPTFactory implements AIFactory {

    @Override
    public AbstractAITextBox createNewTextBox() {
        return new AITextBoxChatGPT();
    }

    @Override
    public AbstractAIChat createNewChat() {
        return new ChatGPTChat();
    }

}
