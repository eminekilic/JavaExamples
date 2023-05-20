public class Main {
    public static void main(String[] args) {
        System.out.println(isIsogram("Visual"));            //true
        System.out.println(isIsogram("Programming"));       //false
        System.out.println(isIsogram("JavA"));              //false
        System.out.println(isIsogram("uncopyrightable"));   //true
    }

    private static boolean isIsogram(String word){
        char [] characters = new char[100];
        String upperWord = word.toUpperCase();
        for (int i=0;i<upperWord.length();i++)
        {
            characters[i] = upperWord.charAt(i);
        }
        for (int i=0;i<upperWord.length();i++)
        {
            for(int j=i+1;j<upperWord.length();j++)
            if(characters[i]==characters[j])
            {
                return false;
            }

        }
        return true;



    }


}

