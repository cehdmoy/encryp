package encript;

public class MyEncrypting {
    public String encryps(String rawMessage) {

        if (rawMessage.length() % 2 == 0) {
            return handleUntilParCase(rawMessage);
        } else {
            return handleNonPARFinalCase(rawMessage, handleUntilParCase(rawMessage));
        }

    }

    private String handleNonPARFinalCase(String rawMessage, String result) {
        int operator = determinateNonPAROperator(rawMessage);
        result += encryptCharacter(rawMessage, operator, rawMessage.length() - 1);
        return result;
    }

    private int determinateNonPAROperator(String rawMessage) {
        int operator;
        int determinateSuposedCountedIfItWereByTwo = (rawMessage.length() - 1) / 2;
        if (determinateSuposedCountedIfItWereByTwo % 2 == 0) {
            operator = +1;
        } else {
            operator = -1;
        }
        return operator;
    }

    private String encryptCharacter(String rawMessage, int operator, int i) {
        return Character.toString((char) (rawMessage.charAt(i) + operator));
    }

    private String handleUntilParCase(String rawMessage) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < rawMessage.length() / 2; i++) {
            if (i % 2 == 0) {
                makeAddOneEncryptProcess(rawMessage, stringBuilder, i);
            } else {
                makeSubstractionEncryptProcess(rawMessage, stringBuilder, i);
            }
        }
        return stringBuilder.toString();
    }

    private void makeSubstractionEncryptProcess(String rawMessage, StringBuilder stringBuilder, int i) {
        stringBuilder.append(encryptCharacter(rawMessage, -1, i * 2)).append(encryptCharacter(rawMessage, -1, i * 2 + 1));
    }

    private void makeAddOneEncryptProcess(String rawMessage, StringBuilder stringBuilder, int i) {
        stringBuilder.append(encryptCharacter(rawMessage, 1, i * 2)).append(encryptCharacter(rawMessage, 1, i * 2 + 1));
    }
}
