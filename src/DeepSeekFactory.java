public class DeepSeekFactory implements AIFactory {

    @Override
    public AbstractAITextBox createNewTextBox() {
        return new AITextBoxDeepSeek();
    }

    @Override
    public AbstractAIChat createNewChat() {
        return new DeepSeekChat();
    }

}
