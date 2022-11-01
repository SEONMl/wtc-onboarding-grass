package onboarding;

public class Problem4 {

    static class Transformer {
        private Problem4.AbnormalDictionary dictionary = new Problem4.AbnormalDictionary();
        private String sentence;
        private String result = "";

        public Transformer(String sentence) {
            if(sentence.length()<1 || sentence.length()>1000) {
                throw new RuntimeException("word의 길이가 올바르지 않습니다");
            }
            this.sentence = sentence;
        }

        String transform(){
            for(int i=0 ; i<sentence.length() ; i++){
                char c = sentence.charAt(i);
                c = (isAlphabet(c))? dictionary.findWord(c) : c;
                result += c;
            }
            return result;
        }

        private boolean isAlphabet(char c) {
            if(!(('a'<=c && c<='z') || ('A'<=c && c<='Z'))) {
                return false;
            }
            return true;
        }
    }


    static class AbnormalDictionary {

        private char findWord(char c) {
            int index = 'a'+'z';
            if('A'<=c && c<='Z') {
                index = 'A'+'Z';
            }

            char res = (char)(index - c);
            return res;
        }
    }

    public static String solution(String word) {
        Transformer transformer = new Transformer(word);
        return transformer.transform();
    }
}
